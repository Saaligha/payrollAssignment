package za.ac.cput.payroll.Repository.User;


import za.ac.cput.payroll.Domain.User.EmployeeGender;
import za.ac.cput.payroll.Repository.Repository;

import java.util.Set;

public interface EmployeeGenderRepository extends Repository<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();

}