public class Director extends Employee implements Interface{

    public Director(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void showEmployeeDetails(){
        System.out.println("Director's info is printing..");
    }
}
