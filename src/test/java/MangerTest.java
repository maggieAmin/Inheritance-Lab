import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MangerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Pob", 123456, 100000, "Engineering");
    }

    @Test
    public void managerHasName(){
        assertEquals("Pob", manager.getName());
    }

    @Test
    public void manager_has_a_ni_number(){
        Integer expectedResult = 123456;
        assertEquals(expectedResult, manager.getNiNumber());
    }

    @Test
    public void manager_has_salary(){
        double expectedSalaryResult = 100000;
        assertEquals(expectedSalaryResult, manager.getSalary(), 0.1);
    }

    @Test
    public void manager_can_get_a_raise(){
        assertEquals(101000, manager.raiseSalary(1000), 0.0);
    }

    @Test
    public void manager_can_get_bonus(){
        assertEquals(1000, manager.payBonus(), 0.0);
    }
}
