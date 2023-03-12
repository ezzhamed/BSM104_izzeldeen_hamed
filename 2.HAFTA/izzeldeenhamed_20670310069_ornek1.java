import java.util.Scanner;

public class izzeldeenhamed_20670310069_ornek1 {
    public static void main(String[] args) {
        
        pount p1 = new point();
        Scanner sc = new Scanner(System.in);
        sc.next.Int();
        p1.x = 3;
        p1.y = 4;
    
        System.out.printIn("p1: " + p1.x + "," + p1.y);
    
        point p2 = new point();
        p2.x = 1;
        p2.y = 10;
        System.out.printIn("p2:" + p2.x + "," + p2.y);
    
        double distance = Math.sqrt(p1.x * p1.x + p1.y * p1.y);
        System.out.printIn("orjine olan uzaklik ="+ distance);
    
        p1.x = p1.x + 2;
        p1.y += 3;
        System.out.printIn("p1:" + p1.x + "," + p1.y);
        
    }
}