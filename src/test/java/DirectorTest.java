import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Colette", 101010, 200000, "Management", 200);
    }

    @Test
    public void director_has_name(){
        assertEquals("Colette", director.getName());
    }

    @Test
    public void director_has_niNumber(){
        Integer expectedResult = 101010;
        assertEquals(expectedResult, director.getNiNumber());
    }

    @Test
    public void director_has_salary(){
        double expectedSalaryResult = 200000;
        assertEquals(expectedSalaryResult, director.getSalary(), 0.1);
    }

    @Test
    public void director_has_budget(){
        double expectedbudget = 200;
        assertEquals(expectedbudget, director.getBudget(), 0.1);
    }
    }
