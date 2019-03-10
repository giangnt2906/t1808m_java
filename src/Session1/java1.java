package Session1;

import java.util.Scanner;

public class java1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap 1 so tu ban phim:");
        int input = scanner.nextInt();
        scanner.nextLine();

        int a =0;
        if (input <= 1){
            System.out.println(input+" khong phai la so nguyen to");
        } else{
            if (input == 2){
                System.out.println("2 la so nguyen to");
            } else{
                for (int i=2; i<input; i++){
                    if (input %i ==0){
                        a++;
                    }
                }
                if (a==0){
                    System.out.println(input+" la so nguyen to");
                } else{
                    System.out.println(input+" khong la so nguyen to");
                }
            }
        }
    }

}
