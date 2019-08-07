package za.ac.cput.payroll.Service.User;


import za.ac.cput.payroll.Domain.User.EmployeeGender;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface EmployeeGenderService extends IService<EmployeeGender, Integer> {

    Set<EmployeeGender> getAll();
}
