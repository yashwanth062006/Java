package Project_1;

public class merge_sort_names {



    static void mergeSort(String[] names, int left, int right) {

        if (left >= right)
            return;

        int middle = (left + right) / 2;

        mergeSort(names, left, middle);
        mergeSort(names, middle + 1, right);

        String[] temp = new String[right - left + 1];

        int i = left;
        int j = middle + 1;
        int k = 0;

        while (i <= middle && j <= right) {
            if (names[i].compareTo(names[j]) < 0)
                temp[k++] = names[i++];
            else
                temp[k++] = names[j++];
        }

        while (i <= middle)
            temp[k++] = names[i++];

        while (j <= right)
            temp[k++] = names[j++];

        for (i = left, k = 0; i <= right; i++)
            names[i] = temp[k++];
    }

    public static void main(String[] args) {

        String[] names = {"Yashwanth", "Rahul", "Anil", "Kiran", "Bharath"};

        mergeSort(names, 0, names.length - 1);

        for (String name : names)
            System.out.print(name + " ");
    }
}


