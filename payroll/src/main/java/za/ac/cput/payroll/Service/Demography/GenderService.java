package za.ac.cput.payroll.Service.Demography;

import za.ac.cput.payroll.Domain.Demography.Gender;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface GenderService extends IService<Gender, Integer> {

    Set<Gender> getAll();

}
