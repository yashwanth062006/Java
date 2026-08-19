package project_1;

public class Deadlock {

    synchronized void method1(Deadlock r) {

        System.out.println(Thread.currentThread().getName()
                + " entered method1()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()
                + " is waiting for method2()");

        r.method2();
    }

    synchronized void method2() {

        System.out.println(Thread.currentThread().getName()
                + " entered method2()");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Deadlock d1 = new Deadlock();
        Deadlock d2 = new Deadlock();

        Thread t1 = new Thread(() -> d1.method1(d2), "Thread-1");
        Thread t2 = new Thread(() -> d2.method1(d1), "Thread-2");

        t1.start();
        t2.start();
    }
}

