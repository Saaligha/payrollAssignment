package za.ac.cput.payroll.Factory.Demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Demography.Gender;

public class GenderFactoryTest {

    @Test
    public void getGender() {

        Gender gender = GenderFactory.buildGender(1, "F");
        Assert.assertNotNull(gender);

    }
}
