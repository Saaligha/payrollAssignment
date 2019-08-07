package za.ac.cput.payroll.Service.Demography;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.payroll.Domain.Demography.Race;
import za.ac.cput.payroll.Factory.Demography.RaceFactory;
import za.ac.cput.payroll.Service.Demography.impl.RaceServiceImpl;

import java.util.Set;

public class RaceServiceImplTest {

    private RaceService service;

    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getService();
    }

    @Test
    public void getAll() {

        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());

        employee.setDesc("Not Riaz");

        service.update(employee);

        Assert.assertEquals(employee.getRaceID(), inRepo.getRaceID());

    }

    @Test
    public void delete() {

        Race employee = RaceFactory.buildRace(1,"fa");

        service.create(employee);

        Race inRepo = service.read(employee.getRaceID());

        Assert.assertNotNull(inRepo);

        service.delete(employee.getRaceID());

        Race deleted = service.read(employee.getRaceID());

        Assert.assertNull(deleted);

    }
}
