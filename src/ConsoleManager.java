import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class ConsoleManager 
{

	protected ArrayList<Xbox360> = new Xbox360;
	protected ArrayList<PlayStation3>  = new PlayStation3;

public void instancingConsoles()
{
	Date date1 = new Date(10,06,2013);
	Date date2 = new Date(22,11,2005);
	Date date3 = new Date(11,11,2006);
	Date date4 = new Date(4,10,2012);
	
	
	this.xb360.add(new Xbox360(false, "Xbox 360 S", "Microsoft", date1, true, Platforms.XBOX360, 4.0, 320.00, false));   
	this.xb360.add(new Xbox360(false, "Xbox 360 Premium", "Microsoft", date2, true, Platforms.XBOX360, 1.0, 80.00, false));     
	this.ps3.add(new PlayStation3(false, "PlayStation 3 60GB", "Sony", date3, true, Platforms.PLAYSTATION3, 1.0, 60.00, false));
	this.ps3.add(new PlayStation3(false, "PlayStation 3 Super Slim", "Sony", date4, true, Platforms.PLAYSTATION3, 1.0, 500.00, false));

}
}

	        
	        
  /*      switch (op) 
        {    
        	case 1:   	
            {  
            	op -=1;
            	
            	try{	
            	
                    System.out.println("The object at " + op + " is a "+ xboxes.get(op).getModel());
        		}
                catch (ArrayIndexOutOfBoundsException e){
                	System.out.println("Sorry, that index is out of bounds. A default index will be assigned. ");
                    op = 0;
                }         
                
            	if (xboxes.get(op) instanceof Xbox360)
            	{
            		
        			xboxes.get(op).power_ON();
	      		   	xboxes.get(op).menu(); 
    			}	
	              
            	break;   		   
        	}
            
            
            case 2: 
            {
            	op -=1;
            	
            	try{	
            	
                    System.out.println("The object at " + op + " is a "+ xboxes.get(op).getModel());
        		}
                catch (ArrayIndexOutOfBoundsException e){
                	System.out.println("Sorry, that index is out of bounds. A default index will be assigned. ");
                    op = 0;
                }         
                
            	if (xboxes.get(op) instanceof Xbox360)
            	{
            		
        			xboxes.get(op).power_ON();
	      		   	xboxes.get(op).menu(); 
    			}	
	              
            	break;   		
            }
   
            
            case 3: 
            {
            	op -=3;
            	
            	try{	
            	
                    System.out.println("The object at " + op + " is a "+ playstations.get(op).getModel());
        		}
                catch (ArrayIndexOutOfBoundsException e){
                	System.out.println("Sorry, that index is out of bounds. A default index will be assigned. ");
                    op = 0;
                }         
                
            	if (playstations.get(op) instanceof PlayStation3)
            	{
            		
            		playstations.get(op).power_ON();
            		playstations.get(op).menu(); 
    			}	
	              
            	break;   		
            }
            
            case 4:
            {
            	op -= 3;
            	
            	try{	
                	
                    System.out.println("The object at " + op + " is a "+ playstations.get(op).getModel());
        		}
                catch (ArrayIndexOutOfBoundsException e){
                	System.out.println("Sorry, that index is out of bounds. A default index will be assigned. ");
                    op = 0;
                }         
                
            	op -= 3;
            	
            	if (playstations.get(op) instanceof PlayStation3)
            	{
            		
		    		   playstations.get(op).power_ON();
		     		   playstations.get(op).menu();	     		  
                }
            		break;
            }
            	default: 
            		System.out.println("Invalid choice.");        	
        }
        scanner.close();
	}
	
public int posNum(final Scanner scan) 
{
	    int input = 0;
	    boolean error = false;
	    if (scan.hasNext()) {
	        if (scan.hasNextInt()) {
	            input = scan.nextInt();
	            error = input <= 0;
	        } else {
	            scan.next();
	            error = true;
	        }
	    }
	    while (error) {
	        System.out.print("Invalid input. Please reenter: ");
	        if (scan.hasNextInt()) {
	            input = scan.nextInt();
	            error = input <= 0;
	        } else {
	            if (scan.hasNext())
	                scan.next();
	            error = true;
	        }
	    }
	    return input;
	}
	*/


