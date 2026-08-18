package project_1;

interface Atm {
    void depo();
}

interface Atm1 {
    void min();
}

public class demo implements Atm, Atm1 {

    public void depo() {
        System.out.println("dep");
    }

    public void min() {
        System.out.println("min");
    }

    public static void main(String[] args) {

        demo v = new demo();

        v.min();
        v.depo();
    }
}