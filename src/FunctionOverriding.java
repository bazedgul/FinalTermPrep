class A{
    int a;
    public int bazed(){
        return 4;
    }
    public void Method2(){
        System.out.println("Im Function 2 of class A ");
    }
}
class B extends A{
    public void Method2(){
        System.out.println("Im Function 2 of Class B ");
    }

    public void Method3(){
        System.out.println("Im Function 3 of Class B ");
    }
}
public class FunctionOverriding {
    public static void main(String[]args){
         A a = new A();
         a.Method2();

         B b = new B();
         b.Method2();
    }
}
