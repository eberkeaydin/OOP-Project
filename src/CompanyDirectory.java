import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Interface{
    private List<Interface> employeeList = new ArrayList<Interface>();

    public void showEmployeeDetails(){
        for(Interface face : employeeList){
            face.showEmployeeDetails();
        }
    }

    public void addEmployee(Interface face)
    {
        employeeList.add(face);
    }

    public void removeEmployee(Interface face)
    {
        employeeList.remove(face);
    }

    public void getChild(Director director){ // To find director's officer.

    }
}
