package project_1;

public class String_builder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello"); //mutable

        sb.append(" World");       //adding element at last
        System.out.println(sb);

        sb.insert(5, " Java");    //adding element at position
        System.out.println(sb);

        sb.reverse();             //reverse the String
        System.out.println(sb);
    }
}