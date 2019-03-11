package Session2;

import java.util.Scanner;

public class class_Nhanvien {
    private String name;
    private int age;
    private String address;
    private double luong;
    private int gio;

    public void inputInfo(){
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap ten:");
        this.name = info.nextLine();

        System.out.print("Nhap tuoi: ");
        this.age = info.nextInt();
        info.nextLine();
        System.out.print("Nhap dia chi: ");
        this.address = info.nextLine();
        info.nextLine();
        System.out.print("Nhap luong: ");
        this.luong = info.nextDouble();
        System.out.print("Nhap tong gio lam: ");
        this.gio = info.nextInt();
    }
    public void outputInfo(){
        System.out.println("Nhan vien ten " + name+", "+age+" tuoi, "+"dia chi: "+address+", luong: "+luong+", tong gio lam: "+gio);
    }

    public double tinhThuong(){
        if (this.gio >= 200){
            return luong*0.2;
        }
        else if (this.gio<200 && this.gio>=100){
            return luong*0.1;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args){
        class_Nhanvien obj = new class_Nhanvien();
        obj.inputInfo();
        obj.outputInfo();
        double thuong = obj.tinhThuong();
        System.out.println("Tien thuong nhan vien: "+thuong);
    }
}
