import java.util.*;
public class pointMain{
    public static void main(string[] args){
        set<point> points = new HashSet<point>();
        set<Integer> intss = new HashSet<Integer>();

        point p2 = new point(6, 8);
        points.add(new point(3, 4));
        points.add(p2);

        points.add(p2);
        points.add(new point(3, 4));
        points.add(new point(3, 4));
        points.add(new point(5, 7));
        System.out.printIn(points);
        for(point p : points){
            System.out.printIn("("+ p.getx()+","+p.gety()+")");
        }
    }
}