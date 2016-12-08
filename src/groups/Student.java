

package groups;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author abachi
 */
public class Student {
    
    protected int id;
    protected String fullName;
    protected Date birthDay;
    protected double sexe;
    protected List<Student> boys;
    protected List<Student> girls;
    
    public static final int BOY = 1;
    public static final int GIRL = 2;
    
    public Student(Row r){
        this.id =  (int)r.getCell(DataExtractor.ID).getNumericCellValue();
        this.fullName = r.getCell(DataExtractor.FULL_NAME).getStringCellValue();
        /**
         * @TODO: deal with birthday of each student
         */
       // this.birthDay = r.getCell(2).getDateCellValue();
        this.sexe = r.getCell(DataExtractor.SEXE).getNumericCellValue();
    }
    public static List<Student> selectOnlyBoys(List<Student> students) {
        
        List<Student> boys = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.sexe == Student.BOY) {
                boys.add(s);
            }
        }
        return  boys;
    }
    public static List<Student> selectOnlyGirls(List<Student> students){
        List<Student> girls = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.sexe == Student.GIRL) {
                girls.add(s);
            }
        }
        return girls;
    }
    /* geters  */
    public String getFullName(){
        return this.fullName;
    }
    public double getId(){
        return this.id;
    }
    public Date getBirthDay(){
        return this.birthDay;
    }
    
    /* seters  */
    public void setFullName(String fn){
        this.fullName = fn;
    }
    public void getId(int id){
        this.id = id;
    }
    public void getBirthDay(Date bd){
        this.birthDay = bd;
    }

}
