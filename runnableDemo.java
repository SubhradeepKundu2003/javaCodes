class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread A interrupted");
        }
        System.out.println("Thread A: "+i);
    }
}
}
public class runnableDemo{
    public static void main(String[] args){
        Runnable a = new A();
        Thread t1 = new Thread(a);
        t1.start();
        for(int i=0;i<5;i++){
            System.out.println("Main Thread: "+i);
        }
    }
}