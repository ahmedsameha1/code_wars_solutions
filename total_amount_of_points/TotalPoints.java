public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;
        for (String s: games) {
            String[] resultString = s.split(":");
            int we = Integer.valueOf(resultString[0]);
            int they = Integer.valueOf(resultString[1]);
            if (we > they) points += 3;
            else if ( we == they) points += 1;
        }
        return points;
    }
    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:1", "3:1", "1:3"}));
    }
}
