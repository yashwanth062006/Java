
package day_12;

public class RabinKarp {

    static void search(String text, String pattern) {

        int n = text.length();
        int m = pattern.length();

        int patternHash = 0;
        int textHash = 0;

        for (int i = 0; i < m; i++) {
            patternHash += pattern.charAt(i);
            textHash += text.charAt(i);
        }

        for (int i = 0; i <= n - m; i++) {

            if (patternHash == textHash) {

                boolean match = true;

                for (int j = 0; j < m; j++) {

                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    System.out.println("Pattern found at index " + i);
                }
            }

            if (i < n - m) {
                textHash = textHash
                        - text.charAt(i)
                        + text.charAt(i + m);
            }
        }
    }

    public static void main(String[] args) {

        String text = "ABCDAB";

        String pattern = "CD";

        search(text, pattern);
    }
}


