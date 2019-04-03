package Test;

import java.util.Scanner;
import java.util.ArrayList;

public class Hotel {
    private String name;
    private String location;
    private String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.setName(name);
        this.setLocation(location);
        this.setOwnerName(ownerName);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void KetQua(){
        System.out.println("Hotel:"+this.getName()+" ---- "+this.getLocation()+" of "+this.getOwnerName());
    }

    public static void main(String[] args){
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (int i=0; i<10; i++){
            hotels.add(new Hotel());
        }

        int j=1;
        for(Hotel ht: hotels){
            System.out.println("Input for hotel "+j+" :");
            Scanner info = new Scanner(System.in);
            System.out.println("Input hotel name:");
            ht.setName(info.nextLine());

            System.out.print("Input owner's name: ");
            ht.setOwnerName(info.nextLine());

            System.out.print("Input location: ");
            ht.setLocation(info.nextLine());
            j++;
        }

        System.out.println("Search with owner name: ");
        Scanner search = new Scanner(System.in);
        String str = search.nextLine();
        for (Hotel ht: hotels){
            if (ht.getOwnerName().equalsIgnoreCase(str)){
                ht.KetQua();
            }
        }
    }
}
