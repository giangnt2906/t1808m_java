package Session6;
import java.util.ArrayList;
public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList = new ArrayList<>();

    @Override
    public void insertPhone(String name, String phone) {

        int option = 0;
        int index = 0;
        if (this.PhoneList.size() == 0) {
            this.PhoneList.add(new PhoneNumber(name, phone));
        } else {
            for (int i =0; i<this.PhoneList.size(); i++){
                if (this.PhoneList.get(i).getName().equals(name)){
                    for (int j=0; j<this.PhoneList.get(i).getOldPhone().size(); j++){
                        if (this.PhoneList.get(i).getOldPhone(j).equals(phone)){
                            System.out.println("Da co nguoi ten "+name+" voi sdt "+phone+" ton tai");
                            return;
                        }
                    }
                    option = 1;
                    index = this.PhoneList.indexOf(this.PhoneList.get(i));
                }
            }

            if (option == 0){
                this.PhoneList.add(new PhoneNumber(name, phone));
            } else {
                this.PhoneList.get(index).setPhone(phone);
            }
        }

        /*
        for (PhoneNumber PN:this.PhoneList){
            if(PN.name.equals(name)){
                if(PN.phone.equals(phone)){
                    System.out.println("SDT da ton tai");
                    return;
                }
                PN.phone += " : "+phone;
                System.out.println("Da noi 2 so: "+PN.phone);
                return;
            }
        }
        this.PhoneList.add(new PhoneNumber(name, phone));
        System.out.println("Da them thanh cong ");
        */
    }

    @Override
    public void removePhone(String name) {
        for (int i=0; i<PhoneList.size(); i++){
            if (PhoneList.get(i).getName().equals(name)){
                PhoneList.remove(PhoneList.get(i));
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        int index;
        for (int i=0; i<PhoneList.size(); i++){
            if (PhoneList.get(i).getName().equals(name)){
                index = PhoneList.indexOf(PhoneList.get(i));
                PhoneList.set(index, new PhoneNumber(name, newphone));
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber PN:this.PhoneList){
            if (PN.name.equals(name)){
                System.out.println("ten: "+PN.getName()+" ---- "+PN.getPhone());
            }
        }
    }

    @Override
    public void sort() {

    }

    public static void main (String[] args){
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.insertPhone("giang", "0123");
        phoneBook1.insertPhone("giang", "0123");
        phoneBook1.insertPhone("giang", "1234");
        //phoneBook1.insertPhone("khanh", "01");
        //phoneBook1.insertPhone("khanh", "02");
        //phoneBook1.updatePhone("giang", "01");
        //phoneBook1.removePhone("giang");
        phoneBook1.searchPhone("giang");
    }
}
