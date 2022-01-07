public class IteratingClass implements Iterator{

    // For iterate around employee list, we implement Iterator(interface) class to "IteratorClass"
    // Thus, we can control every element in employee list like "is there any element after current element and pass to next element" methods.

    EmployeeInterface empList[] = new EmployeeInterface[12];

    public IteratingClass(EmployeeInterface[] list){
        this.empList = list;
    }

    int index = 0;
    @Override
    public boolean hasNext() {
        if(index >= empList.length || empList[index] == null){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public Object next() {
        EmployeeInterface emp = empList[index];
        index += 1;

        return emp;
    }
}
