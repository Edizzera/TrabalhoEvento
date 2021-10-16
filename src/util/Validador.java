package util;



import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public interface Validador {
     default boolean validaData(String date)  {
             SimpleDateFormat df = new java.text.SimpleDateFormat("dd/MM/yyyy");

            try {
                Calendar c = Calendar.getInstance();
                c.setTime(df.parse(date));
                if (c.get(Calendar.YEAR) == 2021) {
                    System.out.println("Validado");
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Ano Inválido!");
                    return false;
                }
            }
            catch(ParseException e){
                JOptionPane.showMessageDialog(null,"Formato de Data inválido!");
            }
            return false;
    }
}
