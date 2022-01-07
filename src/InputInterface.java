import java.io.IOException;

public interface InputInterface {

    // Iterator interface is for abstraction of "Inputs" class.

    public String getPosition();
    public void setPosition(String position);
    public String getName();
    public void setName(String name);
    public int getSalary();
    public void setSalary(int salary);
    public String getDirector();
    public void setDirector(String director);

    public boolean Next() throws IOException;
}
