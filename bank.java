public class bank {
    String name;
    int accno;
    double balance;
    void createAccount(String a,int b,double c)
    {
        name=a;
        accno=b;
        balance=c;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Amount deposited: " + amount);
    }
    void withdraw(double amount)
    {
        if(balance>=amount)
        {
            balance=balance-amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accno);
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
        bank b1 = new bank();
        b1.createAccount("Satish", 12345, 1000.0);
        b1.deposit(500.0);
        b1.withdraw(200.0);
        b1.display();
    }
    
}