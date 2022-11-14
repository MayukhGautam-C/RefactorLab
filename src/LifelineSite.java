public class LifelineSite extends Site{

    private final double units;
    private final double rate;

    public LifelineSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    public double getBaseAmount() {
        return units * rate * 0.5;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

}
