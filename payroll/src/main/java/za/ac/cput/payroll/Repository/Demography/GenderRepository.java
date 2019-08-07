package za.ac.cput.payroll.Repository.Demography;

import za.ac.cput.payroll.Domain.Demography.Gender;
import za.ac.cput.payroll.Repository.Repository;

import java.util.Set;

public interface GenderRepository extends Repository<Gender, Integer> {

    Set<Gender> getAll();

}