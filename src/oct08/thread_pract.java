package oct08;

//through a runnable interface
public class thread_pract implements Runnable {
    static int threadcount=0;
    public void run(){
        System.out.println("starting a thread.."+threadcount);
    }
    public static void main(String[] args){
        thread_pract objt=new thread_pract();
        Thread thread1=new Thread(objt);
        Thread thread2=new Thread(objt);
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



//by extending thread class
//public class thread_pract extends Thread {
//    static int threadcount=0;
//    public void run(){
//       System.out.println("starting a thread.."+threadcount);
//    }
//    public static void main(String[] args){
//        thread_pract thread1=new thread_pract();
//        thread_pract thread2=new thread_pract();
//        try{
//            thread1.start();
//            while(thread1.isAlive()){
//
//            }
//            threadcount++;
//            thread2.start();
//        }catch(Exception e){
//            System.out.println(e);
//        }
//
//    }
//}
