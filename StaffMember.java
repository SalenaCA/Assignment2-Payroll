public abstract class StaffMember {
    protected String firstName;
    protected String lastName;
    protected String deptNumber;
    protected double hoursWorked;

    public StaffMember(String firstName, String lastName, String deptNumber, double hoursWorked) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.deptNumber = deptNumber;
        this.hoursWorked = hoursWorked;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setDeptNumber(String deptNumber) {
        this.deptNumber = deptNumber;
    }

    public String getDeptNumber() {
        return deptNumber;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void Display() {
        System.out.println("First Name is:" + firstName + "\n" + "Last name:" + lastName + "\n" + "Department Number:" + deptNumber + "\n" + "Hours Worked:" + hoursWorked + "\n");
    }
    public String payStubDetails() {
        return "First Name is:" + firstName + "\n" + "Last name:" + lastName + "\n" + "Department Number:" + deptNumber + "\n" + "Hours Worked:" + hoursWorked + "\n";
    }

    public abstract double calculateSalary();




}
