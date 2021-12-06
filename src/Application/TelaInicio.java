package Application;


//import java.text.ParseException;

//import entities.FrameInicio;
import Entities.TelaCliente;



public class TelaInicio {

        public static void main(String[] args) throws Exception {

               
                TelaCliente frame = new TelaCliente() ; 
                
                frame.setBounds(10,10,800,550); 
               
                
                
                //TableFromMySqlDatabase frame1 = new TableFromMySqlDatabase();
                frame.setVisible(true);

        }

}