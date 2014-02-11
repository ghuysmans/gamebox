"""
Demo implementation of the MinMax algorithm.
By Guillaume Huysmans and Mathieu Leclerq, 2014.
"""

#pieces
#0=empty
#1=Ow
#2=X

#players
#False=first, IA, plays with Ow
#True=second, HU, plays with X


def dispBoard(b):
    for r in b:
        for c in r:
            #print c,
            if c==0: d='-'
            elif c==1: d='O'
            else: d='X'
            print d,
        print

def getScore(b, c):
    """
    Computes a score for the IA (!): 0=draw, -1=lost, 1=won.
    Several test cases:

    Draw: the board is empty
    >>> getScore([[0, 0, 0], [0, 0, 0], [0, 0, 0]], 3)
    0

    IA wins (first row)
    >>> getScore([[1, 1, 1], [0, 0, 0], [0, 0, 0]], 3)
    1

    IA wins (second row)
    >>> getScore([[0, 0, 0], [1, 1, 1], [0, 0, 0]], 3)
    1

    IA wins (second column) - FAILS
    >>> getScore([[1, 1, 0], [1, 1, 0], [2, 1, 0]], 3)
    1

    Player wins (third column) - FAILS
    >>> getScore([[0, 0, 2], [0, 0, 2], [0, 0, 2]], 3)
    -1

    Player wins (third row), 2 not 3
    >>> getScore([[0, 0, 0], [0, 1, 0], [2, 2, 0]], 2)
    -1

    IA wins (first column)
    >>> getScore([[1, 0, 0], [1, 0, 0], [1, 0, 0]], 3)
    1
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
                if v==1: return 1
                elif v==2: return -1
                else: pass #empty!!
    #vertical
    for x in range(len(b)): #let's assume it's a square
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
                if v==1: return 1
                elif v==2: return -1
                else: pass #empty!!
    #diagonal (?)
    pass #FIXME pain in the ass...
    
    #nobody has won, so...
    return 0 #draw

def hasFinished(b):
    #if any player has won, it's finished.
    score = getScore(board, 3)
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

def iaMax(b, h, p):
    #leaf? (a player has won)
    score = getScore(b, 3)
    if score != 0: return score
    #part 2: testing possible moves (if any)
    mvs = possibleMoves(b)
    if len(mvs)==0:
        return score
    else:
        M = -2 #fake max score, will be replaced by a real one
        for mv in mvs:
            playMove(b, h, mv, p)
            v = iaMin(b, h, not p)
            undoMove(b, h)
            M = max(v, M) #take the best move
        return M

def iaMin(b, h, p):
    #leaf? (a player has won)
    score = getScore(b, 3)
    if score != 0: return score
    #part 2: testing possible moves (if any)
    mvs = possibleMoves(b)
    if len(mvs)==0:
        return score
    else:
        M = 2 #fake min score, will be replaced by a real one
        for mv in mvs:
            playMove(b, h, mv, p)
            v = iaMax(b, h, not p)
            undoMove(b, h)
            M = min(v, M) #take the best move
        return M

def minMax(b, h, p):
    #M contains a fake max score: it will be replaced by the first possb move.
    M = -2 #Mc doesn't need to be initialized
    mvs = possibleMoves(b)
    for mv in mvs:
        playMove(b, h, mv, p)
        v = iaMin(b, h, not p)
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
history = [] #each item: player, pos
curPlayer = False

while not hasFinished(board):
    inv = True
    while inv:
        x = int(raw_input("X coordinate "))
        y = int(raw_input("Y coordinate "))
        if board[y][x] == 0: 
            inv = False #valid input
    curPlayer = playMove(board, history, [y, x], curPlayer)
    if hasFinished(board): break
    computedMove = minMax(board, history, False)
    curPlayer = playMove(board, history, computedMove, curPlayer)
    dispBoard(board)
    print "..."
    print

dispBoard(board)
print "FINISHED."
