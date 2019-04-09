package JV2_S2;

import java.util.ArrayList;

// Khai bao class PersonModel co su dung dang du lieu T bat ky
public class PersonModel<T> {

// Class PersonModel se co 1 thuoc tinh la 1 ArrayList cho phep luu dang du lieu T bat ky da khai bao
    public ArrayList<T> lists = new ArrayList<>();

// PersonModel co method Them 1 doi tuong co kieu du lieu la T. Kiem tra dang du lieu T. Neu T la Student hoac Employee thi cho them vao ArrayList cua PersonModel
    public void Them(T person){
        if (person instanceof Student){
            lists.add(person);
        } else if (person instanceof Employee){
            lists.add(person);
        }
    }

// Method Inthongtin. Chay vong lap qua toan bo ArrayList cua PersonModel, phan tu nao co dang du lieu la Student thi in kieu Student. Phan tu nao thuoc dang du lieu Employee thi in kieu theo Employee
    public void InThongTin(){
        for (T obj: lists) {
            if (obj instanceof Student){
                ((Student) obj).InThongTinHS();
            } else if (obj instanceof Employee){
                ((Employee) obj).InThongTinNV();
            }
        }
    }

    public static void main(String[] args){

        // Khoi tao doi tuong danhsach cua PersonModel
        PersonModel danhsach = new PersonModel();

        // Khoi tao 2 hoc sinh bat ki va them vao doi tuong danhsach
        Student student1 = new Student("01","khanh",20);
        Student student2 = new Student("02","son",22);
        danhsach.Them(student1);
        danhsach.Them(student2);

        // Khoi tao 2 nhan vien bat ki va them vao doi tuong danhsach
        Employee nvien1 = new Employee("03", "thao", 190.00);
        Employee nvien2 = new Employee("04", "van", 150.75);

        danhsach.Them(nvien1);
        danhsach.Them(nvien2);

        // Su dung method InThongTin cua danhsach de in toan bo thong tin cua ca Student lan Employee
        danhsach.InThongTin();
    }
}
