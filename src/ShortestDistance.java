
public class ShortestDistance {

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            switch (dir) {
                case 'E':
                    x++;

                    break;
                case 'W':
                    x--;

                    break;
                case 'N':
                    y++;

                    break;
                case 'S':
                    y--;

                    break;

                default:
                    break;
            }

        }
        int X = x * x;
        int Y = y * y;

        return (float) Math.sqrt(X + Y);
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
}