package Session3;
import java.util.Scanner;
public class Fraction {
    private int tuso;
    private int mauso;

    //4 ham getter va setter cho "tuso" va "mauso"
    public int getTuso() {
        return tuso;
    }

    public void setTuso(int tuso) {
        this.tuso = tuso;
    }

    public int getMauso() {
        return mauso;
    }

    public void setMauso(int mauso) {
        this.mauso = mauso;
    }

    //Ham constructor khong tham so
    public Fraction(){
        this.Nhap();
    }

    //Ham constructor su dung 2 tham so truyen vao
    public Fraction(int tuso, int mauso){
        this.setTuso(tuso);
        this.setMauso(mauso);
    }

    //Nhap phan so tu ban phim
    public void Nhap(){
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap tu so roi nhap mau so:");
        this.tuso = info.nextInt();
        this.mauso = info.nextInt();
    }

    //In phan so
    public void Inps(){
        System.out.println("Phan so: "+this.tuso+"/"+this.mauso);
    }

    //Tim uoc chung lon nhat 2 so a, b
    public int UCLN(int a, int b){
        if (a==0){
            return b;
        } else {
            return this.UCLN(b%a, a);
        }
    }

    //Rut gon
    public void Rutgon(){
        int ucln = this.UCLN(this.tuso, this.mauso);
        this.tuso = this.tuso / ucln;
        this.mauso = this.mauso / ucln;
        System.out.print("Sau khi rut gon: ");
        this.Inps();
    }

    //Nghich dao
    public void Nghichdao(){
        int temp = this.tuso;
        this.tuso = this.mauso;
        this.mauso = temp;
        System.out.print("Sau khi nghich dao: ");
        this.Inps();
    }

    public static void main(String[] args){
        Fraction ps = new Fraction(15,20);
        //In phan so
        ps.Inps();
        //Rut gon
        ps.Rutgon();
        //Nghich dao
        ps.Nghichdao();
    }
}
