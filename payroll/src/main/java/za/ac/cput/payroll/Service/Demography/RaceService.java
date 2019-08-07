package za.ac.cput.payroll.Service.Demography;

import za.ac.cput.payroll.Domain.Demography.Race;
import za.ac.cput.payroll.Service.IService;

import java.util.Set;

public interface RaceService extends IService<Race, Integer> {

    Set<Race> getAll();

}
