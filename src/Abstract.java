abstract class Base1 {
    Base1() {
        System.out.println("Im Base class Constructor ");
    }

    public void SayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("Im Derived Class Constructor");
    }
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    public void info(){
        System.out.println("My name is bazed");
    }
}

public class Abstract {
    public static void main(String[] args) {
//        Base1 b = new Base1();  // Abstract class object cannot created and give error
//        ..you have abstract method you need to make class as well Abstract

        Base1 b = new Derived1(); // Both Constructor will run in any abstract class you created
        b.SayHello();
        b.greet();



//        Derived1 obj = new Derived1();
//        obj.greet();
//        obj.info();
//        obj.SayHello();


    }
}
