package FormLogin;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Main {

    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        int choice = 0;
        double x;
        System.out.println("GAME CHAN LE:");
        Login user1 = new Login(null, null, 0);
        user1.Access();

        // Chức năng
        System.out.println("1. Nap tien");
        System.out.println("2. Rut tien");
        System.out.println("3. Tiep tuc Game");
        System.out.println("0. Exit !");

        do {
            System.out.println("Vui long nhap lua chon: ");
            choice = inPut.nextInt();
            if (choice == 1) {
                System.out.println("So tien nap: ");
                x = inPut.nextDouble();
                user1.accountMoney += x;
                System.out.println("So du tai khoan: " + user1.accountMoney);
            } else if (choice == 2) {
                System.out.println("So tien can rut: ");
                x = inPut.nextDouble();
                user1.accountMoney -= x;
                System.out.println("So du tai khoan: " + user1.accountMoney);
            } else if (choice == 3) {
                int select = 0;
                double money = 0;
                Random values = new Random();
                int result = values.nextInt(10);
                if (result % 2 == 0) {
                    result = 2;
                } else {
                    result = 1;
                }
                System.out.println("1. Le & 2. Chan ");
                System.out.println("Vui long chon Chan or Le: ");
                select = inPut.nextInt();
                while (select != 1 && select != 2) {
                    System.out.println("Vui long chon lai Chan or Le: ");
                    select = inPut.nextInt();
                }
                System.out.println("So tien cuoc: ");
                money = inPut.nextDouble();
                if (result == 1) {
                    System.out.println("Ket qua: Le");
                } else if (result == 2) {
                    System.out.println("Ket qua: Chan");
                }
                if (select == result) {
                    System.out.println("Congratulations !");
                    user1.accountMoney += money;
                } else {
                    user1.accountMoney -= money;
                    System.out.println("Ban da chon sai !");
                }
            }
        }while (choice != 0);
    }
}
