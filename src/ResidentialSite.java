public class ResidentialSite extends Site{

    private double units;
    private double rate;

    public ResidentialSite(double units, double rate) {
        this.units = units;
        this.rate = rate;
    }

    private static double getTaxAmount(double base) {
        return base * Site.TAX_RATE;
    }

    private double getBaseAmount() {
        return units * rate;
    }

}
