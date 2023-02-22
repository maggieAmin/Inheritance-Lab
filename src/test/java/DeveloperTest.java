import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Jonathan", 987654, 600000);
    }

    @Test
    public void developer_has_name(){
        assertEquals("Jonathan", developer.getName());
    }

    @Test
    public void developer_has_niNumber(){
        Integer expectedResult = 987654;
        assertEquals(expectedResult, developer.getNiNumber());
    }

    @Test
    public void developer_has_salary(){
        double expectedSalaryResult = 600000;
        assertEquals(expectedSalaryResult, developer.getSalary(), 0.1);
    }
}
