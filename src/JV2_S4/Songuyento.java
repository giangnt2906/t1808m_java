package JV2_S4;

public class Songuyento {
    public int x=1;
    public synchronized boolean SNT(int n){
        for (int i=2; i<n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public synchronized int SNTnext(){
            do {
                this.x++;
            } while (!SNT(this.x));
            System.out.println(Thread.currentThread().getName()+" : "+this.x);
            return this.x;
    }

    public static void main(String[] args){
        System.out.println("SNT tiep theo:");
//        Songuyento snt = new Songuyento();
//        Runnable r1 = new Runnable() {
//            @Override
//            public void run() {
//                for (int i=0; i<20; i++){
//                    snt.SNTnext();
//                }
//            }
//        };
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r1);
//        t1.start();
//        t2.start();

    }
}
