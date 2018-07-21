/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrador
 */
public class NotaMayor {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0]=18;
        notas[1]=18;
        notas[2]=20;
        notas[3]=10;
        double mayor = notas[0];
        
        for (int k=0; k<3; k++)
        {
          
            if (notas[k+1]>notas[k])
              {
                  mayor=notas[k+1];
              }
            
         }
        
        System.out.println("nota mayor:" + mayor);
    }
    
}
