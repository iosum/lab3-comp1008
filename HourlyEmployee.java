package Employee;

public class HourlyEmployee extends Employee {
    public double wage;
    public double hours;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName, lastName, socialSecurityNumber);
        setWage(wage);
        setHours(hours);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0) {
            this.wage = wage;
        }
        else {
            throw new IllegalArgumentException("wage must be greater than 0");
        }

    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        if (hours > 0) {
            this.hours = hours;
        }
        else {
            throw new IllegalArgumentException("hours must be greater than 0.");
        }

    }

    @Override
    public double earnings() {
        double salary = 0.0;
        if (hours <= 40) {
            salary =  wage * hours;
        }
        else if (hours > 40) {
            salary =  40 * wage + (hours - 40) * wage * 1.5;
        }
        return salary;
    }

    public String toString() {
        return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
                super.toString(), "hourly wage", getWage(),
                "hours worked", getHours());
    }
}
