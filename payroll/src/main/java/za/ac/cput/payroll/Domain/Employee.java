package za.ac.cput.payroll.Domain;

public class Employee {

    private String FirstName, LastName, EmployeeNum;

    private Employee(Employee employee) {
    }

    private Employee(Builder builder) {
        this.FirstName = builder.FirstName;
        this.LastName = builder.LastName;
        this.EmployeeNum = builder.EmployeeNum;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmployeeNum() {
        return EmployeeNum;
    }

    public static class Builder {
        private String FirstName, LastName, EmployeeNum;


    public Builder FirstName(String FirstName) {
        this.FirstName = FirstName;
        return this;
    }

    public Builder LastName(String LastName) {
        this.LastName = LastName;
        return this;
    }

    public Builder EmployeeNum(String EmployeeNum) {
        this.EmployeeNum = EmployeeNum;
        return this;
    }

    public Employee build() {
        return new Employee(this);
    }
}


}
