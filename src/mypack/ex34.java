package mypack;

public class ex34 {
    public static void main(String[] args){
        Student s1= new Student("Phuong Thao", 20, "Ha Noi", 3.61);
        s1.display();
        System.out.println();
        Teacher t1= new Teacher("Ngoc An", 22, "Thai Nguyen", 2000);
        t1.display();
    }
}

class Person{
    private String name;
    private String add;
    private int age;

    public Person(String name, int age, String add){
        this.name= name;
        this.age= age;
        this.add= add;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age= age;
    }

    public int getAge(){
        return age;
    }

    public void setAdd(String add){
        this.add= add;
    }

    public String getAdd(){
        return add;
    }

    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " +age);
        System.out.println("Address: " + add);
    }
}

class Student extends Person{
    private double gpa;

    public Student(String name, int age, String add, double gpa){
        super(name, age, add);
        this.gpa= gpa;
    }

    public void setGpa(double gpa){
        this.gpa= gpa;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public void display(){
        super.display();
        System.out.println("Gpa: " + gpa);
    }
}

class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, String add, int salary){
        super(name, age, add);
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
        System.out.println("Salary: " + salary );
    }
}