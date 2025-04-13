public class Fruit extends Product {
    private boolean isSeasonal;

    public Fruit(String name, double weight, boolean isSeasonal) {
        super(name, weight);
        this.isSeasonal = isSeasonal;
    }

    public boolean isSeasonal() {
        return isSeasonal;
    }

    public void setSeasonal(boolean seasonal) {
        isSeasonal = seasonal;
    }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Weight: " + getWeight() + "kg, Seasonal: " + isSeasonal);
    }
}