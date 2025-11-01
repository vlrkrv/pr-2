public class Main {
    public static void main(String[] args) {
        // Створення товарів
        Pizza p1 = new Pizza("Margherita", 189.0, "Large");
        Pizza p2 = new Pizza("Pepperoni", 210.0, "Medium");

        Drink d1 = new Drink("Cola", 45.0, true);
        Drink d2 = new Drink("Tea", 30.0, false);

        // Перевірка знижки
        double newPrice = p1.applyDiscount(10); // 10%
        System.out.println("Price after discount: " + newPrice);
        System.out.println();

        // Створення кошиків
        Cart<Pizza> pizzaCart = new Cart<>();
        Cart<Drink> drinkCart = new Cart<>();

        // Додавання товарів
        pizzaCart.addItem(p1);
        pizzaCart.addItem(p2);

        drinkCart.addItem(d1);
        drinkCart.addItem(d2);

        // Друк вмісту кошиків з використанням лямбд
        String pizzasText = pizzaCart.printCart(
                item -> item.getInfo()
        );

        String drinksText = drinkCart.printCart(
                drink -> "Drink: " + drink.getInfo()
        );

        System.out.println("=== Pizza cart ===");
        System.out.println(pizzasText);

        System.out.println("\n=== Drink cart ===");
        System.out.println(drinksText);

        // Виведення кількості елементів
        System.out.println("\nPizza count = " + pizzaCart.getCount());
        System.out.println("Drink count = " + drinkCart.getCount());
    }
}