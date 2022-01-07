public interface EmployeeInterface {

    // In our composite design pattern, "EmployeeInterface" class is composite class according to leaf-composite classes in pattern structure.

    void showEmployeeDetails();
    void TotalSalary();
    Iterator CreateIterator();

    public void AddEmployee(EmployeeInterface emp);

    public void removeEmployee(EmployeeInterface emp);
    public String getName();
    public void setName(String name);
    public int getSalary();
    public void setSalary(int salary);
    public int getTotalSalary();
    public void setTotalSalary(int totalSalary);
    public String getDirector();
    public void setDirector(String director);
}
