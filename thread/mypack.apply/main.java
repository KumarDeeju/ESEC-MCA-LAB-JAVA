package helloThreads;

public class main {
    public static void main(String[] args) {
        helloThreads t1 = new helloThreads(1);
        helloThreads t2 = new helloThreads(2);

        t1.start();
        t2.start();
    }
}
