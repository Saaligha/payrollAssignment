package za.ac.cput.payroll.Factory.User;

import za.ac.cput.payroll.Domain.User.EmployeeGender;

public class EmployeeGenderFactory {
    public static EmployeeGender buildEmployeeGender(int empId, int genderId){

        return new EmployeeGender().employeeGender(genderId, empId);
    }
}
