package Session2;

import java.util.Scanner;

public class Student {
    private String name;
    private String mssv;
    private int age;
    private String lop;
    private double diem;

    public void inputInfo(){
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap ten:");
        this.name = info.nextLine();

        System.out.print("Nhap tuoi: ");
        this.age = info.nextInt();
        info.nextLine();
        System.out.print("Nhap ma so sinh vien: ");
        this.mssv = info.nextLine();

        System.out.print("Nhap lop: ");
        this.lop = info.nextLine();
        System.out.print("Nhap diem: ");
        this.diem = info.nextDouble();
    }

    public void showInfo(){
        System.out.println("ten: "+name+"--tuoi: "+age+"--ma so: "+mssv+"--lop: "+lop+"--diem: "+diem);
    }

    public void hocbong(){
        if (this.diem >= 8.0){
            System.out.println("Sinh vien duoc hoc bong");
        } else {
            System.out.println("Sinh vien khong duoc hoc bong");
        }
    }

    public static void main(String[] args){
        Student obj = new Student();
        obj.inputInfo();
        obj.showInfo();
        obj.hocbong();
    }
}
