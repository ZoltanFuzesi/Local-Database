package Database;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Action implements ActionListener,WindowListener
{
	private static JFrame frame3;
	private DefaultComboBoxModel nameModel = new DefaultComboBoxModel<>();
	private JComboBox nameDrop = new JComboBox(nameModel);
	private static int stateChange = 0;
	
	
	
      public void actionPerformed(ActionEvent e)
		{
          String command = e.getActionCommand();

          if (command.equals("   Add to database   "))
			{
              detailsFrame.detailsFrame();
          }
          else if (command.equals("Delete from database"))
			{
          	if(DatabaseFinalV3.getsecondWindowIsOpne(2)==false)
				{
           	    DatabaseFinalV3.setsecondWindowIsOpne(2, true);//secondWindowIsOpne2  = true;
					if(Data.getContactSize()==0)
					{
						//Do nothing
					}
				
              else if(Data.getContactSize()>0)
				{
                  frame3 = new JFrame("Delete from database");
                  frame3.setSize(300,100);
                 // frame3.setMinimumSize(new Dimension(300,150));
                 // frame3.setResizable(false);
                  frame3.setLocation(200,100);
 
                  JPanel panel = new JPanel();
                  JButton find = new JButton("Delete");
                  frame3.getRootPane().setDefaultButton(find);
                  find.requestFocus();
                  frame3.add(panel);
                  panel.add(find);    
                  fillDropBox();
                //  autoComboBox.autoComboBox(); // fill jcombobox***************************************
                  find.addActionListener(new Action4());
                  panel.add(nameDrop);
                  Dimension dropSize = new Dimension(200,20);
				  nameDrop.setPreferredSize(dropSize);
                  nameDrop.addItemListener(new ItemListener() {
						
						@Override
						public void itemStateChanged(ItemEvent e) {
							// TODO Auto-generated method stub
							if(e.getStateChange()==1)
							{
								GlobalValues.setName(nameDrop.getSelectedItem().toString());
								
							}
						}
					});
                  frame3.addWindowListener(new WindowAdapter()
					{
                	public void windowClosing(WindowEvent e)
					{
                	  //    DatabaseFinalV3.setsecondWindowIsOpne(2, false);//secondWindowIsOpne2 = false;
                	      DatabaseFinalV3.setsecondWindowIsOpne(2, false);//secondWindowIsOpne2 = false;
						  frame3.dispose();
                	}
					});
                  frame3.setVisible(true);
                  frame3.addWindowListener(this);
                  stateChange=2;
           
					}     
              }
          }
          else if (command.equals("       Add Photo    "))
			{
          	if(DatabaseFinalV3.getsecondWindowIsOpne(3) == false)
				{
           	   DatabaseFinalV3.setsecondWindowIsOpne(3, true);//secondWindowIsOpne3  = true;
					if(Data.getContactSize()==0)
					{
						//Do nothing
					}
					
					else if(Data.getContactSize()>0)
					{
						frame3 = new JFrame("Find in database");
						//frame3.setSize(300,200);
						frame3.setMinimumSize(new Dimension(300,100));
						frame3.setResizable(false);
						frame3.setLocation(200,100);
						JPanel panel = new JPanel();
						JButton find = new JButton("Add Photo");
						frame3.getRootPane().setDefaultButton(find);
						find.requestFocus();
						frame3.add(panel);
						panel.add(find);
						 fillDropBox();
					//	autoComboBox.autoComboBox();// fgill combobox*********************
						find.addActionListener(new ImagePreviewPanel());                
						panel.add(nameDrop);
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
						//String srtGet = text.getText();
						for(int i=0;i<Data.getContactSize();i++)
						{
							String tempString = Data.getSelectedItem(i, "name");//Data.Contacts.get(i).name;
							if(GlobalValues.getName().equalsIgnoreCase(tempString))
							{
								Temp.Temp(i);
							}
						}
						frame3.setVisible(true);
						frame3.addWindowListener(this);
						stateChange = 3;
					
					}
				}
			}
		}
  
      public static void closeFrame3()
	  {
		  DatabaseFinalV3.setsecondWindowIsOpne(2, false);//secondWindowIsOpne2 = false;
		  frame3.dispose();
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
      
      @Override
  	public void windowClosing(WindowEvent e) {
  		// TODO Auto-generated method stub
    	  if(stateChange == 2)
    	  {
    		  DatabaseFinalV3.setsecondWindowIsOpne(2, false);//secondWindowIsOpne2 = false;
    	  }
    	  else if(stateChange == 3)
    	  {
    		  DatabaseFinalV3.setsecondWindowIsOpne(3, false);//secondWindowIsOpne3 = false;
    	  }
    	 // frame3.dispose();
  	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
		 
}
                  
              
          
          
      
   
  
