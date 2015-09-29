// double forward slash will treat everyhing following until the end of the line as a comment

/*
forward slash asterisk will treat everthing as a comment multiple lines)
until it finds a matching asterisk forward slash
*/

public class Scratch{
	public static void main(String[] args){
		
		
		
		String greeting = "Hello World!";
		System.out.println(greeting);
		
		int x = 5;
		System.out.println(x);
		
		int y;
		y = 3;
		x = 7;
		System.out.println("x = "+x); // the plus sign acts as a concatentation operator with type String
		System.out.println("y = "+y);
		
		int z = x + y; // the + acts an an addition operator for numbers
		System.out.println("z = "+z);
		
		z = 10 % 4; // modulus operator gives the remainder
		System.out.println("10 % 4 == "+z);
		
		char c = 'A';
		x= c;
		System.out.println("c == "+c);
		System.out.println("x == "+x);
		
		//Octal literals start with zero
		x = 020;
		System.out.println("x == "+x);
		
		// Hex literals start with 0x
		x = 0xFF;
		System.out.println("x == "+x);
		
		//floating point data types are not to be trusted
		
			
			//for loops make repetive taskes easier
		for(int ix = 0; ix < 10; ix++) {
			System.out.println("ix == "+ix);
			
		}
	}
}