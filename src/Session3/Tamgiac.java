package Session3;
import java.util.Scanner;
public class Tamgiac {
    private double a=3;
    private double b=4;
    private double c=5;

    //Tao constructor cho class tam giac, nhan tham so vao la do dai 3 canh a,b,c
    public Tamgiac(double a, double b, double c) {
        this.a =a;
        this.b =b;
        this.c =c;
        this.checkTg();
    }

    //Kiem tra do dai 3 canh tam giac co thoa man, neu khong yeu cau nhap lai
    public void checkTg(){
        while (this.a+this.b<=this.c || this.a+this.c<=this.b || this.c+this.b<=this.a) {
            Scanner info = new Scanner(System.in);
            System.out.println("Nhap 3 canh:");
            this.a = info.nextDouble();
            this.b = info.nextDouble();
            this.c = info.nextDouble();
        }
    }

    public double chuvi(){
        return this.a+this.b+this.c;
    }

    public double dientich(){
        double p = (this.a+this.b+this.c)/2.0;
        double a = p*(p-this.a)*(p-this.b)*(p-this.c);
        return java.lang.Math.sqrt(a);
    }

    public static void main(String[] args){
        //Tao tam giac moi, do dai 3 canh 1,2,3
        Tamgiac tg = new Tamgiac(1,2,3);
        System.out.println(tg.dientich());
    }
}
