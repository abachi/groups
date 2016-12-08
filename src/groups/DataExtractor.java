package groups;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author abachi
 */
public class DataExtractor {
    
   
    protected static final int ID = 0;
    protected static final int FULL_NAME = 1;
    protected static final int BIRTH_DAY = 2;
    protected static final int SEXE = 3;
    protected String filePath;
    protected List<Student> students;
    protected List<Student> boys;
    protected List<Student> girls;
    
    public DataExtractor(String filePath){
        this.filePath = filePath;
    }
    
    public List<Student> extractStudents() throws Exception{
       
        if(this.students != null){
            return this.students;
        }
        List<Student> data;
        try (FileInputStream file = new FileInputStream(new File(filePath))) {
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            data = new ArrayList<>();
            for (int i = 1; i < 82; i++) {
                switch (sheet.getRow(i).getCell(DataExtractor.SEXE).getCellType()) {
                    case Cell.CELL_TYPE_NUMERIC:
                        Student s = new Student(sheet.getRow(i));
                        data.add(s);
                        break;
                    case Cell.CELL_TYPE_STRING:
                        break;
                }
                
            }
        }
        
        return this.students = data;
    }
    
    public List<Student> selectOnlyBoys() throws Exception{
        if(this.boys != null) 
            return this.boys;
        
        if(this.students == null){
            List<Student> students = this.extractStudents();
        }
        List<Student> boys = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if(s.sexe == Student.BOY){
                boys.add(s);
            }
        }
        return this.boys = boys;
    }
    
    public List<Student> selectOnlyGirls() throws Exception {
        if (this.girls != null) {
            return this.girls;
        }

        if (this.students == null) {
            List<Student> students = this.extractStudents();
        }
        List<Student> girls = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.sexe == Student.GIRL) {
                girls.add(s);
            }
        }
        return this.girls = girls;
    }
}
