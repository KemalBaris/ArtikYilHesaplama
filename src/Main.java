import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int year;
        boolean status;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Yıl Giriniz! : ");
        year = input.nextInt();
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
           status = true;
        } else {
            status = false;
        }
        if (status) {
            System.out.println(year + " bir artık yıldır ! ");
        } else {
            System.out.println(year + " bir artık yıl değildir ! ");
        }
    }
}