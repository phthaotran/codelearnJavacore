public class ex44 {
    public static void main(String[] args){
        Persons p1= new Employees("Viet", "Ha Noi", 1200);
        p1.display();
        System.out.println();
        Persons p2= new Customer("An", "Thai Nguyen", 2500);
        p2.display();
    }
}

abstract class Persons{
    private String name;
    private String address;

    public Persons (String name, String address){
        this.name= name;
        this.address= address;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setAddress(String address){
        this.address= address;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public abstract void display();
}

class Employees extends Persons{
    private int salary;

    public Employees(String name, String address, int salary){
        super(name, address);
        this.salary= salary;
    }

    @Override
    public void display(){
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + salary);
    }
}

class Customer extends Persons{
    private int balance;

    public Customer(String name, String address, int balance){
        super(name, address);
        this.balance= balance;
    }

    @Override
    public void display(){
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer balance: " + balance);
    }
}
