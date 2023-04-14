package FormLogin;

/**
 *
 * @author Admin
 */
public abstract class User {
    protected String userName;
    protected String passWord;
    protected double accountMoney;
    
    public User(String userName, String passWord, double accountMoney){
        this.userName = userName;
        this.passWord = passWord;
        this.accountMoney = accountMoney;
    }
    
    public String getUserName(){
        return this.userName;
    }
    public void setUserName(String userName){
        this.userName = userName;
    }
     public String getPassWord(){
        return this.passWord;
    }
    public void setPassWord(String passWord){
        this.passWord = passWord;
    }
    public abstract void Access();
}
