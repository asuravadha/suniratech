package oct08;

public class thread_pract extends Thread {
    static int threadcount=0;
    public void run(){
       System.out.println("starting a thread.."+threadcount);
    }
    public static void main(String[] args){
        thread_pract thread1=new thread_pract();
        thread_pract thread2=new thread_pract();
        try{
            thread1.start();
            while(thread1.isAlive()){

            }
            threadcount++;
            thread2.start();
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
