package za.ac.cput.payroll.Factory.User;


import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.payroll.Domain.User.Employee;


public class EmployeeFactoryTest {

    @Test
    public void getEmployee() {

        Employee employee = EmployeeFactory.getEmployee(1, "Riaz", "Khan");
        Assert.assertNotNull(employee);

    }
}