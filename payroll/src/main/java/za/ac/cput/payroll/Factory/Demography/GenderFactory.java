package za.ac.cput.payroll.Factory.Demography;

import za.ac.cput.payroll.Domain.Demography.Gender;

public class GenderFactory {

    public static Gender buildGender(int genderId, String gender)
    {
        return new Gender.Builder()
                .id(genderId)
                .desc(gender)
                .build();

    }
}
