interface MyCamera {
    void TakeSnap();

    void RecordVideo();

    default void RecordVideoIn4k() {
        System.out.println("Recording in 4k Video ....");
    }
}

interface MyWifi {
    String[] ToGetNetwork();


    void ConnectionNetwork(String network);
}

class MyCellPhone1 {
    void CallNumber(int PhoneNumber) {
        System.out.println("Calling" + PhoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting.....");
    }
}

class MySmartPhone1 extends MyCellPhone implements MyCamera, MyWifi {

    public void TakeSnap() {
        System.out.println("Taking Snap ... ");
    }

    public void RecordVideo() {
        System.out.println("Recording Video");
    }

    public void RecordVideoIn4k() {
        System.out.println("Recording in 4k Video ....");
    }


    public String[] ToGetNetwork() {
        System.out.println("Getting list of networks");
        String[] networklist = {"Bazed", "Hamza", "Shadab", "BgWIFI"};
        return networklist;
    }

    public void ConnectionNetwork(String network) {
        System.out.println("Connecting ... " + network);
    }
}

public class PolyMorphism {
    public static void main(String[] args) {
//        Wifi Interface
        MyWifi wifi = new MySmartPhone1();

        String[] arr = wifi.ToGetNetwork();
        for (String items : arr) {
            System.out.println(items);
        }
        wifi.ConnectionNetwork("BgWIFI");
// Camera Interfaces
            MyCamera cam1 = new MySmartPhone1(); // this is a Smartphone but please use it as Camera anotherwise give error

            cam1.RecordVideo();
            cam1.TakeSnap();
            cam1.RecordVideoIn4k();
//        cam1.ConnectionNetwork(); give error bcz i cant use another interface Properities

        MyCellPhone cl = new MySmartPhone1();

        cl.CallNumber(12345);
        cl.pickCall();


        System.out.println("SmartPhone All Features can be used");

        MySmartPhone1 Samsung = new MySmartPhone1();
        Samsung.TakeSnap();
        Samsung.CallNumber(0311);
        Samsung.pickCall();
        Samsung.RecordVideo();
        Samsung.RecordVideoIn4k();
        Samsung.ConnectionNetwork("BGWIFI");




    }
}
