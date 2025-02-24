import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Payroll {
    public static void main(String[] args) {
            /*
              Instance of the Staff Member class using its constructor
              instance cannot run because class is abstract
              StaffMember staff = new StaffMember("Mary", "Allen", "Marketing", 40.00);
             staff.Display();
             */

        ArrayList<SalesRep> SalesRepList = new ArrayList<>(5);
        SalesRep rep1 = new SalesRep("John", "Brown", "Hr1001", 50, 24000.00);
        SalesRep rep2 = new SalesRep("Tracy", "Brian", "Marketing2001", 38, 16000.00);
        SalesRep rep3 = new SalesRep("Lisa", "Kay", "Agent223", 41, 45000.00);
        SalesRep rep4 = new SalesRep("Kimberly", "Brown", "Finance701", 80.00, 56000.00);
        SalesRep rep5 = new SalesRep("Samantha", "Tracey", "Hr1001", 75.0, 80000.00);


        SalesRepList.add(rep1);
        SalesRepList.add(rep2);
        SalesRepList.add(rep3);
        SalesRepList.add(rep4);
        SalesRepList.add(rep5);
        for (SalesRep rep : SalesRepList) {
            rep.Display();
        }
        // Instantiate an object of Manager  & Sales rep class
        Manager Manager = new Manager("Gerald", "Thomas", "Printing102", 40.00, 6500);
        SalesRep Rep = new SalesRep("Samantha", "Tracey", "Hr1001", 75.0, 80000.00);
        Manager.Display();
        Rep.Display();
        System.out.println("\nSalary for the Manager is: $" + Manager.calculateSalary());
        System.out.println("\nSalary for the Sales Rep is: $" + Rep.calculateSalary());

        // Generate Paystubs

            String filename = "paystubs.txt";
            FileWriter writer = null; // filewriter object

            try {
                writer = new FileWriter(filename); // initialize filewriter object

                for (SalesRep rep : SalesRepList) {
                    String paystub = rep.payStubDetails();
                    System.out.println(paystub);
                    writer.write(paystub + "\n------------------------------\n");
                }
                System.out.println("Paystubs saved to " + filename);
            }
            catch (IOException e) {
                System.out.println("Error writing to file. " + e.getMessage());
            }
            finally {
                try {
                    if (writer != null) {
                        writer.close();
                    }
                } catch (IOException e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }


        }

