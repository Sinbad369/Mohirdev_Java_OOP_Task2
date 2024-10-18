public class RightTriangle {
    // legA
    // legB
    // hypotenuse
    private double legA;
    private double legB;
    private double hypotenuse;
    private double area;
    private double perimeter;
    public RightTriangle(int legA, int legB, int hypotenuse){
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
        this.area = area;
    }
    public RightTriangle(double legA, double legB, double hypotenuse){
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
        this.area = area;
    }
    public RightTriangle(float legA, float legB, float hypotenuse){
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
        this.area = area;
    }
    public RightTriangle(long legA, long legB, long hypotenuse){
        this.legA = legA;
        this.legB = legB;
        this.hypotenuse = hypotenuse;
        this.area = area;
    }

    public double getLegA(){
        return legA;
    }
    public double getLegB(){
        return legB;
    }
    public double getHypotenuse(){
        return hypotenuse;
    }

    public double getArea(){
        area = legA * legB / 2;
        return area;
    }
    public double getPerimeter(){
        perimeter = legA + legB + hypotenuse;
        return perimeter;
    }
    public void printRightTriangleDetails(){
        System.out.println("Leg A: " + legA);
        System.out.println("Leg B: " + legB);
        System.out.println("Hypotenuse: " + hypotenuse);
        System.out.printf("Area of this triangle: %.2f", getArea());
        System.out.printf("\nPerimeter of this triangle: %.2f\n\n", getPerimeter());
    }


}
