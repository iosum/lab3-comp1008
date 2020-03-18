package Employee;

import Employee.Employee;

import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String [] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee(
                "Jon", "doe", "1234",40);
        HourlyEmployee hourlyEmployee = new HourlyEmployee(
                "Mickey", "Mouse","1235",  14,11.5);
        CommissionEmployee commissionEmployee = new CommissionEmployee(
                "Nick","White","1237",10000,0.6);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee
                ("Kevin","Logger","1222",
                        5000,0.6,300);

        System.out.println(salariedEmployee.toString());
        System.out.println("-------------------------");
        System.out.println(hourlyEmployee.toString());
        System.out.println("-------------------------");
        System.out.println(commissionEmployee.toString());
        System.out.println("-------------------------------");
        System.out.println(basePlusCommissionEmployee.toString());

    }
}
