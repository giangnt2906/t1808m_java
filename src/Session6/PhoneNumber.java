package Session6;
import java.util.ArrayList;
public class PhoneNumber {
    public String name;
    public String phone;
    public ArrayList<String> oldPhone = new ArrayList<>();

    public PhoneNumber(String name, String phone){
        this.name = name;
        this.phone = phone;
        oldPhone.add(phone);
    }

    public ArrayList getOldPhone(){
        return oldPhone;
    }

    public String getOldPhone(Integer index){
        return getOldPhone().get(index).toString();
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = this.phone+" : "+phone;
        oldPhone.add(phone);
    }
}
