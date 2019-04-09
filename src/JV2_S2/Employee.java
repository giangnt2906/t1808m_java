package JV2_S2;

public class Employee {
    public String id;
    public String name;
    public Double salary;

    public Employee(String id, String name, Double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public String toString(){
        return ("Nhan vien: "+this.id+"---"+this.name+"--- luong: "+this.salary);
    }

    public void InThongTinNV(){
        System.out.println(this.toString());
    }
}
