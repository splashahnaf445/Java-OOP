public class BankAccount {
    public String name;
    private String account_id;
    private double balance;
    BankAccount(String name,double balance,
                String gender){
        this.name=name;
        this.balance=balance;
        this.account_id=gender+"-"+name;
    }
//Add necessary codes here
    public String getid(){
        return account_id;
    }
    public double Balance(){
        return balance;
    }
}

