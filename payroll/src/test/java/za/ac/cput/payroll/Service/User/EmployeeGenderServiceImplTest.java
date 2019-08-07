package za.ac.cput.payroll.Service.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.payroll.Domain.User.EmployeeGender;
import za.ac.cput.payroll.Factory.User.EmployeeGenderFactory;

import java.util.Set;



    public class EmployeeGenderServiceImplTest {

        private EmployeeGenderService service;

        @Before
        public void setUp() throws Exception {
            this.service = EmployeeGenderServiceImpl.getService();
        }

        @Test
        public void getAll() {

            Set<EmployeeGender> employeeSet = service.getAll();
            Assert.assertNotNull(employeeSet);

        }

        @Test
        public void create() {

            EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

            service.create(employee);

            EmployeeGender inRepo = service.read(employee.getEmpNumber());

            Assert.assertNotNull(inRepo);

        }

        @Test
        public void read() {

            EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

            service.create(employee);

            EmployeeGender inRepo = service.read(employee.getEmpNumber());

            Assert.assertNotNull(inRepo);
        }

        @Test
        public void update() {

            EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

            service.create(employee);
            EmployeeGender inRepo = service.read(employee.getEmpNumber());

            employee.setEmpNumber(4);

            service.update(employee);

            Assert.assertEquals(employee.getEmpNumber(), inRepo.getEmpNumber());

        }

        @Test
        public void delete() {

            EmployeeGender employee = EmployeeGenderFactory.buildEmployeeGender(1, 1);

            service.create(employee);

            EmployeeGender inRepo = service.read(employee.getEmpNumber());

            Assert.assertNotNull(inRepo);

            service.delete(employee.getEmpNumber());

            EmployeeGender deleted = service.read(employee.getEmpNumber());

            Assert.assertNull(deleted);

        }
    }


