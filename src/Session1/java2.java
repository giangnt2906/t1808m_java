package Session1;

import java.util.Scanner;

public class java2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so tu ban phim:");
        int input = scanner.nextInt();
        scanner.nextLine();

        System.out.print(input+" so dau tien cua day fibonaci la: 1 2 3");
        int i,x=1,y=2,z=x+y;
        int count =3;
        for (i=3; count<input; i++){
            x=y;
            y=z;
            z=x+y;
            count++;
            System.out.print(" "+z);
        }
    }


}
