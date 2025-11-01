public class Drink extends Product implements Discountable {
    private boolean isCold;

    public Drink(String name, double price, boolean isCold) {
        super(name, price);
        this.isCold = isCold;
    }

    public boolean isCold() {
        return isCold;
    }

    @Override
    public String getInfo() {
        String temperature = isCold ? "cold" : "hot";
        return String.format("%s [%s] - %.1f UAH", getName(), temperature, getPrice());
    }

    @Override
    public double applyDiscount(double percent) {
        double newPrice = getPrice() - (getPrice() * percent / 100.0);
        return newPrice;
    }
}
