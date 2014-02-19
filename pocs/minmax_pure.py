
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
