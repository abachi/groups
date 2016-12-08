/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package groups;

import org.apache.poi.ss.usermodel.Row;

/**
 *
 * @author INTEX INFO
 */
public class Girl extends Student{
   
    public Girl(Row r){
        super(r);
        this.sexe = 2; // 2 as a girl
    }
}
