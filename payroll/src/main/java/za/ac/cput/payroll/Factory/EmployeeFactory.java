package za.ac.cput.payroll.Factory;

import za.ac.cput.payroll.Domain.Employee;

public class EmployeeFactory {

    public static Employee getEmployee(String FirstName,String LastName, String EmployeeNum){
        return new Employee.Builder().FirstName(FirstName)
                                        .LastName(LastName)
                                        .EmployeeNum(EmployeeNum)
                .build();
    }
}
