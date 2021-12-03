public class ex41 {
    public static void main(String[] args){
        Animal[] a= new Animal[4];
        a[0]= new Animal();
        a[1]= new Dog();
        a[2]= new Cat();
        a[3]= new Duck();
        for (int i=0; i<4; i++){
            a[i].sound();
        }
    }
}

class Animal{
    public void sound(){
        System.out.println("some sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound(){
        System.out.println("bow wow");
    }
}

class Cat extends Animal{
    @Override
    public void sound(){
        System.out.println("meow meow");
    }
}

class Duck extends Animal{
    @Override
    public void sound(){
        System.out.println("quack quack");
    }
}