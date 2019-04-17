package JV2_S3;

public class RunThread implements Runnable {

    @Override
    public void run() {
//        try{
//            System.out.println("Dem nguoc bat dau: ");
//            for (int i=10; i>0; i--){
//                System.out.println(Thread.currentThread().getName()+" : "+i);
//                Thread.sleep(1000);
//            }
//            System.out.println("Chuc mung...");
//        } catch (Exception e) {
//            System.out.println("Loi: "+e);
//        }

        try{
            for (int i=1; i<=5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e){
            System.out.println("Loi: "+e);
        }
    }
}
