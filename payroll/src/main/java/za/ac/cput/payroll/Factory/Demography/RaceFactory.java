package za.ac.cput.payroll.Factory.Demography;

import za.ac.cput.payroll.Domain.Demography.Race;

public class RaceFactory {


    public static Race buildRace(int id, String desc)
    {
        return new Race.Builder()
                .raceID(id)
                .desc(desc)
                .build();

    }
}
