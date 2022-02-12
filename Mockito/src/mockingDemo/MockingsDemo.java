package mockingDemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class MockingsDemo {
    EmployeeService employeeService;
    @Before
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeService(employeeService);
    }
}
