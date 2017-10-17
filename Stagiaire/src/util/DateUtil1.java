/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author B_Abdeslam
 */
public class DateUtil1 {
    


    public static String format(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        return format.format(date);

    
}

    
}
