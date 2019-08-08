package za.ac.cput.payroll.Factory.User;


import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.payroll.Domain.User.EmployeeGender;

public class EmployeeGenderFactoryTest {

    @Test
    public void buildEmployeeGender() {

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(1, 1);
        Assert.assertNotNull(employeeGender);

    }

}