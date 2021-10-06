package util;

import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public interface Validador {
     default boolean validaData(String date) throws ParseException {
             SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");

             Calendar c = Calendar.getInstance();
             c.setTime(df.parse(date));
             if( c.get(Calendar.YEAR) == 2021 ) {
                 System.out.println("Data Válida!");
                 return true;
             }else{
                 JOptionPane.showMessageDialog(null,"Data inválida!");
         } return false;
    }
}
