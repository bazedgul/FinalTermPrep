class Base {
   private int x;

   //Default Constructor
   Base(){
       System.out.println("Hello Im Base Class Constructor");
   }
   //Parameterized Constructor
   Base(int a){
       System.out.println("Im OverLoaded Parameterized Constructor with Variable A Value : " + a);
   }
// Multiple Constructor
    Base(int a,int b){
        System.out.println("Im OverLoaded Parameterized Constructor with Variable A and B Value : " + a + " and " + b);
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("Im Base Class and Setting x:");
        this.x = x;
    }

    public void PrintMe() {
        System.out.println("Hello Im Function");
    }


}

class Derived extends Base {
     protected int y;

     Derived(){
//         super(1,2);
         System.out.println("Hello Im Derived Class Constructor ");
     }

    Derived(int a){
        System.out.println("Im OverLoaded Parameterized Constructor with Variable A Value : " + a);
    }

    Derived(int a,int b) {
         super( a);
        System.out.println("Im OverLoaded Parameterized Constructor with Variable A Value : " + a + " and " + b);
    }
    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Im Derived Class and setting y");
        this.y = y;
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){

        System.out.println("Hello im ChildOfDerived Class Constructor ");
    }
    ChildOfDerived(int x,int y,int z){
        super(3,4);
        System.out.println("Im OverLoaded Parameterized Constructor with Variable X,Y and Z Value : " + x + " - " + y + " - " + z );
    }
}

public class Inheritance {
    public static void main(String[] args) {
//        Creating object of Base Class
//        Base b = new Base();
//        b.setX(10);
//        System.out.println(b.getX());
//        Creating Object of Derived Class

//        Derived d = new Derived();
//        d.y = 5;
//        System.out.println("Y Value : " +  d.getY());

//        Constructor
//        Derived d1 = new Derived(1,2);
        ChildOfDerived cd = new ChildOfDerived(5,6,7);
    }
}
