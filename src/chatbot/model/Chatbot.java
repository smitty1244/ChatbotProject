package chatbot.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * this is the model for the chatbot.
 * 
 * @author Jacob Smith
 * @version 1.5
 */
public class Chatbot
{
	/**
	 * this provides a list for the memes that i want to talk about.
	 */
	private ArrayList<String> myMemes;
	/**
	 * this provides a list for the Super Smash Bros characters that i want to
	 * talk about.
	 */
	private ArrayList<String> mySB;

	/**
	 * this makes the lists of memes and characters available for all classes to
	 * call.
	 */
	private ArrayList<String> myRandomList;

	public Chatbot()
	{
		myMemes = new ArrayList<String>();
		mySB = new ArrayList<String>();
		myRandomList = new ArrayList<String>();
		
		fillTheMemeList();
		fillTheSBList();
		fillTheRandomList();
	}
/**
 * this fills the list of random things.
 */
	private void fillTheRandomList()
	{
		myRandomList.add("penguins");
		myRandomList.add("I have to say something random?");
		myRandomList.add("You don't want that?");
		myRandomList.add("cat");
	}
/**
 * this gets a random topic from the random list.
 * @return this returns a random topic from the random list.
 */
	public String getRandomTopic()
	{
		String randomTopic = "";

		double myRandomNumber = Math.random();
		int myRandomListPosition = (int) (myRandomNumber * myRandomList.size());
		randomTopic = myRandomList.get(myRandomListPosition);

		return randomTopic;
	}

	/**
	 * this is all the items in the super smash bros characters list
	 */
	private void fillTheSBList()
	{
		mySB.add("Captain Falcon");
		mySB.add("Donkey Kong");
		mySB.add("Jigglypuff");
		mySB.add("Kirby");
		mySB.add("Link");
		mySB.add("Ness");
		mySB.add("mario");
		mySB.add("luigi");
		mySB.add("yoshi");
		mySB.add("pikachu");
		mySB.add("Samus");
		mySB.add("Bowser");
	}

	/**
	 * 
	 * @param the
	 *            parameters of this are the Super Smash Bros Characters that i
	 *            mentioned in the list above.
	 * @return this returns whether the Super Smash Bros Character that the user
	 *         mentioned is on the list.
	 */
	public boolean SBChecker(String currentChar)
	{
		boolean isSBChar = false;

		if (currentChar != null)
		{
			for (String currentChars : mySB)
			{
				if (currentChar.equalsIgnoreCase(currentChars))
				{
					isSBChar = true;
				}
			}
		}
		return isSBChar;
	}

	/**
	 * this is the list of memes that i want to talk about.
	 */
	private void fillTheMemeList()
	{
		myMemes.add("my jammies are rustled");
		myMemes.add("grumpy cat");
		myMemes.add("troll dad");
		myMemes.add("icanhasacheeseburger?");
	}

	/**
	 * 
	 * @param the
	 *            parameters of this are any of the memes that i chose to talk
	 *            about.
	 * @return this returns that any of the memes that the user decided to talk
	 *         about is a meme that i want to talk about.
	 */
	public boolean memeChecker(String currentPhrase)
	{
		boolean isMeme = false;

		if (currentPhrase != null)
		{
			for (String currentMeme : myMemes)
			{
				if (currentPhrase.equalsIgnoreCase(currentMeme))
				{
					isMeme = true;
				}
			}
		}
		return isMeme;
	}

	/**
	 * this is a conversation piece to further the of the chatbot.
	 */
	public void conversationPiece()
	{
		// Must have at least 3 lines of interaction with the user aka
		// JOptionPane.showInputDialog
		// conversation piece = movies

		String FMovie = JOptionPane
				.showInputDialog("What's up dude? what is your favorite movie?");
		String answer = JOptionPane
				.showInputDialog("Dude!!!! How could you possibly like "
						+ FMovie
						+ "!!!! that movie is the worst movie ever. Do you like Toy Story?");
		if (answer.equalsIgnoreCase("yes"))
		{
			JOptionPane
					.showMessageDialog(
							null,
							"you have got to be my favorite pesron in the world, that i have talked to, today, from this class period.");
		}
		else if (answer.equalsIgnoreCase("no"))
			;
		{
			JOptionPane.showMessageDialog(null, "you have no honor");
		}
	}

}
