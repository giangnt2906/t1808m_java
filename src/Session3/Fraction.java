package Session3;
import java.util.Scanner;
import java.util.ArrayList;
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

    public Fraction Cong(Fraction ps1, Fraction ps2){
        int tuso = ps1.tuso*ps2.mauso + ps2.tuso*ps1.mauso;
        int mauso = ps1.mauso*ps2.mauso;
        Fraction ps3 = new Fraction(tuso, mauso);
        return ps3;
    }

    public static void main(String[] args){
        ArrayList<Fraction> arr = new ArrayList<>();
        arr.add(new Fraction(2, 10));
        arr.add(new Fraction(3, 9));
        arr.add(new Fraction(4, 6));
        arr.add(new Fraction(8, 2));
        arr.add(new Fraction(20, 15));
        for (int i=0; i<arr.size(); i++){
            arr.get(i).Rutgon();
        }
        //In phan so

        //Rut gon

        //Nghich dao

        //Fraction ps3 = ps.Cong(ps, ps1);
        //ps3.Rutgon();
    }
}
