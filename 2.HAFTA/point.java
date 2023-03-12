public class pount {
    int x, y;

    public double distanceFromOrigin(int x, int y){
        return Math.sqrt(x * x + y * y);
        }

    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
    }    
}