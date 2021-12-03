public class ex36 {
    public static void main(String[] args){
        Students s1= new Students("An", "Thai Nguyen", 4.0);
        System.out.println(s1.toString());
    }
}

class Students{
    private String name;
    private String address;
    private double gpa;

    public Students(String name, String address, double gpa){
        this.name= name;
        this.address= address;
        this.gpa= gpa;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", address: " + address +", GPA: " + gpa;
    }
}