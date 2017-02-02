/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_mc;

/**
 *
 * @author systouf
 */
public class PI_MC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           //System.out.println(args.length); 
           if(args.length<1)
           {
               System.out.println("Using RNG defaults to determine PI");
           }
           else //parse command line
           {
               
           }
          
           System.out.println(Math.random()); 
       
    }
    
}
