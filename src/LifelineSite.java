public class LifelineSite extends Site{

    private final double units;
    private final double rate;

    public LifelineSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBillableAmount(){
        double base = units * rate * 0.5;
        double tax = getTax(base);
        return base + tax;
    }

    private static double getTax(double base) {
        return base * Site.TAX_RATE * 0.2;
    }


}
