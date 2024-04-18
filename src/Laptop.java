import java.util.Iterator;
import java.util.Objects;

public class Laptop{
    private Brand brand;
    private Colour colour;
    private String modelName;
    private double price;



    public Laptop() {

    }

    public Laptop(Brand brand, Colour colour, String modelName, double price) {
        this.brand = brand;
        this.colour = colour;
        this.modelName = modelName;
        this.price = price;
    }


    public Brand getBrand() {
        return brand;
    }

    public Colour getColour() {
        return colour;
    }

    public String getModelName() {
        return modelName;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.price, price) == 0 && brand == laptop.brand && colour == laptop.colour && modelName.equals(laptop.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, colour, modelName, price);
    }

    @Override
    public String toString() {
        return "brand: " + brand +
                ", colour: " + colour +
                ", modelName: '" + modelName +
                ", price: " + price + "\n";
    }

}
