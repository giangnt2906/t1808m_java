package JV2_S2;

public class Student {
    public String id;
    public String name;
    public Integer age;

    public Student(String id, String name, Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return ("Hoc sinh: "+this.id+"---"+this.name+"--- tuoi: "+this.age);
    }

    public void InThongTinHS(){
        System.out.println(this.toString());
    }
}
