public class Room {
    private double width;
    private double height;
    private double price;

    public Room(double width, double height, double price) {
        this.width = width;
        this.height = height;
        this.price = price;
    }

    public void open() {
        System.out.println("House open");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }
}
