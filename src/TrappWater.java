public class TrappWater {
    public static int CalculateTrapWater(int height[]) {
        int n = height.length;

        // calculate left max -- array
        int leftMaxArray[] = new int[n];
        leftMaxArray[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMaxArray[i] = Math.max(height[i], leftMaxArray[i - 1]);
        }
        // calculate right max -- array
        int rihgtMaxArray[] = new int[n];
        rihgtMaxArray[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rihgtMaxArray[i] = Math.max(height[i], rihgtMaxArray[i + 1]);
        }
        int trappWater = 0;

        for (int i = 0; i < n; i++) {
            // water level -min(letfmax,rightmax)
            int waterlevel = Math.min(leftMaxArray[i], rihgtMaxArray[i]);
            // trapp water -- (waterlevel -height)
            trappWater += waterlevel - height[i];
        }

        return trappWater;

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(CalculateTrapWater(height));
    }
}
