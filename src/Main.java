public class Main {

    public static void main(String[] args) { // Calling methods
        Officer officer1 = new Officer("Eba", 20000);
        CompanyDirectory ofcDirectory = new CompanyDirectory();
        ofcDirectory.addEmployee(officer1);

        Director director1 = new Director("Patron", 50000);
        CompanyDirectory dirDirectory = new CompanyDirectory();
        dirDirectory.addEmployee(director1);

        CompanyDirectory mainDirectory = new CompanyDirectory();
        mainDirectory.addEmployee(ofcDirectory);
        mainDirectory.addEmployee(dirDirectory);

        mainDirectory.showEmployeeDetails();
    }
}
