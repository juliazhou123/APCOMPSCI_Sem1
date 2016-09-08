import java.util.Scanner; //import Statement

public class Lab_031
{
	public static void main(String[]args)
	{
		//instantiate the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("What is your name?");
		
		String name = keyboard.next();
		
		System.out.println(name + "?!!  Why would anyone name a baby that?" + "\n" + "How old are you, " + name + "?");
		
		int age = keyboard.nextInt();
		
		System.out.println("Oooooo!!!" + age + " is getting up there." + "\n" + "What do you do for fun, " + name + "?" );
		
		String hobby = keyboard.next();
		
		System.out.println(" I thought only nerds like to " + hobby + " What kind of music do you like?");
		
		String music = keyboard.next();
		
		System.out.println(" Boooo!!!  I wouldn't wish the sound of" + music + " on my worst enemy." + " How many siblings do you have?");
		
		int siblings = keyboard.nextInt();
		
		System.out.println(siblings + "?" + " Wow, I hope the rest of your family is better looking." + " What do you want to be when you grow up?");
		
		String career = keyboard.next();
		
		System.out.println(" I think you'd have to be smarter to be a " + career + " So, " + name + ", you're" + age + "..." + "You like to" + hobby + "and listen to" + music + "..." + "Good luck becoming a" + career + "I'm only kidding, " + name + ".");
	}
}