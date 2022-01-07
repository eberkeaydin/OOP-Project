import java.io.IOException;

public class Main {

    // In "Main" class we finally read file, create hierarchial employee list structure, iterate the structure then show infos and cost per employee.

    public static void main(String[] args) throws IOException {

        EmployeeInterface f; // Creating employee object.
        EmployeeInterface empList[] = new EmployeeInterface[12]; // Creating employee list for adding employees according to reading input file.
        InputInterface txtFile = new Inputs("girdi.txt");  // For reading input file we creating an object according to "InputInterface" class requirements.

        int index = 0;
        while (txtFile.Next()) {
            if (txtFile.getPosition().equals("M")) { // If employee is officer, position will be "M". Else : position will be "D".
                f = new Officer(txtFile.getName(), txtFile.getSalary(), txtFile.getDirector()); // Officer object is created.
            }
            else {
                f = new Director(txtFile.getName(), txtFile.getSalary(), txtFile.getDirector()); // Director object is created.
            }
            empList[index] = f; // Object is adding to employee list.
            index++;
        }
// Oluşan işçi nesnelerinin direktör eklemeli için kullanılan algoritma
        for (int i = 0; i < empList.length; i++) {   //ilk eleman alt işçi olduğunda eklemek için
            for (int j = 0; j < empList.length; j++) { // ikinci eleman direktörünün kim olduğunu bulmak için
                if (empList[i].getName().contains(empList[j].getDirector())) { // 2. elemanın direktörü 1. eleman ise 1. elemanın alt çalışanı olarak eklenir
                    empList[i].AddEmployee(empList[j]);
                }
            }
        }

        for (int i = 0; i < empList.length; i++){
            if (empList[i].getName().equals("Mustafa Turksever")){
                empList[i].showEmployeeDetails();
                empList[i].TotalSalary();
            }
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < empList.length; i++){
            if (empList[i].getName().equals("Oguz Demir")){
                empList[i].showEmployeeDetails();
                empList[i].TotalSalary();
            }
        }

        System.out.println("-------------------------------------------");

        for (int i = 0; i < empList.length; i++){
            if (empList[i].getName().equals("Ahmet Egeli")){
                empList[i].showEmployeeDetails();
                empList[i].TotalSalary();
            }
        }

    }

}
