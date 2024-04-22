package ASCIIValue;


// Print the ASCII value and its corresponding character

public class DisplayAsciiSet 
{
	public static void main(String[] args) {
		for (int i = 0; i <= 255; i++) {
            System.out.printf("ASCII Value: %d --> Character: %c\n", i, (char) i);
            
            //System.out.println("ASCII Value of "+i+" is : "+(char)i);
        }
	}
}
