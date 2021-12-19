public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        if (salary < 0){
            this.salary = 0;
        }
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void listEmployees(){
        // Listing employees which are working under any Director.

    }

    public void calcCost(){
        // Calculate the cost of any director or officer to company.

    }
}
