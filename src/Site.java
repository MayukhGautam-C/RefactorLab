public class Site {
    protected static final double TAX_RATE = 0.50;
    private final double units;
    private final double rate;

    public Site(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }
    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    protected double getBaseAmount() {
        return units * rate;
    }

    protected double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }
}
