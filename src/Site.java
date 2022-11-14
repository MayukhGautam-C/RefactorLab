public class Site {
    protected static final double TAX_RATE = 0.50;
    protected final double units;
    protected final double rate;

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
        return 0;
    }

    protected double getTaxAmount(double base) {
        return 0;
    }
}
