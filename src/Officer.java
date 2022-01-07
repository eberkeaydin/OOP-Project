public class Officer implements EmployeeInterface {

    private String name;
    private int salary;
    private String director;
    public static final String position = "M";
    private int totalSalary = 0;

    // In officer class we determine employee's position as "M" according to girdi.txt
    // In below Officer class has constructor and get-set methods.

    public Officer(String name, int salary, String director) {
        this.name = name;
        this.salary = salary;
        this.director = director;
        totalSalary += salary; // To calculate cost per employee to company we plus salaries.
    }

    @Override
    public void showEmployeeDetails(){ // To show employee's info and cost to company
        System.out.println(getName() + " |" + " Salary : " + getSalary() + " | Director : " + getDirector());
    }

    @Override
    public void TotalSalary() {
        System.out.println("Cost of employee to company: " + getTotalSalary()); // Total cost per employee
    }

    @Override
    public Iterator CreateIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void AddEmployee(EmployeeInterface interf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removeEmployee(EmployeeInterface interf) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    // Get-set methods
    public String getName() {return name;}

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(int totalSalary) {
        this.totalSalary = totalSalary;
    }
}
