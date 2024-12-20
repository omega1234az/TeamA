

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentInfoTest {

    
    @Test
    public void testCalculateAge() {
        
        int age = main.calculateAge(2004);  
        assertEquals(20, age, "Age should be 20 for birth year 2004");

        
        age = main.calculateAge(2024);  // ปีเกิดคือ 2024 (อายุ 0)
        assertEquals(0, age, "Age should be 0 for birth year 2024");
    }

    
    @Test
    public void testScoreToGrade() {
       
        String grade = main.scoreToGrade(85);  
        assertEquals("A", grade, "Grade should be A for score 85");

        
        grade = main.scoreToGrade(75);  
        assertEquals("B+", grade, "Grade should be B+ for score 75");

        
        grade = main.scoreToGrade(30);  
        assertEquals("F", grade, "Grade should be F for score 30");
    }
}


