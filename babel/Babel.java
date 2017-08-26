package babel;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import translator.Translator;

public class Babel implements ActionListener, KeyListener
{
	private File fileToTranslate; 
	private String languageToTranslateTo;
	private JFrame programWindow = new JFrame("Babel");
	
	private Translator translator = new Translator();
	
	public static void main(String[] args) 
	{
		Babel babel = new Babel();
		babel.setUpUI();
	}

	private void setUpUI()
	{
		GridLayout programLayout = new GridLayout(2, 2);
		programWindow.setLayout(programLayout);
		
		Component [] programComponents = getProgramComponents();
		for(Component component : programComponents)
			programWindow.add(component);
		
		programWindow.pack();
		programWindow.setVisible(true);
	}
	
	private Component[] getProgramComponents()
	{
		Component[] result = {new JTextField(30),new JTextField(30),new JButton("Translate"),new JButton("Quit")};
		
		JTextField fileToTranslateTextField = new JTextField(30);
		fileToTranslateTextField.setActionCommand("translate");
		fileToTranslateTextField.addKeyListener(this);
		
		JButton translateButton = new JButton("Translate");
		translateButton.setActionCommand("translate");
		translateButton.addActionListener(this);
		
		JButton quitButton = new JButton("Quit");
		quitButton.setActionCommand("quit");
		quitButton.addActionListener(this);
		
		return result;
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		if(event.getActionCommand().equals("translate"))
			translate();
		
		if(event.getActionCommand().equals("quit"))
			quit();
		
	}
	
	public void translate()
	{
		fileToTranslate = new File(((JTextField)(programWindow.getComponent(0))).getText());
		languageToTranslateTo = ((JTextField)(programWindow.getComponent(1))).getText();
		
		translator.translate(fileToTranslate, languageToTranslateTo);
	}
	
	public void quit()
	{
		System.exit(0);
	}


	@Override
	public void keyReleased(KeyEvent e) 
	{
		if(e.getKeyChar() == KeyEvent.VK_ENTER)
		{
			translate();
		}
	}

	@Override
	public void keyPressed(KeyEvent arg0) 
	{
		//No Action to take on keyPressed Event
	}

	@Override
	public void keyTyped(KeyEvent e) 
	{
		//No Action to take on keyTyped Event
	}

	
}
