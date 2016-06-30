package Database;



import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.io.File;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.imageio.ImageIO;

public class DatabaseFinalV3 extends JFrame implements ActionListener
{

    private static final int SHORTCUT_MASK = 0;
    private JMenuBar menubar;
	private  JMenu menu, submenu;
    private  JMenuItem menuItem;
    private  JMenuItem menuItem2;
    private JFrame searchF;
    private static boolean secondWindowIsOpne = false;
    private static boolean secondWindowIsOpne1 = false;
    private static boolean secondWindowIsOpne2 = false;
    private static boolean secondWindowIsOpne3 = false;
    private static boolean secondWindowIsOpne4 = false;
    private static boolean secondWindowIsOpne5 = false;
    private static boolean secondWindowIsOpne6 = false;
    private static boolean secondWindowIsOpne7 = false;
    private static boolean secondWindowIsOpne8 = false;
    private	DefaultComboBoxModel searchByName = new DefaultComboBoxModel();	
	private	JComboBox nameDropbox = new JComboBox(searchByName);
	private static DatabaseFinalV3 dbObj;

    public DatabaseFinalV3()
    {
    	super("Database");
    	drawFrame(); 	
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
	{
    	dbObj = new DatabaseFinalV3();
	}
    
  
    
    private void drawFrame()
    {
        mkFolder.mkFolder();
        try {
			readFromFolder.readFromFolder();
		} catch (ClassNotFoundException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

        menubar = new JMenuBar();
        JMenu menu;
        JMenuItem item;
        
        // create the File menu
        menu = new JMenu("File");
        menubar.add(menu);
        submenu = new JMenu("Other Folders");
        //C:\Database_Images
        
        menuItem = new JMenuItem("Pictures folder");
        
        menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
        menuItem.addActionListener(new ActionListener() 
		{
                 public void actionPerformed(ActionEvent e)
                 {
                     try {
						Desktop.getDesktop().open(new File("C:\\Database_Images"));
						} catch (IOException e1) {
						e1.printStackTrace();
						}; }
        });
  
        menuItem2 = new JMenuItem("Backup folder");
        menuItem2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
        menuItem2.addActionListener(new ActionListener()
		{
                  public void actionPerformed(ActionEvent e) 
                  {
                      try {
						Desktop.getDesktop().open(new File("C:\\Database_Backup"));
						} catch (IOException e1) {
						e1.printStackTrace();
						}; }
        });
        
        item = new JMenuItem("Database Users");
            item.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, SHORTCUT_MASK));
            item.addActionListener(new ActionListener()
			{
                    public void actionPerformed(ActionEvent e) 
                    {
                        try {
							Desktop.getDesktop().open(new File("C:\\Database"));
							} catch (IOException e1) {
							e1.printStackTrace();
							}; }
            });
            menu.add(item);
            submenu.add(menuItem);
            submenu.add(menuItem2);
            menu.add(submenu);
				// create the Help menu
			menu = new JMenu("Help");
			menubar.add(menu);      
			item = new JMenuItem("About Database");
            item.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					showAbout(); 
				}
            });
            
			menu.add(item);
			JPanel panel = new JPanel();
			JPanel toolbar = new JPanel();
			JPanel top = new JPanel();
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setMinimumSize(new Dimension(700,500));
			setExtendedState(JFrame.MAXIMIZED_BOTH); 
			//device.setFullScreenWindow(frame);
			setUndecorated(false);
			setResizable(true);
			setLocation(0,0);
			toolbar.setLayout(new GridLayout(1, 0));
			add(top, BorderLayout.WEST);//************************
			add(toolbar, BorderLayout.NORTH);
			add(panel);    
			setTitle("Database");
			//*****************set image background
			BufferedImage image = null;
			try {
				image = ImageIO.read(DatabaseFinalV3.class.getClass().getResourceAsStream("/images/DataB.jpg"));
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			ImageIcon img =  new ImageIcon(image);  
			JLabel labBack = new JLabel(img, SwingConstants.CENTER);
			panel.add(labBack);

			JButton button = new JButton("   Add to database   ");       
			button.addActionListener(new Action());

			JButton delete = new JButton("Delete from database");      
			delete.addActionListener(new Action());

			JButton find = new JButton("       Add Photo    ");  
			find.addActionListener(new Action());

			JButton see = new JButton("Change Details");  
			see.addActionListener(new See());

			JButton mentes = new JButton("No function");  
			mentes.addActionListener(new Mentes());

			JButton btn1 = new JButton("Search in Database");
			btn1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					if(secondWindowIsOpne4==false&&Data.getContactSize()>0)
					{
		        		secondWindowIsOpne4 = true;
						searchF = new JFrame("Search in database");
						JPanel searchP = new JPanel();
						JButton src = new JButton("Show Details");
						searchF.getRootPane().setDefaultButton(src);
						src.requestFocus();		    	
                        searchF.add(searchP);                                
						searchP.add(src);//button  
						src.addActionListener(new Show());
						fillDropBox();
						Dimension dropSize = new Dimension(200,20);
						nameDropbox.setPreferredSize(dropSize);
						nameDropbox.addItemListener(new ItemListener() {
							
							@Override
							public void itemStateChanged(ItemEvent e) {
								// TODO Auto-generated method stub
								if(e.getStateChange()==1)
								{
									GlobalValues.setName(nameDropbox.getSelectedItem().toString());									
								}
							}
						});
						searchP.add(nameDropbox);
						searchF.setSize(400, 100);
						searchF.setLocation(100,100);
						searchF.setResizable(false);
						searchF.setVisible(true);
						searchF.addWindowListener(new WindowAdapter() 
						{
		                  	public void windowClosing(WindowEvent e)
							{
		                  	    setsecondWindowIsOpne(4, false);//secondWindowIsOpne4 = false;
		                  	    searchF.dispose();
		                  	}
		                });
					}	    	
	            }
		     });
			JButton btn2 = new JButton("Reload");// need action something USE LATER
			btn2.addActionListener(new ActionListener() {
				                //@Override
				                public void actionPerformed(ActionEvent e) {
				                	//DatabaseFinalV3 dbObj = new DatabaseFinalV3();
				                	dispose();
				                	Data.removeAll();
				                	dbObj = null;
				                	System.gc();
				                	dbObj = new DatabaseFinalV3();
				                
				                	
				                }
				           });
			setJMenuBar(menubar);
			top.add(button);			
			toolbar.add(button);
			toolbar.add(delete);
			toolbar.add(find);
			toolbar.add(btn1);
			toolbar.add(see);         
			toolbar.add(btn2);
			toolbar.add(mentes);
			panel.setBackground(Color.WHITE);
			setVisible(true);    
    }
      
    private void showAbout()
    {
    	int size = Data.getContactSize();
        String text = "Database by Zoltan Fuzesi\n"
        + "Total number of Database: " +   size  + "\n"// need getter for data size
         + "1.0";                              
      JOptionPane.showMessageDialog(null, text,
                            "About Database", 
                            JOptionPane.INFORMATION_MESSAGE);                                                                            
    }
    
    public static void setsecondWindowIsOpne(int position, boolean value)
    {
    	switch(position)
    	{
    		case 0:secondWindowIsOpne = value;break;
    		case 1:secondWindowIsOpne1 = value;break;
    		case 2:secondWindowIsOpne2 = value;break;
    		case 3:secondWindowIsOpne3 = value;break;
    		case 4:secondWindowIsOpne4 = value;break;
    		case 5:secondWindowIsOpne5 = value;break;
    		case 6:secondWindowIsOpne6 = value;break;
    		case 7:secondWindowIsOpne7 = value;break;
    		case 8:secondWindowIsOpne8 = value;break;
    		default:break;
    	}
    }
    
    public static boolean getsecondWindowIsOpne(int position)
    {
    	boolean ans = false;
    	switch(position)
    	{
    		case 0:ans = secondWindowIsOpne;break;
    		case 1:ans = secondWindowIsOpne1;break;
    		case 2:ans = secondWindowIsOpne2;break;
    		case 3:ans = secondWindowIsOpne3;break;
    		case 4:ans = secondWindowIsOpne4;break;
    		case 5:ans = secondWindowIsOpne5;break;
    		case 6:ans = secondWindowIsOpne6;break;
    		case 7:ans = secondWindowIsOpne7;break;
    		case 8:ans = secondWindowIsOpne8;break;
    		default:break;
    	}
    	return ans;
    }
    
    public void fillDropBox()
	{
    	String empty = "";
    	searchByName.addElement( empty );
		searchByName.removeAllElements();
		searchByName.addElement( empty );
		String[] arrName = null;
		arrName = Data.getNames();
		for( String newRow : arrName ) {
			searchByName.addElement( newRow );
		}
		nameDropbox.setModel(searchByName);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

  
}

