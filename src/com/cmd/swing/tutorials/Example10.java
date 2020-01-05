package com.cmd.swing.tutorials;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Example10 {

	public static void main(String[] args) {
		/***
		 * The CardLayout lays out components in a container as a stack of cards. Like a stack of cards, only one card (the card at
the top) is visible in a CardLayout. It makes only one component visible at a time. You need to use the following steps
to use a CardLayout for a container:
• Create a container such as a JPanel.
JPanel cardPanel = new JPanel();
• Create a CardLayout object.
CardLayout cardLayout = new CardLayout();
• Set the layout manager for the container.
cardPanel.setLayout(cardLayout);
• Add components to the container. You need to give a name to each component. To add a
JButton to the cardPanel, use the following statement:
cardPanel.add(new JButton("Card 1"), "myLuckyCard");
You have named your card myLuckyCard. This name can be used in the show() method of the
CardLayout to make this card visible.
• Call its next() method to show the next card.
cardLayout.next(cardPanel);

The CardLayout class provides several methods to flip through components. By default, it shows the first
component that was added to it. All flipping-related methods take the container it manages as its argument. The
first() and last() methods show the first and the last card, respectively. The previous() and next() methods show
the previous and the next card from the card currently being shown. If the last card is showing, calling the next()
method shows the first card. If the first card is showing, calling the previous() method shows the last card.


CardLayout is not used very often because all but one component are hidden from the user. A JTabbedPane,
which is easier to use, provides functionality similar to a CardLayout.
		 */

		JFrame frame=new JFrame("CardLayout test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane=frame.getContentPane();
		JPanel buttonPanel=new JPanel();
		JButton nextButton=new JButton("Next");
		buttonPanel.add(nextButton);
		contentPane.add(buttonPanel,BorderLayout.SOUTH);
		
		final JPanel cardPanel=new JPanel();
		final CardLayout cardLayout=new CardLayout();
		cardPanel.setLayout(cardLayout);
		
		for (int i =1; i <= 5; i++) {
			JButton card=new JButton("Card "+i);
			card.setPreferredSize(new Dimension(200,200));
			String cardName="card"+1;
			cardPanel.add(card,cardName);
			
		}
		
		contentPane.add(cardPanel, BorderLayout.CENTER);
		nextButton.addActionListener(l->cardLayout.next(cardPanel));
		
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
