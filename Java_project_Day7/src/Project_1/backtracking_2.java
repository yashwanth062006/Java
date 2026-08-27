package Project_1;


public class backtracking_2 {

    static String correctpassword = "99023";

    static void trypassword(String password) {

        System.out.println("Trying: " + password);

        if (password.equals(correctpassword)) {
            System.out.println("Password found: " + password);
            return;
        }

        System.out.println("Wrong password. Go back and try another.");
    }

    public static void main(String[] args) {

        String[] passwords = {
            "99024",
            "99032",
            "89021",
            "99024",
            "99023"
        };

        for (String password : passwords) {
            trypassword(password);

            if (password.equals(correctpassword)) {
                break;
            }
        }
    }
}
