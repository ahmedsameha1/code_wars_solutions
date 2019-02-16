def points(games):
    points = 0
    for i in games:
        resultString = i.split(":")
        we = int(resultString[0])
        they = int(resultString[1])
        if we > they:
            points += 3
        elif we == they:
            points += 1
    return points
print(points(["3:1", "3:3", "1:3"]))
