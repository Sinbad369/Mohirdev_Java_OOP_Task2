public class Point {
    private double x;
    private double y;
    private double z;

    public Point() {
    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void printSpaceVectorPoints(){
        System.out.println("The vector points of point is " +
                "(" + x + ", " + y + ", " + z + ")");
    }
}
