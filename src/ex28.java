public class ex28 {
    public static void main(String[] args){
        Account account1 = new Account(1000, "Tuan", 2000);
        account1.display();
        account1.withdraw(2100);
        account1.deposit(600);
        System.out.println("Balance: " + account1.getBalance());
        account1.withdraw(2100);
        System.out.println("Balance: " + account1.getBalance());
        account1.display();
    }
}

class Account{
    private int id;
    private String name;
    private int balance=0;

    public Account(int id, String name){
        this.id= id;
        this.name= name;
    }

    public Account(int id, String name, int balance){
        this.id= id;
        this.name= name;
        this.balance= balance;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        if (amount > balance) System.out.println("That amount exceeds your current balance");
        else balance-=amount;
    }

    public void display(){
        System.out.println("Id: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Balance: " + getBalance());
    }
}