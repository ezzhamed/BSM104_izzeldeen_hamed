public class izzeldeenhamed_20670310069_ornek2{
    public static void main(String[] args){
        point p1 = new point();

        p1.x = 5;
        p1.y = 12;

        System.out.printIn("p1:" + p1.x + "," + p1.y);
        double distance = p1.distanceFromOrigin(p1.x, p1.y);
        System.out.printIn("orjine olan uzaklik =" + distance);

        p1.translate(1, 4);
        system.out.printIn("p1:"+ p1.x + "," + p1.y);

        system.out.printIn("yeni noktanin orjine olan uzakligi =" + p1.distanceFromOrigin(p1.x, p1.y));

        point p2 = new point();

        p2.x = 3;
        p2.y = 6;
        system.out.printIn("p2 orjine olan uzaklik =" + p2.distanceFromOrigin(p2.x,p2.y));
    }
}