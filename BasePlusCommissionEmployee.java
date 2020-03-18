package Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, commissionRate, grossRate);
        setBaseSalary(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary > 0) {
            this.baseSalary = baseSalary;
        }
        else {
            throw new IllegalArgumentException("base salary must be greater than 0.");
        }
    }


    @Override
    public double earnings(){
        return (getCommissionRate() * getGrossRate()) + getBaseSalary();
    }

    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
