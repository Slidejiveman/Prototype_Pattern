import java.util.List;

/**
 * Clones the Employee object, which is a demonstration of the
 * Prototype Creational Design Pattern. It modifies some of the lists
 * and then prints them out.
 */
public class Main {
    public static void main (String[] args) throws CloneNotSupportedException {
        Employee emps = new Employee();
        emps.loadData();

        // use the clone method to get the Employee object
        Employee newEmps = (Employee) emps.clone();
        Employee newEmps2 = (Employee) emps.clone();
        List<String> list = newEmps.getEmpList();
        list.add("John Harold");
        List<String> list2 = newEmps2.getEmpList();
        list2.remove("Ryder Dale");

        // print out the results
        System.out.println("emps List: " + emps.getEmpList());
        System.out.println("newEmps: " + list);
        System.out.println("newEmps2: " + list2);
    }
}
