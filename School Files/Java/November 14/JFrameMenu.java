// Demo of creating JMenus
// In Java Swing, menus can be attached only to objects of classes that provide method 
// "setJMenuBar" ,  i.e. JFrame and JApplet.

//  A menu bar is a collection of menus. 
//  A menu in turn, contains a collection of menu items, 
//  which can have names 

// To create a menu and menu items:
// --------------------------------
/*
1. Create a menu bar
	e.g.:	JMenuBar mb = new JMenuBar();

2. Create the menu
	e.g.:	JMenu mainmenu = new JMenu("Main");

3.	Create items for that menu
	e.g:	JMenuItem item1 = new JMenuItem("item1");

4.	Register listener to that item
	e.g:	item1.addActionListener(this);

5.	Add that item to that menu
	e.g:	mainmenu.add(item1);

6.	Add menu to menu bar
	e.g:	mb.add(mainmenu);

7.	Finally set that menu bar active
	e.g:	setJMenuBar(mb);

*/

///////////////////////////////////////////
/*
To create a sub menu
---------------------
Perform 1 - 5 from above

6.	Create sub menu
	e.g:	JMenu submenu = new JMenu("submenu");

7.	Create sub menu item
	e.g:	JMenuItem subitem1 = new JMenuItem("subitem1");

8.	Register listener to that item 
	e.g:	subitem1.addActionListener(this);

9.	Add item to sub menu
	e.g:	submenu.add(subitem1);

10.Add sub menu to main menu
	e.g:	mainmenu.add(submenu);
*/
///////////////////////////////////
// menus and menu items can be disabled and enabled by using "setEnabled(boolean)"
//	e.g:	item1.setEnabled(false);		disables menu item item1
//			item1.setEnabled(true);			enables item1
//
//			mainmenu.setEnabled(false)		disables the entire main menu	
//////////////////////////////////////////////////////
/*
Keyboard Shortcut using "mnemonics"

A "mnemonic" provides a keyboard shortcut for the menu. 

1. If a mnemonic is set for a menu, then that menu can be opened
	by holding down the "ALT" key and pressing the specified character key

	e.g:		mainmenu.setMnemonic('M');

	So, ALT-M will open the main menu

2. A mnemonic can be set for an item of a menu, in which case if 
	the menu is already opened, you can simply press the character key

	e.g:		item1.setMnemonic('I');

Note: * Points 1,2 above applies for JFrame,
		  However, if mainmenu is for JApplet, then point 1) may NOT work

		* mnemonics are not case sensitive, and can be set for any 
        character key.
	  
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameMenu extends JFrame implements ActionListener
{
    
	 Container con;
	
	 JMenuBar mb;
	 JMenu coloursmenu, morecolourssubmenu;
	 JMenuItem red, blue, green, pink; 

    public void createScreen()
    {

  		con = getContentPane();    
		
	  			// create  JMenuBar
         mb = new JMenuBar();            
	
		
		   // create JMenu
         coloursmenu = new JMenu("Colours Menu");
         
         red = new JMenuItem("Red"); //setting JMenuItems
         blue = new JMenuItem("Blue");
         red.addActionListener(this); //adding Action Listener
         blue.addActionListener(this);
         coloursmenu.setMnemonic('C'); //Setting the Mnemonic for the main menu
         red.setMnemonic('R'); //Setting Mnemoics for the items
         blue.setMnemonic('B');
         coloursmenu.add(red); //Adding them to the main menu
         coloursmenu.add(blue);
         mb.add(coloursmenu); //Adding them to the menu bar
         
														// set mnemonic for JMenu (ALT-mnemonic)
														// MAY NOT work for JApplet but fine for JFrame

			// create item for JMenu
		
			// register that listener
		
					// add item to JMenu
	
				// set mnemonic for "red"
		
		
	
			// register that listener
	
					// add item to JMenu
	
			
	 			
		// add separator line to JMenu
      coloursmenu.addSeparator();
	

        // create submenu
	      morecolourssubmenu = new JMenu("More colours");
         green = new JMenuItem("Green");
         pink = new JMenuItem("Pink");
         green.addActionListener(this);
         pink.addActionListener(this);
         morecolourssubmenu.setMnemonic('M');
         green.setMnemonic('G');
         pink.setMnemonic('P');
         morecolourssubmenu.add(green);
         morecolourssubmenu.add(pink);
         coloursmenu.add(morecolourssubmenu);
         setJMenuBar(mb); //Setting the menubar active. (do not forget this.)
		  
	 
      	// add item to submenu				
        
		// register
			
     	// add submenu to main JMenu
	
			// add main JMenu to JMenuBar
	//		mb.add(coloursmenu);
			// set JMenuBar active
	//		setJMenuBar(mb);
		
       
    }

    public void actionPerformed(ActionEvent e)
    {
    	if (e.getSource() == red)
      {
         con.setBackground(Color.RED);
         JOptionPane.showMessageDialog(null, "Red", "Red", JOptionPane.INFORMATION_MESSAGE);
      }
      else if (e.getSource() == green)
      {
         con.setBackground(Color.GREEN);
         JOptionPane.showMessageDialog(null, "Green", "Green", JOptionPane.INFORMATION_MESSAGE);
         
      }
      else if (e.getSource() == blue)
      {
         con.setBackground(Color.BLUE);
         JOptionPane.showMessageDialog(null, "Blue", "Blue", JOptionPane.INFORMATION_MESSAGE);
         
      }
      else
      {
         con.setBackground(Color.PINK);
         JOptionPane.showMessageDialog(null, "Pink", "Pink", JOptionPane.INFORMATION_MESSAGE);
         
      }      
				
			
						  
	 }
    
    public static void main(String args[])
	{
		JFrameMenu jm = new JFrameMenu();
      jm.createScreen();
      jm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	 // set size
	  jm.setSize(400,400);
    // display window
    jm.setVisible(true);
     
     
	}


}



