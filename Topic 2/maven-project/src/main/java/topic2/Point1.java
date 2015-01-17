package topic2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Point1 
{
    private static Scanner scannerInput;

	public static void main( String[] args )
    {
        System.out.println ("Please enter your name: ");
        String keyboardInput = "";
        scannerInput = new Scanner (System.in);
        keyboardInput = scannerInput.nextLine (); 
        System.out.println ("Hello \"" + keyboardInput +"\"");
    }
}
