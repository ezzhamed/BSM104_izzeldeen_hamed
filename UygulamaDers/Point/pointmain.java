public class pointmain{
    public static void main(String[] args) {

        point p1 = new point(7, 2);
        point p2 = new point(4, 4);

        system.out.printin("p1"+p1.getX()+"p1"+p1.getY());
        system.out.printin("orijine uzakligi :" + p1.distanceFromOrigin());

        system.out.printin("p2"+p2.getX()+"p2"+p2.getY());
        system.out.printin("orijine uzakligi :" + p2.distanceFromOrigin());

        p1.translate(11, 6);
        system.out.printin("p1"+p1.getX()+"p1"+p1.getY());
        system.out.printin("orijine uzakligi :" + p1.distanceFromOrigin());
    }
}