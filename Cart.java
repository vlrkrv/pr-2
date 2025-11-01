public class Cart<T> {
    private T[] items;
    private int count;

    @SuppressWarnings("unchecked")
    public Cart() {
        items = (T[]) new Object[10];
        count = 0;
    }

    public void addItem(T item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Cart is full! Cannot add more items.");
        }
    }

    public int getCount() {
        return count;
    }

    public String printCart(java.util.function.Function<T, String> formatter) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(formatter.apply(items[i]));
            if (i < count - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }
}
