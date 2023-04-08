import org.employees.hw8_2.Employee;
import org.employees.hw8_2.EmployeeUtils;
import org.employees.hw8_2.Manager;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmployeeUtilsTest {
    final Employee[] testEmployees1 = {
            new Employee("Sylvia", 200),
            new Employee("Bill", 100),
            new Employee("Mark", 400)
    };
    final Manager[] testManagers = {
            new Manager("Maria", 500, 3),
            new Manager("Bob", 600, 7),
            new Manager("Tom", 550, 5)
    };


    @Test
    public void testFindName() {

        Assert.assertEquals(EmployeeUtils.findByName("Mark", testEmployees1), 2);
    }

    @Test
    public void testSubName() {
        Assert.assertEquals(EmployeeUtils.findBySubName("Bi", testEmployees1), 1);
    }

    @Test
    public void salarySum() {
        Assert.assertEquals(EmployeeUtils.salarySum(testEmployees1), 700);
    }

    @Test
    public void testMinEmployee() {
        Assert.assertEquals(EmployeeUtils.min(testEmployees1), 500);
    }

    @Test
    public void testMinManager() {
        Assert.assertEquals(EmployeeUtils.min(testManagers), 500);
    }

    @Test
    public void testMaxExtraMan() {
        Assert.assertEquals(EmployeeUtils.maxExtraManger(testManagers), 126);
    }

}
