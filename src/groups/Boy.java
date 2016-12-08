

package groups;

import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author abachi
 */
public class Boy extends Student{

    public Boy(Row r) {
        super(r);
        this.sexe = 1; // 1 as a boy
    }
  
}
