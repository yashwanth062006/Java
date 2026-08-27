package Project_1;

public class code_BS_names {

    public static void main(String[] args) {

        String[] names = {
            "Manu", "Manu", "Kumar", "Kumar",
            "Rajeev", "Rajeev", "Rajeev", "Ram"
        };

        String target = "Rajeev";

        int first = -1;
        int last = -1;

        int start = 0;
        int end = names.length - 1;

       
        while (start <= end) {

            int mid = (start + end) / 2;

            if (names[mid].equals(target)) {

                first = mid;
                end = mid - 1;       
            }
            else if (names[mid].compareTo(target) < 0) {

                start = mid + 1;     
            }
            else {

                end = mid - 1;
            }
        }

        start = 0;
        end = names.length - 1;

        
        while (start <= end) {

            int mid = (start + end) / 2;

            if (names[mid].equals(target)) {

                last = mid;
                start = mid + 1;   
            }
            else if (names[mid].compareTo(target) < 0) {

                start = mid + 1;
            }
            else {

                end = mid - 1;
            }
        }

        System.out.println("First = " + first);
        System.out.println("Last = " + last);
    }
}