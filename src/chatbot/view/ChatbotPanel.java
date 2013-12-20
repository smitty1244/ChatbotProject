package chatbot.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chatbot.controller.ChatbotController;
import chatbot.model.Chatbot;

public class ChatbotPanel extends JPanel
{
	private ChatbotController baseController;
	private Chatbot appBot;
	private SpringLayout baseLayout;
	private JButton submitChatButton;
	private JTextField userTextField;
	private JTextArea chatArea;

	public ChatbotPanel(ChatbotController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getAppBot();

		submitChatButton = new JButton("Click here to type to the chatbot!");
		baseLayout = new SpringLayout();
		userTextField = new JTextField(30);
		chatArea = new JTextArea(10, 30);

		setupPanel();
		setupLayout();
		setupListeners();
		setupChat();
	}

	private void setupChat()
	{
		chatArea.setText(appBot.getRandomTopic());
	}

	private void setupPanel()
	{
		this.setBackground(Color.BLACK);
		this.setLayout(baseLayout);
		this.add(chatArea);
		this.add(submitChatButton);
		this.add(userTextField);

	}

	private void setupListeners()
	{
		/**
		 * Do this when the submitChatButton is clicked
		 */
		submitChatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userInput = userTextField.getText();
				chatArea.append(userInput );
				chatArea.append(appBot.getRandomTopic());
			}
		});
	}

	private void setupLayout()
	{

		baseLayout.putConstraint(SpringLayout.WEST, submitChatButton, 128,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, userTextField, 18,
				SpringLayout.SOUTH, submitChatButton);
		baseLayout.putConstraint(SpringLayout.WEST, userTextField, 102,
				SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, submitChatButton, 18,
				SpringLayout.SOUTH, chatArea);
		baseLayout.putConstraint(SpringLayout.NORTH, chatArea, 18,
				SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, chatArea, 103,
				SpringLayout.WEST, this);

	}
}
