
package day_12;

public class LPS {

    public static void main(String[] args) {

        String pattern = "ABAB";

        int[] lps = new int[pattern.length()];

        int j = 0;

        for (int i = 1; i < pattern.length(); i++) {

            if (pattern.charAt(i) == pattern.charAt(j)) {

                j++;
                lps[i] = j;

            } else {

                lps[i] = 0;
            }
        }

        for (int i = 0; i < lps.length; i++) {
            System.out.print(lps[i] + " ");
        }
    }
}
