interface Bicyle {
    int a = 50;

    void ApplyGear(int Decrement);

    void SpeedUP(int increment);
}

class AvonCycle implements Bicyle {
    void Horn() {
        System.out.println("POO POO PEE PEE");
    }

    public void ApplyGear(int Decrement) {
        System.out.println("Applying Gear");
    }

    public void SpeedUP(int increment) {
        System.out.println("Applying Speed");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle bazedCycle = new AvonCycle();
        bazedCycle.ApplyGear(3);
        bazedCycle.SpeedUP(1);
        //You can create properties and attribute in interfaces
        System.out.println(bazedCycle.a);
        // you can not modify the properties in interfaces bcz are final
       // bazedCycle.a = 45; give error

    }
}
