/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices_hilos;

/**
 *
 * @author USER
 */
import java.util.Random;

public class secundaria {
 
 
  
  
    public void llenar(int m[][]){
  Random random=new Random();
        for(int i=0; i<m.length;i++){
           for(int j=0; j<m.length;j++){
            m[i][j]=random.nextInt(20);  
        } 
       }
      
      }
     
    public void imprimir(int m [][]){
        
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                System.out.print("|"+m[i][j]+"|"+"\t");
                
            }
             System.out.println( );
         }
      }
      public void sumar(int m[][], int m2[][]){
      int s=0;
      int s2=0;
      int r=0;
      double tiempo=0;
       try{
             long inicio = System.currentTimeMillis();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                            s=s+m[i][j];
        }       
    }
        for (int p = 0; p < m2.length; p++) {
            for (int z = 0; z < m2.length; z++) {
            s2=s2+m2[p][z];
            r=s+s2;
        }
            Thread.sleep(2000);
         
        long fin = System.currentTimeMillis();
         
         tiempo = (double) ((fin - inicio)/1000);
         
          }
        System.out.println(tiempo +" segundos");
        System.out.println("suma de las dos matrices:"+r);   
    }catch(Exception ex){
              ex.printStackTrace();
      
    
    }
      }
}