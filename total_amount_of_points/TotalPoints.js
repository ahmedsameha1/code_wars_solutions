function points(games) {
    let points = 0;
    for ( s of games) {
        let resultString = s.split(":");
        let we = parseInt(resultString[0]);
        let they = parseInt(resultString[1]);
        if (we > they) points += 3;
        else if ( we === they) points += 1;
    }
    return points
}
console.log(points(["3:1", "3:3", "1:3"]));
