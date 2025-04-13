public class Meat extends Product {
    private String cutType;

    public Meat(String name, double weight, String cutType) {
        super(name, weight);
        this.cutType = cutType;
    }

    public String getCutType() {
        return cutType;
    }

    public void setCutType(String cutType) {
        this.cutType = cutType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Meat: " + getName() + ", Weight: " + getWeight() + "kg, Cut: " + cutType);
    }
}