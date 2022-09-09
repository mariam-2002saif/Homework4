import org.omg.CORBA.WCharSeqHelper;

public class Q2 {
    public static void main(String[] args) {
        String m=new String("Mississippi");
        m=m.replace("i","ii");
        System.out.println(m.length());
        m=m.replace("ss","s");
        System.out.println(m.length());
    }
}
