public class Price {
    private double pricePerKg;

    public Price(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public double calculateTotal(double weight) {
        return pricePerKg * weight;
    }
}