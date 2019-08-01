package za.ac.cput.payroll.Repository;

import za.ac.cput.payroll.Domain.Employee;

import java.util.Set;

public interface EmployeeRepository extends IRepository <Employee, String> {

    Set<Employee> getAll();
}
