public class Manager extends StaffMember {
    private double bonus;

    public Manager(String firstName,String lastName, String deptNumber, double hoursWorked,double bonus){
        super(firstName,lastName,deptNumber,hoursWorked);
        this.bonus=bonus;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    @Override
    public void Display() {
        System.out.println("First Name is:" + firstName + "\n" + "Last name:" + lastName + "\n" + "Department Number: " + deptNumber + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Bonus: $" + bonus + "\n" + "Salary: $" + calculateSalary() + "\n");
    }
    @Override
    public String payStubDetails() {
        return "First Name is:" + firstName + "\n" + "Last name:" + lastName + "\n" + "Department Number: " + deptNumber + "\n" + "Hours Worked: " + hoursWorked + "\n" + "Bonus: $" + bonus + "\n" + "Salary: $" + calculateSalary() + "\n";
    }

    @Override
    public double calculateSalary() {
        double pay= (hoursWorked*2500)+bonus;
        return pay;
    }


}
