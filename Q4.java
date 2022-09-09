import java.awt.*;

public class Q4 {
    public static void main(String[] args) {
        Rectangle box=new Rectangle(5,10,20,30);
        box.add(0,0);
        System.out.println("Actual="+box.getLocation()+"The width="+box.getHeight());
        System.out.println("The expected answer ="+"["+0+","+0+"]"+"The width="+(20+(5-0))+"heght="
        +(30+(10-0)));
    }
}
