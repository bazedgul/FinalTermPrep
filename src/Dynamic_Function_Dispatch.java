class Phone{

    public void greet(){
        System.out.println("Hello Everyone");
    }
    public void On(){
        System.out.println("Turning on Phone....");
    }
}
class  Smartphone extends Phone{
    public void On(){
        System.out.println("Turning on smartphone....");
    }
    public void Play(){
        System.out.println("Play Music....");
    }
}
public class Dynamic_Function_Dispatch {
    public static void main(String[] args) {
//       Phone p = new Phone();
//       p.Name();
//
//       Smartphone sp = new Smartphone();
//       sp.Name();

        Phone obj = new Smartphone();
        obj.greet();
        obj.On();
 //     obj.Play(); // Not Allowed
//      Smartphone S = new Phone(); Not Allowed

    }
}
