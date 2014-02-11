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

def hasFinished(b):
    for r in b:
        for c in r:
            if c==0:
                return False
    return True

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


import doctest
doctest.testmod()


board = [[0, 0, 0], [0, 0, 0], [0, 0, 0]]
history = [] #each item: player, pos
curPlayer = False
print "BEFORE"
dispBoard(board)

curPlayer = playMove(board, history, [0, 0], curPlayer)
print "FIRST"
dispBoard(board)

curPlayer = playMove(board, history, [0, 1], curPlayer)
print "SECOND"
dispBoard(board)

print "UNDO"
undoMove(board, history)
dispBoard(board)
