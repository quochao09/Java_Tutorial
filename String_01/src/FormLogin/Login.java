package FormLogin;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Login extends User {

    Scanner inPut = new Scanner(System.in);

    // Constructor Funciton
    public Login(String userName, String passWord, double accountMoney) {
        super(userName, passWord, accountMoney);
    }

    // CheckUserName Function
    public boolean checkUser(String temp) {
          if(temp.endsWith("@gmail.com") == true){
              return true;
          }
          else{
              return false;
          }
    }

    // CheckPass Function
    public boolean CheckPass(String pass) {
        int count = 0, count1 = 0, count2 = 0;
        byte[] arrTemp = pass.getBytes();
//        for (int i = 0; i < pass.length(); i++) {
//            if (arrTemp[i] > 65 && arrTemp[i] < 90) {
//                count++;
//            } else if (arrTemp[i] > 97 && arrTemp[i] < 122) {
//                count1++;
//            } else if (arrTemp[i] > 48 && arrTemp[i] < 57) {
//                count2++;
//            }
//        }
        for (int i = 0; i < pass.length(); i++) {
            if (Character.isDigit(arrTemp[i]) == true) {
                count++;
            } else if (Character.isLowerCase(arrTemp[i]) == true) {
                count1++;
            } else if (Character.isUpperCase(arrTemp[i]) == true) {
                count2++;
            }
        }
        if (count > 0 && count1 > 0 && count2 > 0 && arrTemp.length > 8) {
            return true;
        } else {
            return false;
        }
    }

    // Access Function
    public void Access() {
        System.out.println("User Name: ");
        super.userName = inPut.nextLine();
        while(checkUser(super.userName) == false){
            System.out.println("User Name Error !");
            System.out.println("User Name: ");
            super.userName = inPut.nextLine();
        }
        
        System.out.println("Pass Word: ");
        super.passWord = inPut.nextLine();
        while (CheckPass(super.passWord) == false) {
            System.out.println("Pass Word Error !");
            System.out.println("Pass Word: ");
            super.passWord = inPut.nextLine();
        }
        System.out.println("SUCCESSFULL ACCESS !");
    }
}
