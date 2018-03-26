import java.util.ArrayList;
import java.util.List;

/**
 * This class represents a list of employees that can be cloned,
 * which is a remedial implementation of a Prototype Design Pattern
 * Reference: https://www.journaldev.com/1440/prototype-design-pattern-in-java 
 */
public class Employee {
    private List<String> empList;

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> list) {
        this.empList = list;
    }

    // initialize the object
    public void loadData() {
        // read all employees from database and put into the list
        empList.add("Ryder Dale");
        empList.add("Lindsay Elizabeth");
        empList.add("Aliza Dale");
        empList.add("Alivia Parker");
    }

    public List<String> getEmpList() {
        return empList;
    }

    // Notice how the clone object is overwritten to perform
    // a deep copy. This means the two will be independent of
    // one another.
    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();

        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}
