package za.ac.cput.payroll.Controller;

import za.ac.cput.payroll.Domain.Demography.Gender;
import za.ac.cput.payroll.Domain.Demography.Race;
import za.ac.cput.payroll.Domain.User.Employee;
import za.ac.cput.payroll.Domain.User.EmployeeGender;
import za.ac.cput.payroll.Factory.Demography.GenderFactory;
import za.ac.cput.payroll.Factory.Demography.RaceFactory;
import za.ac.cput.payroll.Factory.User.EmployeeFactory;
import za.ac.cput.payroll.Factory.User.EmployeeGenderFactory;
import za.ac.cput.payroll.Service.Demography.GenderService;
import za.ac.cput.payroll.Service.Demography.RaceService;
import za.ac.cput.payroll.Service.Demography.impl.GenderServiceImpl;
import za.ac.cput.payroll.Service.Demography.impl.RaceServiceImpl;
import za.ac.cput.payroll.Service.User.EmployeeGenderService;
import za.ac.cput.payroll.Service.User.EmployeeService;
import za.ac.cput.payroll.Service.User.impl.EmployeeGenderServiceImpl;
import za.ac.cput.payroll.Service.User.impl.EmployeeServiceImpl;

public class EmplyeeController {
    private EmployeeService employeeService = EmployeeServiceImpl.getService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getService();
    private RaceService raceService = RaceServiceImpl.getService();
    private GenderService genderService = GenderServiceImpl.getService();

    public void create(int empId, String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.getEmployee(empId, firstName, lastName);
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender(empId, genderId);
        employeeGenderService.create(employeeGender);

        Race race = RaceFactory.buildRace(raceId, "Race");
        raceService.create(race);

        Gender gender = GenderFactory.buildGender(genderId, "None");
        genderService.create(gender);


    }


}
