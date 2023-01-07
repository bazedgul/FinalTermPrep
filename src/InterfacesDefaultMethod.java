interface Camera {
    void TakeSnap();

    void RecordVideo();
    default void RecordVideoIn4k(){
        System.out.println("Recording in 4k Video ....");
    }
}

interface Wifi {
    String[] ToGetNetwork();

    void ConnectionNetwork(String network);
}

class MyCellPhone {
    void CallNumber(int PhoneNumber) {
        System.out.println("Calling" + PhoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting.....");
    }}
class MySmartPhone extends MyCellPhone implements Camera,Wifi {

    public void TakeSnap(){
        System.out.println("Taking Snap ... ");
    }

  public   void RecordVideo(){
        System.out.println("Recording Video");
    }

   public void RecordVideoIn4k(){
        System.out.println("Recording in 4k Video ....");
    }


   public String[] ToGetNetwork() {
       System.out.println("Getting list of networks");
       String[] networklist = {"Bazed", "Hamza", "Shadab"};
       return networklist;
   }

   public void ConnectionNetwork(String network){
        System.out.println("Connecting ... " + network);
    }
}


public class InterfacesDefaultMethod {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        String [] arr = ms.ToGetNetwork();

        for (String items : arr) {
            System.out.println(items);
        }
    }
}
