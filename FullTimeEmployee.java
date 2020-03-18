package Employee;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(String firstName, String lastName, String streetAddress, String streetAddress2,
                            String city, String region, String postalCode, String country, String phoneNumber,
                            String employeeID, LocalDate dateOfBirth) {
        super(firstName, lastName, streetAddress, streetAddress2, city, region, postalCode, country, phoneNumber, employeeID, dateOfBirth);
    }

    @Override
    public double earnings() {
        return 0;
    }
}
