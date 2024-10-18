public class Main {
    public static void main(String[] args) {
        System.out.println("Hell no Serikpay!");
        Car car = new Car("Black", "Porsche 911",  + 300_000,"Automatic");
        car.printCarDetails();
        System.out.println();

        System.out.println("Int value check: ");
        RightTriangle rightTriangle = new RightTriangle(3, 4,5);
        rightTriangle.printRightTriangleDetails();
        System.out.println("Double value check: ");
        RightTriangle rightTriangle1 = new RightTriangle(5.6, 7.8,9.44);
        rightTriangle1.printRightTriangleDetails();
        System.out.println("Float value check: ");
        RightTriangle rightTriangle2 = new RightTriangle(3.2f,4.5f,5.4f);
        rightTriangle2.printRightTriangleDetails();
        System.out.println("Long value check: ");
        RightTriangle rightTriangle3 = new RightTriangle(8L, 15L,17L);
        rightTriangle3.printRightTriangleDetails();

        System.out.println("Vyelkom to spacey cafe, lmao");
        Point point = new Point(12, 22.2, 12.44);
        point.printSpaceVectorPoints();

    }
}