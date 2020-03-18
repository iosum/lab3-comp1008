package Employee;

import java.time.LocalDate;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String streetAddress2;
    private String city;
    private String region;
    private String postalCode;
    private String country;
    private String phoneNumber;
    private String employeeID;
    private LocalDate dateOfBirth;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String streetAddress, String streetAddress2, String city, String region, String postalCode, String country , String phoneNumber, String employeeID, LocalDate dateOfBirth) {
        setFirstName(firstName);
        setLastName(lastName);
        setStreetAddress(streetAddress);
        setStreetAddress2(streetAddress2);
        setCity(city);
        setRegion(region);
        setPostalCode(postalCode);
        setCountry(country);
        setPhoneNumber(phoneNumber);
        setEmployeeID(employeeID);
        setDateOfBirth(dateOfBirth);
    }

    public Employee() {

    }

    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        setFirstName(firstName);
        setLastName(lastName);
        this.socialSecurityNumber = socialSecurityNumber;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.matches("[a-z A-Z_]+")) {
            this.firstName = firstName;
        }
        else {
            throw new IllegalArgumentException("please enter letters only.");
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.matches("[a-z A-Z]+")) {
            this.lastName = lastName;
        }
        else {
            throw new IllegalArgumentException("last name must be letters.");
        }
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if (streetAddress.matches("([0-9]+)\\s([A-z]+)\\s([A-z]+\\.)")) {
            this.streetAddress = streetAddress;
        }
        else {
            throw new IllegalArgumentException("please enter valid street address");
        }

    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        if(streetAddress2.matches("([0-9]+)\\s([A-z]+)\\s([A-z]+\\.)")) {
            this.streetAddress2 = streetAddress2;
        }

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.matches("[2-9]\\d{2}[-.]?[0-9]\\d{3}[0-9]\\d{4}")) {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw new IllegalArgumentException("phone number must be in the pattern xxx-xxx-xxxx");
        }
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

//    @Override
//    public String toString() {
//        return String.format("first name: %s\nlast name: %s\naddress: %s\n: ", getFirstName(),getLastName(),getAddress());
//    }

    public String toString() {
        return String.format("%s %s%nsocial security number: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber());
    }

    public abstract double earnings();
}
