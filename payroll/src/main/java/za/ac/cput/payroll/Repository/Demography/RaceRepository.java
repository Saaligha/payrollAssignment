package za.ac.cput.payroll.Repository.Demography;

import za.ac.cput.payroll.Domain.Demography.Race;
import za.ac.cput.payroll.Repository.Repository;

import java.util.Set;

public interface RaceRepository extends Repository<Race, Integer> {

    Set<Race> getAll();

}