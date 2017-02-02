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
        int firstArg=0;
           //System.out.println(args.length); 
           if(args.length<1)
           {
               System.out.println("Using RNG defaults to determine PI");
               firstArg=2;
           }
           else //parse command line
           {
               
             try {
            firstArg = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                   System.exit(1);
                }
           }
          for(int i=0;i<firstArg;i++){
           System.out.println(Math.random()); 
          }
    }
    
}
