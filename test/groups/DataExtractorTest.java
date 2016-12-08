

package groups;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INTEX INFO
 */
public class DataExtractorTest {
    

    /**
     * Test of extractStudents method, of class DataExtractor.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testExtractStudents() throws Exception {
        System.out.println("extractStudents");
        String file = "liste4eme.xlsx";
        DataExtractor instance = new DataExtractor(file);
        List<Student> students = instance.extractStudents();
        System.out.println(students.size());
        assertEquals(students.size(), 81);
  
    }
    /**
     * Test of selectOnlyBoys method, of class DataExtractor.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testSelectOnlyBoys() throws Exception {
        System.out.println("selectOnlyBoys");
        String file = "liste4eme.xlsx";
        DataExtractor instance = new DataExtractor(file);
        List<Student> boys = instance.selectOnlyBoys();
        System.out.println(boys.size());
        assertEquals(boys.size(), 37);

    }
    /**
     * Test of selectOnlyBoys method, of class DataExtractor.
     * @throws java.lang.Exception
     */
    @org.junit.Test
    public void testSelectOnlyGirls() throws Exception {
        System.out.println("selectOnlyGirls");
        String file = "liste4eme.xlsx";
        DataExtractor instance = new DataExtractor(file);
        List<Student> girls = instance.selectOnlyGirls();
        System.out.println(girls.size());
        assertEquals(girls.size(), 44);

    }
   
    
}
