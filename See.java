<<<<<<< HEAD
package Database;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class See implements ActionListener
	{
    
      private static JFrame frameShow;
      private DefaultComboBoxModel nameModel = new DefaultComboBoxModel<>();
  	  private JComboBox nameDrop = new JComboBox(nameModel);
  	  
  	
  	 
      public void actionPerformed(ActionEvent e){
          String command = e.getActionCommand();
          
          if (command.equals("Change Details"))
			{
          	if(DatabaseFinalV3.getsecondWindowIsOpne(0)==false&&Data.getContactSize()>0)
				{
          		
          	    DatabaseFinalV3.setsecondWindowIsOpne(0, true);//secondWindowIsOpne  = true;
					
						frameShow = new JFrame("See Details");
						frameShow.setSize(400,100);
						frameShow.setLocation(200 ,100);
						JPanel seeDetails = new JPanel();
						frameShow.add(seeDetails, BorderLayout.NORTH);
						JPanel panel = new JPanel();
						JButton show = new JButton("Show");
						frameShow.getRootPane().setDefaultButton(show);
						show.requestFocus();
						show.addActionListener(new Show());
						frameShow.add(panel);
						panel.add(show);
						fillDropBox(); 
						Dimension dropSize = new Dimension(200,20);
						nameDrop.setPreferredSize(dropSize);
						nameDrop.addItemListener(new ItemListener() {
							
							@Override
							public void itemStateChanged(ItemEvent e) {
								// TODO Auto-generated method stub
								if(e.getStateChange()==1)
								{
									//GlobalNames.setName(nameDrop.getSelectedItem().toString());
									GlobalValues.setName(nameDrop.getSelectedItem().toString());
								}
							}
						});
						panel.add(nameDrop);
						frameShow.setVisible(true);
						frameShow.addWindowListener(new WindowAdapter()
						{              
							public void windowClosing(WindowEvent e)
							{
								// handle closing the window
								DatabaseFinalV3.setsecondWindowIsOpne(0, false);//secondWindowIsOpne = false;
								frameShow.setVisible(false);
								frameShow.dispose();
							}
						});               
              
          	}
          }
      }
      
      public static void closeFrameShow()
      {
    	  frameShow.dispose();
      }  
      public void fillDropBox()
    	{
    	  nameModel.removeAllElements();
    	    String empty = "";
    	    nameModel.addElement( empty );
    		
    		String[] arrName = null;
    		arrName = Data.getNames();
    		for( String newRow : arrName ) {
    			nameModel.addElement( newRow );
    		}
    		nameDrop.setModel(nameModel);
    	}
        

=======
package Database;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class See implements ActionListener
	{
    
      private static JFrame frameShow;
      private DefaultComboBoxModel nameModel = new DefaultComboBoxModel<>();
  	  private JComboBox nameDrop = new JComboBox(nameModel);
  	  
  	
  	 
      public void actionPerformed(ActionEvent e){
          String command = e.getActionCommand();
          
          if (command.equals("Change Details"))
			{
        	 System.out.println(DatabaseFinalV3.getsecondWindowIsOpne(0));
          	if(DatabaseFinalV3.getsecondWindowIsOpne(0)==false&&Data.getContactSize()>0)
				{
          	    DatabaseFinalV3.setsecondWindowIsOpne(0, true);//secondWindowIsOpne  = true;
					
						System.out.println("See method called in change details");
					
						frameShow = new JFrame("See Details");
						frameShow.setSize(400,100);
						frameShow.setLocation(200 ,100);
						JPanel seeDetails = new JPanel();
						frameShow.add(seeDetails, BorderLayout.NORTH);
						JPanel panel = new JPanel();
						JButton show = new JButton("Show");
						frameShow.getRootPane().setDefaultButton(show);
						show.requestFocus();
						show.addActionListener(new Show());
						frameShow.add(panel);
						panel.add(show);
						fillDropBox(); 
						Dimension dropSize = new Dimension(200,20);
						nameDrop.setPreferredSize(dropSize);
						nameDrop.addItemListener(new ItemListener() {
							
							@Override
							public void itemStateChanged(ItemEvent e) {
								// TODO Auto-generated method stub
								if(e.getStateChange()==1)
								{
									//GlobalNames.setName(nameDrop.getSelectedItem().toString());
									GlobalValues.setName(nameDrop.getSelectedItem().toString());
								}
							}
						});
						panel.add(nameDrop);
						frameShow.setVisible(true);
						frameShow.addWindowListener(new WindowAdapter()
						{              
							public void windowClosing(WindowEvent e)
							{
								// handle closing the window
								DatabaseFinalV3.setsecondWindowIsOpne(0, false);//secondWindowIsOpne = false;
								frameShow.setVisible(false);
								frameShow.dispose();
							}
						});               
              
          	}
          }
      }
      
      public static void closeFrameShow()
      {
    	  frameShow.dispose();
      }  
      public void fillDropBox()
    	{
    	  nameModel.removeAllElements();
    	    String empty = "";
    	    nameModel.addElement( empty );
    		
    		String[] arrName = null;
    		arrName = Data.getNames();
    		for( String newRow : arrName ) {
    			nameModel.addElement( newRow );
    		}
    		nameDrop.setModel(nameModel);
    	}
        

>>>>>>> origin/master
  }