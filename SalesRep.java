
public class SalesRep  extends StaffMember {
    private double allowance;

    // Constructor
    public SalesRep(String firstName,String lastName, String deptNumber, double hoursWorked,double allowance){
        super(firstName,lastName,deptNumber,hoursWorked);
        this.allowance=allowance;
    }

    public double getAllowance() {
        return allowance;
    }
    public void setAllowance(double allowance) {
        this.allowance=allowance;
    }
    @Override
    public void Display() {
        System.out.println("First Name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Department Number: " + deptNumber + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Allowance: $" + allowance + "\n" + "Salary: $" + calculateSalary()+ "\n\n");
    }
    @Override
    public String payStubDetails() {
        return "First Name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Department Number: " + deptNumber + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Allowance: $" + allowance + "\n" + "Salary: $" + calculateSalary()+ "\n\n";
    }

    @Override
    public double calculateSalary() {
        return (hoursWorked*1500)+allowance;
    }

}