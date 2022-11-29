import java.sql.SQLOutput;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		response = response.trim();
		if (statement.indexOf("no") >= 0 || (statement.indexOf("No") >=0))
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0//To Prioritize it you will put it higher up in the code.
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		else if(statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0) {
			response = "Tell me more about your pet";
		}
		else if(statement.indexOf("hobbies") >= 0 || statement.indexOf("hobby") >= 0) {
			response = "I would like to know more about hobbies you are interested in";
		}
		else if(statement.indexOf("no") >= 0) {
			response = "Ok, that's fine.";
		}
		else if(statement.indexOf("like") >= 0) {
			response = "Me too!";
		}

		else if(statement.indexOf("yes") >= 0) {
			response = "Nice, that's cool!";
		}
		else if(statement.indexOf("school") >= 0 || statement.indexOf("School") >= 0) {
			response = "What grade are you in?";
		}
		else if(statement.indexOf("grade") >= 0) {
			response = "Ok, what is your favorite class?";
		}
		else if(statement.indexOf("math") >= 0) {
			response = "I'm not very good at math";
		}
		else if(statement.indexOf("english") >=0 || statement.indexOf("English") >= 0) {
			response = "I know how to write very well";
		}
		else if(statement.indexOf("Bye") >= 0 || statement.indexOf("bye") >=0) {
			response = "Bye, it was nice talking to you!";
		}
		{
			response = getRandomResponse();
		}

		if (statement.indexOf("Hello") >=0 || (statement.indexOf("Hey")) >=0 || (statement.indexOf("hello")) >=0 || (statement.indexOf("hey")) >=0)
		{
			response = "What is your name?";
		}
		else if (statement.indexOf("What is your name") >=0 || (statement.indexOf("Name")) >=0 || (statement.indexOf("name")) >=0)
		{
			response = "My name is Timmy.";
		}
		else if (statement.indexOf("Mr.") >=0 || (statement.indexOf("Mrs.")) >=0 || statement.indexOf("mr.") >=0 || statement.indexOf("mrs.") >=0)
		{
			response = "They sounds like a good teacher.";
		}
		else if (statement.indexOf("dog") >=0 || (statement.indexOf("Dog")) >=0)//To prioritize this you will move it up above mom line.
		{
			response = "What kind of dog?";
		}
		else if (statement.indexOf("cat") >=0 || (statement.indexOf("Cat")) >=0)
		{
			response = "What kind of cat?";
		}
		else if (statement.indexOf("yes") >=0 || (statement.indexOf("yep")) >=0)
		{
			response = "Why so positive?";
		}
		else if (statement.indexOf("old") >=0 || (statement.indexOf("Old")) >=0)
		{
			response = "I'm not even a year old.";
		}
		else if (statement.indexOf("Shut up") >=0 || (statement.indexOf("Quite")) >=0)
		{
			response = "";
		}
		else if (statement.indexOf("What is up") >=0 || (statement.indexOf("Whats up")) >=0 || (statement.indexOf("What's up")) >=0)
		{
			response = "The ceiling.";
		}
		else if (statement.indexOf("Sorry") >=0 || (statement.indexOf("sorry")) >=0)
		{
			response = "Why are you sorry.";
		}
		else if (statement.indexOf("You are mean") >=0 || (statement.indexOf("You are rude")) >=0 || (statement.indexOf("Your mean")) >=0 || (statement.indexOf("Your rude")) >=0)
		{
			response = "Oh sorry did not mean to be.";
		}
		else if (statement.indexOf("Blue") >=0 || (statement.indexOf("Green")) >=0 || (statement.indexOf("Red")) >=0 || (statement.indexOf("Orange")) >=0 || (statement.indexOf("color")) >=0)
		{
			response = "My favorite color is Blue. What is yours?";
		}
		else if (statement.indexOf("Interesting") >=0 || (statement.indexOf("interesting")) >=0)
		{
			response = "Indeed it is very interesting";
		}
		else if (statement.indexOf("Thanks") >=0 || (statement.indexOf("Thanks you")) >=0 || (statement.indexOf("thanks") >=0 || (statement.indexOf("thank you")) >=0))
		{
			response = "Your welcome";
		}
		else if (statement.indexOf("What you doing") >=0 || (statement.indexOf("Wyd")) >=0 || (statement.indexOf("what you doing") >=0 || (statement.indexOf("wyd")) >=0))
		{
			response = "Talking to you";
		}
    return response;
	}






	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 10;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "How come?";
		}
		else if (whichResponse == 5)
		{
			response = "What?";
		}
		else if (whichResponse == 6)
		{
			response = "What is your favorite food?";
		}
		else if (whichResponse == 7)
		{
			response = "Who is your favorite teacher?";
		}
		else if (whichResponse == 8)
		{
			response = "What you doing?";
		}
		else if (whichResponse == 9)
		{
			response = "What is your favorite animal?";
		}
		else if (whichResponse == 10)
		{
			response = "Do you have a dog?";
		}
		else if (whichResponse == 11)
		{
			response = "Wow...";
		}
		else if (whichResponse == 12)
		{
			response = "Intriguing";
		}
		return response;
	}
}
