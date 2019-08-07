package za.ac.cput.payroll.Service.User;

import za.ac.cput.payroll.Domain.User.Employee;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface EmployeeService extends IService<Employee, Integer> {

    Set<Employee> getAll();

}
