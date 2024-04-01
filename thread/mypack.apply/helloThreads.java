package helloThreads;

public class helloThreads extends Thread{

    private final int multThread;

    public helloThreads(int multThread){
        this.multThread = multThread;
    }
    

    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Hello the print Threads "+ multThread);
        }
    }
}
