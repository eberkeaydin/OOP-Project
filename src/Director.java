public class Director implements EmployeeInterface {

    private String name;
    private int salary;
    private int totalSalary = 0;
    public static final String position = "D";
    private String director;

    private EmployeeInterface empList[] = new EmployeeInterface[12]; // To determine employee's sub employees
    private int curr = 0;  // For adding elements to array

    public Director(String name, int salary, String director) {
        this.name = name;
        this.salary = salary;
        this.totalSalary += salary;
        this.director = director;
    }

    private boolean isSalaryCalculated = false; // If salary calculating for any employee this variable is true, else: false.

    @Override
    public void showEmployeeDetails(){
        System.out.println(getName() + " |" + " Salary : " + getSalary() + " | Director : " + getDirector());
        Iterator iterator = CreateIterator();

        while(iterator.hasNext()){   // Is there any sub employee? If there is : keep going.
            System.out.print("    ");
            EmployeeInterface f = (EmployeeInterface) iterator.next();  // Pass to next employee.
            f.showEmployeeDetails();   // Show employee's info
            if(!isSalaryCalculated){
                totalSalary += f.getTotalSalary(); // Plus employee's salary and employee's sub employee's salaries to calculate total cost.
            }
        }
        isSalaryCalculated = true;
    }

    @Override
    public void TotalSalary() {
        System.out.println("Cost of employee to company: " + getTotalSalary()); // Total cost per employee
    }

    @Override
    public Iterator CreateIterator() {
        return new IteratingClass(empList); // Creating an iterator for getting around inside of employee's list.
    }

    public void AddEmployee(EmployeeInterface emp){ // For adding sub employees.
        empList[curr] = emp;
        curr++;
    }

    public void removeEmployee(EmployeeInterface emp){  // For removing sub employees.

        int index;
        for (int i = 0; i< empList.length-1; i++){
            if(empList[i].equals(emp)){
                for(int j = i; j< empList.length-1; j++){
                    empList[j]= empList[j+1];
                }
                curr--;
                break;
            }
        }
    }

    // Get-set methods
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getSalary() {return salary;}

    public void setSalary(int salary) {this.salary = salary;}

    public int getTotalSalary() {return totalSalary;}

    public void setTotalSalary(int totalSalary) {this.totalSalary = totalSalary;}

    public String getDirector() {return director;}

    public void setDirector(String director) {this.director = director;}
}
