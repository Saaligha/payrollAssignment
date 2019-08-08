package za.ac.cput.payroll.Repository.User;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import za.ac.cput.payroll.Domain.User.EmployeeGender;
import za.ac.cput.payroll.Factory.User.EmployeeGenderFactory;
import za.ac.cput.payroll.Repository.User.EmployeeGenderRepository;
import za.ac.cput.payroll.Repository.User.impl.EmployeeGenderRepositoryImpl;

import java.util.Set;

import static org.junit.Assert.*;

public class EmployeeGenderRepositoryImplTest {

    private EmployeeGenderRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getEmployeeGenderRepository();
    }


    @Test
    public void getAll() {

        Set<EmployeeGender> employeeSet = repository.getAll();
        Assert.assertNotNull(employeeSet);

    }

    @Test
    public void create() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);

        EmployeeGender inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

    }

    @Test
    public void read() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);

        EmployeeGender inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);
    }

    @Test
    public void update() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);
        EmployeeGender inRepo = repository.read(employee.getEmpNumber());

        employee.setEmpNumber(2);

        repository.update(employee);

        Assert.assertEquals(employee.getEmpNumber(), inRepo.getEmpNumber());

    }

    @Test
    public void delete() {

        EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

        repository.create(employee);

        EmployeeGender inRepo = repository.read(employee.getEmpNumber());

        Assert.assertNotNull(inRepo);

        repository.delete(employee.getEmpNumber());

        EmployeeGender deleted = repository.read(employee.getEmpNumber());

        Assert.assertNull(deleted);

    }
}