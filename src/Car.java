public class Car {
    // Color
    // Model
    // Price
    // Transmission: Automatic or mechanic
    private String color;
    private String model;
    private double price;
    private String transmission;

    public Car(String color, String model, double price, String transmission){
        this.color = color;
        this.model = model;
        this.price = price;
        this.transmission = transmission;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public double getPrice(){
        return price;
    }

    public String getTransmission(){
        return transmission;
    }

    public void printCarDetails(){
        System.out.println("Below the car details are given: ");
        System.out.println("Color: " + color);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Transmission: " + transmission);
    }
}
