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
        double x=0,y=0,dist=0,NumCirHits=0,NumSqHits=0;
           //System.out.println(args.length); 
           if(args.length<1)
           {
               System.out.println("Using RNG defaults to determine PI");
               firstArg=100000;
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
          for(int i=0;i<firstArg;i++)
          {
              
              x=Math.random();
              y=Math.random();
              dist=x*x+y*y;
               
              if(dist>0)
                {
                        dist=Math.sqrt(dist);
                        
                            if(dist<=1.0)
                            {
                            NumCirHits+=1.0;
                            }
                        NumSqHits+=1.0;
                       

                }

              }
           if(NumSqHits>0)
                System.out.println(4*NumCirHits/NumSqHits); 
    
    }
    
}
