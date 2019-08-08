package za.ac.cput.payroll.Factory.Demography;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Demography.Race;

public class RaceFactoryTest {

    @Test
    public void buildRace() {

        Race race = RaceFactory.buildRace(1, "Indian");
        Assert.assertNotNull(race);


    }
}