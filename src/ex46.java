public class ex46 {
    public static void main(String[] args){
        IEmployee e1= new PartTimeEmployee("Hai", 16000, 4);
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary per day: " + e1.calculateSalary());
        System.out.println();
        IEmployee e2= new FullTimeEmployee("Binh", 20000);
        System.out.println("Name: " + e2.getName());
        System.out.println("Salary per day: " + e2.calculateSalary());
    }
}

interface IEmployee{
    int calculateSalary();
    String getName();
}

abstract class Employeee implements IEmployee{
    private String name;
    private int paymentPerHour;

    public Employeee(String name, int paymentPerHour){
        this.name= name;
        this.paymentPerHour= paymentPerHour;
    }

    public void setName(String name){
        this.name= name;
    }

    public void setPaymentPerHour(int paymentPerHour){
        this.paymentPerHour= paymentPerHour;
    }

    @Override
    public String getName(){
        return name;
    }

    public int getPaymentPerHour(){
        return paymentPerHour;
    }
}

class PartTimeEmployee extends Employeee{
    private int workingHours;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours){
        super(name, paymentPerHour);
        this.workingHours= workingHours;
    }

    @Override
    public int calculateSalary(){
        return getPaymentPerHour()*workingHours;
    }
}

class FullTimeEmployee extends Employeee{
    public FullTimeEmployee(String name, int paymentPerHour){
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary(){
        return 8*getPaymentPerHour();
    }
}