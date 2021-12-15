public class Officer extends Employee implements Interface{

    public Officer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public void showEmployeeDetails(){
        System.out.println("Informations is printing..");
    }
}
