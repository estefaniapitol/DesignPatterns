public class LazyChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private static LazyChocolateBoiler uniqueInstance = new LazyChocolateBoiler();

    private LazyChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static LazyChocolateBoiler getInstance() {
        return uniqueInstance;
    }

    public void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            // fill the boiler with a milk/chocolate mixture
        }
    }

    public void drain() {
        if(!isEmpty() && isBoiled()) {
            // drain the boiled milk and chocolate
            empty = true;
        }
    }

    public void boil() {
        if(!isEmpty() && !isBoiled()) {
            // drain the boiled milk and chocolate
            boiled = true;
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}