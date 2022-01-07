import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// In this class we want to read the input file properly: throw exceptions, split commas and parse "int" salaries.

public class Inputs implements InputInterface{
    private String position;
    private String name;
    private int salary;
    private String director;
    private String fileName;
    private BufferedReader reader;
    private String line = "";

    public Inputs(String txtName) throws FileNotFoundException {
        this.fileName = txtName;
        reader = new BufferedReader(new FileReader(txtName));  // File is reading
    }

    public boolean Next() throws IOException {
        if((line = reader.readLine()) != null){
            String line[] = this.line.split(","); // Split commas
            position = line[0];
            name = line[1];
            salary = Integer.parseInt(line[2]);
            director = line[3];
            return true;
        }
        else return false;
    }


    // Get-set methods

    @Override
    public String getName() {return name;}

    @Override
    public void setName(String name) {this.name = name;}

    @Override
    public int getSalary() {return salary;}

    @Override
    public void setSalary(int salary) {this.salary = salary;}

    @Override
    public String getPosition() {return position;}

    @Override
    public void setPosition(String position) {this.position = position;}

    @Override
    public String getDirector() {return director;}

    @Override
    public void setDirector(String director) {this.director = director;}
}
