
package caracol;

import java.io.*;

public class Archivo {

   public void leer(String Archivo){
       
       int k = 0;
       String[] vector = null;
         
       try {
            FileReader r = new FileReader(Archivo);
            BufferedReader buffer = new BufferedReader(r);
           
            String temp = "";
            boolean f = true;
            
            while(temp != null){
                k++;
                temp = buffer.readLine();
                String x;
                x = temp;
                vector = x.split(" ");
                
                /*for (int i = 0; i < vector.length; i++) {
                    System.out.println(vector[i] + "-" + x);
                    System.out.println(k + "6");
                }*/
            Mover e = new Mover(vector);
            e.reloj();
            }
            
        } catch (Exception e) {
            System.out.println("fin " + e);
        }
        
   }
    
}
