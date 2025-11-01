public class Pizza extends Product implements Discountable {
    private String size;

    public Pizza(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String getInfo() {
        return String.format("Pizza %s (%s) - %.1f UAH", getName(), size, getPrice());
    }

    @Override
    public double applyDiscount(double percent) {
        double newPrice = getPrice() - (getPrice() * percent / 100.0);
        return newPrice;
    }
}