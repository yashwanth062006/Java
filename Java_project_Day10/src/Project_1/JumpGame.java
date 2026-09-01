package Project_1;

public class JumpGame {

    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 0, 4};

        int maxReach = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i > maxReach) {
                System.out.println("Cannot reach the end");
                return;
            }

            maxReach = Math.max(maxReach, i + arr[i]);
        }

        System.out.println("Can reach the end");
    }
}
