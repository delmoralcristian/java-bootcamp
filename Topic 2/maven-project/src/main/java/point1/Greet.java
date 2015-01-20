package point1;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Greet 
{
    private static Scanner scannerInput;

	public static void main( String[] args )
    {
        System.out.println ("Please enter your name: ");
        String keyboardInput = "";
        scannerInput = new Scanner (System.in);
        keyboardInput = scannerInput.nextLine (); 
        System.out.println ("Heeeello \"" + keyboardInput +"\"");
    }
}
