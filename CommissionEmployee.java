package Employee;

public class CommissionEmployee extends Employee {
    private double commissionRate;
    private double grossRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossRate) {
        super(firstName, lastName, socialSecurityNumber);
        setCommissionRate(commissionRate);
        setGrossRate(grossRate);
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate > 0) {
            this.commissionRate = commissionRate;
        }
        else {
            throw new IllegalArgumentException("commission rate must be greater than 0.");
        }

    }

    public double getGrossRate() {
        return grossRate;
    }

    public void setGrossRate(double grossRate) {
        if (grossRate > 0) {
            this.grossRate = grossRate;
        }

        else {
            throw new IllegalArgumentException("gross rate must be greater than 0.");
        }

    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossRate();
    }

    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
                "commission employee", super.toString(),
                "gross sales", getGrossRate(),
                "commission rate", getCommissionRate());
    }
}
