package chatbot.controller;

import chatbot.model.Chatbot;
import chatbot.view.ChatbotFrame;
import chatbot.view.ChatbotView;
/**
 * The Controller for the chatbot
 * @author Jacob Smith
 *@version 1.3 10/23/13 Adding Model to the project and changedGUI load. Added a getter for the Chatbot
 *Removed the references to the popup view added Documentation.
 */
public class ChatbotController
{
	/**
	 * the application frame for the Chatbot program
	 */
	private ChatbotFrame appFrame;
	/**
	 * The main chatbot for the application
	 */
	private Chatbot appBot;
	
	/**
	 * creates a chatbotcontroller and initializes the chatbot model instance
	 */
	public ChatbotController()
	{
		appBot = new Chatbot();
	}
	
	/**
	 * getter method for the chatbot instance.
	 * @return
	 */
	
	public ChatbotFrame getAppFrame()
	{
		return appFrame;
	}

	
	public Chatbot getAppBot()
	{
		return appBot;
	}
	
	/**
	 * Initializes the ChatbotFrame for the GUI
	 * @return
	 */
	public void start()
	{
		appFrame = new ChatbotFrame(this);
	}
}
