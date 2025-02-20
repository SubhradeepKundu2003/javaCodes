class A extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread A: "+i);
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Thread B: "+i);
        }
    }
}


public class Demo{
    public static void main(String[] args){
       A a = new A();
       B b = new B();
       a.start();
       b.start();
    }
}