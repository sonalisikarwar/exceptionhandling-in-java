/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shivaafoundation.javatutorial;

/**
 *
 * @author SAPNA
 */
import java.util.Random;
        class HandleError {
    public static void main (String args[]){
        int a=0, b=0, c=0;
        Random r = new Random();
        
        for(int i=0; i<3200; i++){
            try {
                b= r.nextInt();
                c=r.nextInt();
                a=12345/(b/c);
                
            } catch (ArithmeticException e){
                System.out.println("Division by zero.");
                a=0; //set to zero and continue
            }
            System.out.println("a:" +a);
        }
    }
    
}
