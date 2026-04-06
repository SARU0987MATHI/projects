import java.util.*;
public class BD{
    double bal;
    String name;
    String accNo;
    void create(String name,String acc,double b){
        this.name=name;
        this.accNo=acc;
        this.bal=b;
    }
    double deposit(double amount){
        return bal+=amount;
    }
    double withdraw(double amount){
        if(bal>0){
            bal-=amount;
            return bal;
        }
        return 0;
    }
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNo);
        System.out.println("Available Balance: " + bal);
    }
    public static void main(String args[]){
        BD obj=new BD();
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String acc=sc.nextLine();
        double balance=sc.nextDouble();
        sc.nextLine();
        obj.create(name,acc,balance);
        System.out.print("Enter the amount to deposit: ");
        double dep=sc.nextDouble();
        obj.deposit(dep);
        obj.display();
        System.out.print("Enter the amount to withdraw: ");
        double wd=sc.nextDouble();
        obj.withdraw(wd);
        obj.display();
        sc.close();
    }
}