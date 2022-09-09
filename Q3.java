public class Q3 {
    public static void main(String[] args) {
        String m=new String("Mississippi");
        m=m.replace('i','!');
        m=m.replace('s','S');
        System.out.println("Actual="+m);
        System.out.println("The expected answer ="+"M!SS!SS!pp!");
    }
}
