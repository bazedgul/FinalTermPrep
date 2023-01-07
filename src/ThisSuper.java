class EkClass{
    int a;
    EkClass(int v ){
       a = v;
    }

    public int getA() {
        return a;
    }
}
public class ThisSuper {
    public static void main(String [] Args){
        EkClass o = new EkClass(1);
        System.out.println(o.getA());
    }
}
