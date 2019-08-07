package za.ac.cput.payroll.Repository.User;

import za.ac.cput.payroll.Domain.User.Employee;
import za.ac.cput.payroll.Repository.Repository;

import java.util.Set;

public interface EmployeeRepository extends Repository<Employee, Integer> {

    Set<Employee> getAll();

}