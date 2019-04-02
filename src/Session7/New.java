package Session7;
import java.util.ArrayList;
import java.util.Scanner;
public class New implements INew {
    private Integer ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private float AverageRate;

    public New() {
        ArrayList<Integer> RateList = new ArrayList<>();
        Scanner info = new Scanner(System.in);
        System.out.println("Nhap ID:");
        this.ID = info.nextInt();
        info.nextLine();
        System.out.println("Nhap Title:");
        this.Title = info.nextLine();
        System.out.println("Nhap Date:");
        this.PublishDate = info.nextLine();
        System.out.println("Nhap Author:");
        this.Author = info.nextLine();
        System.out.println("Nhap Diem:");
        int diem = info.nextInt();
        RateList.add(diem);
        diem = info.nextInt();
        RateList.add(diem);
        diem = info.nextInt();
        RateList.add(diem);
        for (Integer rate : RateList) {
            this.AverageRate += rate;
        }
        this.AverageRate /= RateList.size();
    }

    public void Calculate() {
        System.out.println("Sau khi tinh Average Rate: "+ID + "." + Title + "--" + Author + "--" + AverageRate + " ---- " + PublishDate);
    }

    @Override
    public void Display() {
        System.out.println("Thong tin nhap: " + ID + "." + Title + "--" + Author + " ---- " + PublishDate);
    }

    public static void main(String[] args) {
        ArrayList<New> newList = new ArrayList<>();
        ArrayList<Integer> idList = new ArrayList<>();
        while (1==1) {
            System.out.println("***Menu:");
            System.out.println("1. Nhap menu");
            System.out.println("2. In menu da nhap");
            System.out.println("3. Tinh va in diem trung binh");
            System.out.println("4. Exit");
            System.out.println("Chon chuc nang: ");
            Scanner info = new Scanner(System.in);
            int index = info.nextInt();

            if (index == 1) {
                newList.add(new New());
                int a = newList.get(newList.size()-1).ID;
                idList.add(a);
            }
            if (index == 2) {
                if (newList.size() == 0){
                    System.out.println("Chua co du lieu");
                }
                for (New nL : newList) {
                    nL.Display();
                }
            }
            if (index == 3) {
                if (newList.size() == 0){
                    System.out.println("Chua co du lieu");
                }
                for (New nL : newList) {
                    nL.Calculate();
                }
            }
            if (index == 4) {
                break;
            }
        }
    }
}
