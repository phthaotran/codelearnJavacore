public class ex32 {
    public static void main(String[] args){
        Studentt s1= new Studentt("Thao", "Female", 1500);
        s1.display();
        s1.setName("An");
        s1.setGender("Male");
        s1.setSalary(2000);
        s1.display();
    }
}

class Personn{
    private String name;
    private String gender;

    public Personn(String name, String gender){
        this.name= name;
        this.gender= gender;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender= gender;
    }

    public String getGender(){
        return gender;
    }

    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + getGender());
    }
}

class Studentt extends Personn{
    private int salary;

    public Studentt(String name, String gender, int salary){
        super(name,gender);
        this.salary= salary;
    }

    public void setSalary(int salary){
        this.salary= salary;
    }

    public int getSalary(){
        return salary;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Salary: " + getSalary());
    }
}