package FormLogin;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class AddAccountMoney extends User{
    Scanner inPut = new Scanner(System.in);
    double x;
    public AddAccountMoney(String userName, String passWord, double accountMoney) {
        super(userName, passWord, accountMoney);
    }
    
    @Override
    public void Access() {
        return ; 
    }
    
    public void addMoney(){
        System.out.println("So tien nap: ");
        x = inPut.nextDouble();
        super.accountMoney += x;
        System.out.println("So du tai khoan: " + super.accountMoney);
    }
}
