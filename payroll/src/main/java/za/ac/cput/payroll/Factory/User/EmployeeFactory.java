package za.ac.cput.payroll.Factory.User;

import za.ac.cput.payroll.Domain.User.Employee;

public class EmployeeFactory {
    public static Employee getEmployee(int empNumber, String fName, String lName ){

        return new Employee.Builder()
                .empNumber(empNumber)
                .empFirstName(fName)
                .empLastName(lName)
                .build();
    }

}
