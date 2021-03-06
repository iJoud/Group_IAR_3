package RandJLawFirm;

import java.util.ArrayList;

public class Employee extends Person {

    private String ID;
    private Boolean isManager;
    private static ArrayList<Employee> Employees = new ArrayList<>();

    public Employee(String ID, String Fname, String Lname, String Phone, Boolean isManager) {
        super(Fname, Lname, Phone);
        this.ID = ID;
        this.isManager = isManager;
    }

    public Employee(String ID, String email) {
        super(email);
        this.ID = ID;
    }

    public Employee(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Boolean getIsManager() {
        return isManager;
    }

    public void setIsManager(Boolean isManager) {
        this.isManager = isManager;
    }

    public static ArrayList<Employee> getEmployees() {
        AllEmployees();
        return Employees;
    }

    public static void setEmployees(ArrayList<Employee> Employees) {
        Employees = Employees;
    }

    public static Employee getManager() {
        Employee.AllEmployees();
        return Employee.Employees.get(0);
    }

    // All Employees are Pre-defined in the System, to ensure that ONLY Employees Can Signup & Login
    public static void AllEmployees() {
        if (Employees.isEmpty()) {
            Employees.add(new Employee("0001", "Nora", "Ahmad", "0526372862", true));
            Employees.add(new Employee("0002", "Farah", "Handom", "0567692392", false));
            Employees.add(new Employee("0003", "Sara", "Mohammed", "0553789983", false));
            Employees.add(new Employee("0004", "Lama", "Ali", "0555378387", false));
            Employees.add(new Employee("0005", "Noor", "Saad", "0505778838", false));
            Employees.add(new Employee("0006", "Jood", "Musharraf", "0505393384", false));
            Employees.add(new Employee("0007", "Rozana", "Sendii", "0534552838", false));
        }
    }

    @Override
    public boolean equals(Object o) {
        Employee employee = (Employee) o;
        if (this.getID().equals(employee.getID())
                && this.getFirstName().equals(employee.getFirstName())
                && this.getLastName().equals(employee.getLastName())
                && this.getPhone().equals(employee.getPhone())
                && (this.getIsManager() == employee.getIsManager())) {
            return true;
        }
        return false;
    }

    // Check If User That Want to Sign Up Is Employee or Not
    public static Boolean isEmployeeID(String id) {
        Employee.AllEmployees();
        for (int i = 0; i < Employee.Employees.size(); i++) {
            if (Employee.Employees.get(i).getID().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
