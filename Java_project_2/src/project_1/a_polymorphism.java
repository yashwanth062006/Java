package project_1;

public class a_polymorphism {

    
    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static class Parents {

        void property() {
            System.out.println("Property");
        }

        void marry() {
            System.out.println("Family selected girl/boy");
        }
    }

    static class poly_2a extends Parents {

        void marry() {
            System.out.println("Campus selected girl/boy");
        }
    }

    public static void main(String[] args) {

        a_polymorphism p1 = new a_polymorphism();

        poly_2a p2 = new poly_2a();

        p1.add(5, 2);
        p1.add(3, 7, 5);

        p2.marry();
        p2.property();
    }
}


