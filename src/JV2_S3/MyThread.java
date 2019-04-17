package JV2_S3;

public class MyThread extends Thread {

//    public void run(){
//        try {
//            for (int i = 1; i <= 10; i++) {
//                System.out.println(i * 2);
//            }
//        } catch (Exception e){
//            System.out.println("Exception "+e);
//        }
//    }

    public static void main(String[] args){
//        MyThread thr = new MyThread();
//        thr.start();
//        System.out.println("Sub 1: "+thr.getName());
//        thr.setName("myJavaThread");
//        System.out.println("Sub 1: "+thr.getName());
//        System.out.println("Main: "+Thread.currentThread().getName());

        RunThread r1 = new RunThread();
        Thread thr1 = new Thread(r1);
        Thread thr2 = new Thread(r1);
        Thread thr3 = new Thread(r1);
        thr1.start();
        thr2.start();
        thr3.start();
    }
}
