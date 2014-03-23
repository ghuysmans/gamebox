"""
Demo implementation of the NegaMax algorithm.
By Guillaume Huysmans and Mathieu Leclerq, 2014.
"""

#pieces
#0=empty
#1=Ow
#2=X

#players
#False=first, IA, plays with Ow
#True=second, HU, plays with X

MAX_RECURSION = 5


def dispBoard(b, rec=0):
    pre = "\t"*rec
    for r in b:
        rs = ""
        for c in r:
            #print c,
            if c==0: d='-'
            elif c==1: d='O'
            else: d='X'
            rs += d
        print pre+rs

def getScore(b, c, p):
    """
    Computes a score: 0=draw, -1=lost, 1=won.
    Several test cases:

    Draw: the board is empty
    >>> getScore([[0, 0, 0], [0, 0, 0], [0, 0, 0]], 3, False)
    0

    IA wins (first row)
    >>> getScore([[1, 1, 1], [0, 0, 0], [0, 0, 0]], 3, False)
    1

    IA wins (second row)
    >>> getScore([[0, 0, 0], [1, 1, 1], [0, 0, 0]], 3, False)
    1

    IA wins (second column)
    >>> getScore([[1, 1, 0], [1, 1, 0], [2, 1, 0]], 3, False)
    1

    Player wins (third column)
    >>> getScore([[0, 0, 2], [0, 0, 2], [0, 0, 2]], 3, True)
    1

    Player wins (third row), 2 not 3
    >>> getScore([[0, 0, 0], [0, 1, 0], [2, 2, 0]], 2, False)
    -1

    Player wins (third row), 2 not 3
    >>> getScore([[0, 0, 0], [0, 1, 0], [2, 2, 0]], 2, True)
    1

    IA wins (first column)
    >>> getScore([[1, 0, 0], [1, 0, 0], [1, 0, 0]], 3, False)
    1

    IA wins (diagonal)
    >>> getScore([[1, 0, 0], [0, 1, 0], [0, 0, 1]], 3, False)
    1

    Nobody wins (failed IA diagonal)
    >>> getScore([[2, 0, 0], [0, 2, 0], [0, 0, 1]], 3, True)
    0

    Nobody wins (failed IA diagonal)
    >>> getScore([[0, 0, 1], [0, 2, 0], [1, 0, 1]], 3, False)
    0

    Nobody wins (incomplete IA diagonal)
    >>> getScore([[0, 0, 0], [0, 1, 0], [0, 0, 1]], 3, False)
    0

    IA wins (diagonal)
    >>> getScore([[0, 0, 1], [0, 1, 0], [1, 0, 1]], 3, False)
    1

    Nobody wins (incomplete player diagonal)
    >>> getScore([[0, 0, 0], [0, 2, 0], [2, 0, 0]], 3, True)
    0

    Player wins (diagonal)
    >>> getScore([[2, 0, 0], [0, 2, 0], [0, 0, 2]], 3, True)
    1

    Player wins (diagonal)
    >>> getScore([[2, 0, 0], [0, 2, 0], [0, 0, 2]], 3, False)
    -1
    
    IA wins (diagonal)
    >>> getScore([[0,0,0,0,0,0,1], [0,0,0,0,0,1,0], [0,0,0,0,1,0,0], [0,0,0,0,0,0,0]], 3, False)
    1
    
    Player wins (diagonal)
    >>> getScore([[0,0,0,0,0,0,0], [0,2,1,0,0,0,0], [0,2,2,0,0,0,0], [1,0,0,2,0,0,0]], 3, True)
    1

    IA wins (horizontal)
    >>> getScore([[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0], [0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,2,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]], 3, False)
    1

    IA wins (diagonal)
    >>> getScore([[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0], [0,0,0,0,0,2,0,0,0,0,0,0,1,0,0,0], [0,0,0,0,1,2,2,2,0,0,0,0,0,1,0,0], [0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0], [0,0,2,0,0,0,0,0,0,0,0,0,0,2,0,1], [0,1,0,0,0,0,0,0,0,0,0,0,0,0,2,0], [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2]], 4, False)
    1

    Old bug (nobody wins)
    >>> getScore([[1, 1, 2], [1, 2, 2], [0, 0, 1]], 3, True)
    0
    """
    #horizontal
    for r in b:
        #for each start cell,
        for x in range(len(r)-c+1):
            v = r[x]
            skip = False
            for y in range(x+1, x+c):
                if v != r[y]:
                    skip = True
                    break
            if skip:
                #it doesn't match completely,
                #try another one
                pass
            else:
                #found!
                if v==1: return -1 if p else 1
                elif v==2: return 1 if p else -1
                else: pass #empty!!
    #vertical
    for x in range(len(b[0])):
        #for each start row,
        for y in range(len(b)-c+1):
            v = b[y][x]
            #print "at %d:%d, start is %d" % (y, x, v)
            skip = False
            for z in range(y+1, y+c):
                #print "at %d:%d, check %d against %d" % (z, x, v, b[z][y])
                if v != b[z][x]:
                    skip = True
                    break
            if skip:
                #it doesn't match completely,
                #try another one
                pass
            else:
                #found!
                if v==1: return -1 if p else 1
                elif v==2: return 1 if p else -1
                else: pass #empty!!
    #diagonal, down
    for y in range(len(b)-c+1):
        for x in range(len(b[y])-c+1):
            v = b[y][x] #first
            skip = False
            for o in range(1, c):
                if v != b[y+o][x+o]:
                    skip = True
                    break
            if skip:
                #no match
                pass
            else:
                #found!
                if v==1: return -1 if p else 1
                elif v==2: return 1 if p else -1
                else: pass #empty!!
    #diagonal, up
    for y in range(c-1, len(b)):
        for x in range(len(b[y])-c+1):
            v = b[y][x] #first
            skip = False
            for o in range(1, c):
                if v != b[y-o][x+o]:
                    skip = True
                    break
            if skip:
                #no match
                pass
            else:
                #found!
                if v==1: return -1 if p else 1
                elif v==2: return 1 if p else -1
                else: pass #empty!!
    #nobody has won, so...
    return 0 #draw
"""
FIXME BUG

O--
---
---
...
Move? (AZE/QSD/WXC) d
OO-
--X
---
...
Move? (AZE/QSD/WXC) e
OOX
--X
--O
...
Move? (AZE/QSD/WXC) s
OOX
OXX
--O
...
FINISHED.
IA won!
OOX
OXX
--O
"""

def hasFinished(b):
    #if any player has won (the first one, for example), it's finished.
    score = getScore(board, 3, False)
    if score != 0: return True
    #else, let's see whether the board is full
    for r in b:
        for c in r:
            if c==0:
                return False
    return True

def playMove(b, h, m, p):
    #m[0] = row, m[1] = column
    h.append([p, m])
    v = 1 if p==False else 2
    b[m[0]][m[1]] = v
    return not p

def undoMove(b, h):
    x = h.pop()
    p = x[1]
    b[p[0]][p[1]] = 0

def possibleMoves(b):
    ret = [] #empty array to be filled
    for i, r in enumerate(b):
        for j, c in enumerate(r):
            if c==0:
                ret.append([i, j])
    return ret

def negaMax(b, h, p, rec=0):
    #leaf? (a player has won)
    score = getScore(b, 3, p)
    if score!=0 or rec==MAX_RECURSION:
        return score
    #part 2: testing possible moves (if any)
    mvs = possibleMoves(b)
    if len(mvs)==0:
        return score
    else:
        M = -2 #fake max score, will be replaced by a real one
        for mv in mvs:
            playMove(b, h, mv, p)
            v = -negaMax(b, h, not p, rec+1)
            undoMove(b, h)
            M = max(v, M) #take the best move
        return M

def getBestMove(b, h, p):
    #M contains a fake max score: it will be replaced by the first possb move.
    M = -2 #Mc doesn't need to be initialized
    poss = possibleMoves(b)
    if len(poss)==0: return False #can't play anything
    for mv in poss:
        playMove(b, h, mv, p)
        v = -negaMax(b, h, not p, 1) #1 for indentation
        #TODO test with the other player
        undoMove(b, h)
        if v>M:
            #better...
            M = v
            Mc = mv
    return Mc


#basic tests...
import doctest
doctest.testmod()


board = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
#board = [[2, 0, 1], [0, 2, 0], [2, 1, 1]]
shortcuts = {   'a': [0,0], 'z': [1,0], 'e': [2,0], 
                'q': [0,1], 's': [1,1], 'd': [2,1], 
                'w': [0,2], 'x': [1,2], 'c': [2,2]
            }
history = [] #each item: player, pos
curPlayer = False
#curPlayer = playMove(board, history, [0, 0], curPlayer)
#dispBoard(board)

while not hasFinished(board):
    computedMove = getBestMove(board, history, curPlayer)
    curPlayer = playMove(board, history, computedMove, curPlayer)
    dispBoard(board)
    print "..."
    if hasFinished(board): break
    inv = True
    while inv:
        try:
            key = raw_input("Move? (AZE/QSD/WXC) ")
            x = shortcuts[key][0]
            y = shortcuts[key][1]
            #FIXME play should forbid piece replacing!
            if board[y][x] == 0:
                inv = False
        except:
            pass
    curPlayer = playMove(board, history, [y, x], curPlayer)

print "FINISHED."
score = getScore(board, 3, False)
if score==-1:
    print "You won!"
elif score==0:
    print "Draw."
else:
    print "IA won!"
dispBoard(board)
