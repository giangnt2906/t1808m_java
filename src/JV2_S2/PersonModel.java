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

    public static void main(String[] args){

        // Khoi tao doi tuong danhsach1 luu kieu du lieu Student cua PersonModel
        PersonModel<Student> danhsach1 = new PersonModel<>();
        // Khoi tao doi tuong danhsach2 luu kieu du lieu Employee cua PersonModel
        PersonModel<Employee> danhsach2 = new PersonModel<>();

        // Khoi tao 2 hoc sinh bat ki va them vao doi tuong danhsach
        Student student1 = new Student("01","khanh",20);
        Student student2 = new Student("02","son",22);
        danhsach1.Them(student1);
        danhsach1.Them(student2);

        // Khoi tao 2 nhan vien bat ki va them vao doi tuong danhsach
        Employee nvien1 = new Employee("03", "thao", 190.00);
        Employee nvien2 = new Employee("04", "van", 150.75);

        danhsach2.Them(nvien1);
        danhsach2.Them(nvien2);

        // In dach sach su dung toString()
        for (Student st: danhsach1.lists){
            st.InThongTinHS();
        }
        for (Employee nv: danhsach2.lists){
            nv.InThongTinNV();
        }
    }
}
