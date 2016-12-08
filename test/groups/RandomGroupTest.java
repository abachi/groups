/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groups;

import com.graphbuilder.math.func.RandFunction;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author INTEX INFO
 */
public class RandomGroupTest {
    
    

    @Test
    public void testSomeMethod() throws Exception {
        
        String file = "liste4eme.xlsx";
        DataExtractor instance = new DataExtractor(file);
        List<Student> students = instance.extractStudents();
        RandomGroup rg = new RandomGroup(students, 4);
        Group []groups = rg.getGroups();  
        assertEquals(rg.getGroups().length, 4);
    }
    
}
