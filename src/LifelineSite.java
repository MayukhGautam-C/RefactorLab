public class LifelineSite extends Site{

    public LifelineSite(double units, double rate) {
        super(units, rate);
    }

    public double getBaseAmount() {
        return units * rate * 0.5;
    }

    public double getTaxAmount(double base) {
        return base * Site.TAX_RATE * 0.2;
    }

}
