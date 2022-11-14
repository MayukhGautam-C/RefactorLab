public class Site {
    protected static final double TAX_RATE = 0.50;

    public Site() {
    }
    public double getBillableAmount(){
        double base = getBaseAmount();
        double tax = getTaxAmount(base);
        return base + tax;
    }

    private double getBaseAmount() {
        return units * rate;
    }

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }
}
