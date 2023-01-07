interface SampleInterface {
    void Methd1();

    void Methd2();
}

interface ChildSampleInterface extends SampleInterface {
    void Methd3();

    void Methd4();
}

class MySample implements ChildSampleInterface {
    public void Methd1() {
        System.out.println("Methd1");
    }

    public void Methd2() {
        System.out.println("Methd2");
    }

    public void Methd3() {
        System.out.println("Methd3");
    }

    public void Methd4() {
        System.out.println("Methd4");
    }
}

public class InheritanceInInterfaces {
    public static void main(String[] args) {
        MySample smp = new MySample();
        smp.Methd1();
        smp.Methd2();
        smp.Methd3();
        smp.Methd4();

    }}
