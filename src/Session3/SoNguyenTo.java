package Session3;

public class SoNguyenTo {
    private int a = 2;
    public SoNguyenTo(){

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (this.isSoNguyenTo(a) == true){
            this.a = a;
        } else {
            System.out.println(a+" khong phai so nguyen to");
        }
    }

    public SoNguyenTo(int n){
        this.setA(n);
    }

    public boolean isSoNguyenTo(int n){
        int a =0;
        if (n <= 1){
            return false;
        } else{
            if (n == 2){
                return true;
            } else{
                for (int i=2; i<n; i++){
                    if (n %i ==0){
                        a++;
                    }
                }
                if (a==0){
                    return true;
                } else{
                    return false;
                }
            }
        }
    }

    public int timSoNguyenToNext(){
        int n = this.a+1;
        while (this.isSoNguyenTo(n) == false){
            n++;
        }
        this.a = n;
        return n;
    }

    public static void main(String[] args){
        SoNguyenTo obj = new SoNguyenTo(3);
        System.out.println("So a la: "+obj.a);
        for (int i=0; i<10; i++){
            System.out.println("So NT tiep theo cua " + obj.a + " la: " + obj.timSoNguyenToNext());
        }
        //obj.setA(8);
        //System.out.println("So NT tiep theo cua "+obj.a+" la: "+obj.timSoNguyenToNext());
    }
}
