<<<<<<< HEAD
package Database;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImagePreviewPanel implements ActionListener
	{

     private int width, height;
     private int returnVal;
     private ImageIcon icon;
     private Image image;
     private static final int ACCSIZE = 155;
     private Color bg;
     String propertyName ;
     private BufferedImage sbi;

     public void actionPerformed(ActionEvent e) 
		{
         String command = e.getActionCommand();
         
         if (command.equals("Add Photo"))
			{
        	 if(GlobalValues.getName().equalsIgnoreCase(""))
        	 {
        		 JOptionPane.showMessageDialog(null, "Please select a name ");
        	 }
        	 else
        	 {
             String t = GlobalValues.getName();//text.getText();
             String passingName = GlobalValues.getName();//text.getText();
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
             FileNameExtensionFilter filter=new FileNameExtensionFilter("images", "jpg","gif","png");
             fileChooser.setFileFilter(filter);
             returnVal=fileChooser.showOpenDialog(null);
             File selectedFile=fileChooser.getSelectedFile();
             File targetLocation = new File("C:\\Database_Images");
             if(returnVal==JFileChooser.APPROVE_OPTION)
				{
                 if(selectedFile.getName().endsWith(".JPG")||selectedFile.getName().endsWith(".jpg"))//||selectedFile.getName().endsWith(".gif"))
                 {
                     String path = "C:\\Database_Images\\";
                     String pathPicture = "C:\\Database_Backup\\";
           
                     try 
						{                           
                         Files.copy(selectedFile.toPath(),                           ///copy file to directory to selected name
                             (new File(path + t +".jpg")).toPath(),
                             StandardCopyOption.REPLACE_EXISTING);
         
                     } catch (IOException ex) {
                         Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
                     }

                 }
                 else
					{
                     JOptionPane.showMessageDialog(null,"Please select .jpg file");

                     String stf =(String)selectedFile.toString();
 
                 }

                 File imagefile = new File("C:\\Database_Images\\" + t + ".jpg");

                 try {
                     image = ImageIO.read(imagefile);
                 } catch (IOException ex) {
                     Logger.getLogger(t).log(Level.SEVERE, null, ex);
                 }
                 BufferedImage buffered = (BufferedImage) image;

                 sbi = ImagePreviewPanel.resizeImg(buffered, 1200, 828);
                 File outputfile = new File("C:\\Database_Images\\" + t + ".jpg");
                 try 
					{
                     ImageIO.write(sbi, "jpg", outputfile);
                 } catch (IOException ex) {
                     Logger.getLogger(t).log(Level.SEVERE, null, ex);
                 }
                 ImagePreviewPanel.popUpImageWindow(passingName);
				}
        	 }
		}
         else if(returnVal == JFileChooser.CANCEL_OPTION){				//JFileChoser cancel button called out
             JOptionPane.showMessageDialog(null, "you closed with out selecting file");
         }
        	 	

     }

     public static BufferedImage resizeImg(BufferedImage img, int newW, int newH)
     {
         int w = img.getWidth();
         int h = img.getHeight();
         BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
         Graphics2D g = dimg.createGraphics();
         g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
             RenderingHints.VALUE_INTERPOLATION_BILINEAR);
         g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
         g.dispose();
         return dimg;      
     }

     public static void popUpImageWindow(String name)
		{
         ImageIcon pc = null;
         JLabel lab = null;         

         JOptionPane.showMessageDialog(null,"Image file");
         JFrame framePhoto = new JFrame("Add Photo");
         framePhoto.getContentPane().removeAll();
         JPanel panel = new JPanel();
         JLabel addedToName = new JLabel("The picture added to user " + name);
         String nameToPicture = GlobalValues.getName();//text.getText();
         SwingUtilities.updateComponentTreeUI(framePhoto);    //refres the window to redraw  
         ImageIcon imageIcon = new ImageIcon("C:\\Database_Images\\" + nameToPicture+".jpg"); // load the image to a imageIcon
         Image image = imageIcon.getImage(); // transform it
         Image newimg = image.getScaledInstance(240, 240,  java.awt.Image.SCALE_FAST); // scale it the smooth way 
         imageIcon = new ImageIcon(newimg);  // transform it back
         //****************************
         framePhoto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         panel.add(addedToName);
         framePhoto.add(panel);
         lab = new JLabel(imageIcon, SwingConstants.CENTER);
         lab.setIcon(imageIcon);
         panel.add(lab);
         lab.setPreferredSize(new Dimension(320, 250));//Pname.setPreferredSize(new Dimension(250, 100));
         framePhoto.add(panel);
         panel.add(addedToName);
         framePhoto.setMinimumSize(new Dimension(400,350));
         framePhoto.getContentPane().add(panel);
         framePhoto.setResizable(false);
         framePhoto.setLocation(40,40);
         framePhoto.setVisible(true);
         imageIcon.getImage().flush();
         framePhoto.setVisible(true);
         Action.closeFrame3();
         DatabaseFinalV3.setsecondWindowIsOpne(3, false);//secondWindowIsOpne3 = false;
     }
=======
package Database;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImagePreviewPanel implements ActionListener
	{

     private int width, height;
     private int returnVal;
     private ImageIcon icon;
     private Image image;
     private static final int ACCSIZE = 155;
     private Color bg;
     String propertyName ;
     private BufferedImage sbi;

     public void actionPerformed(ActionEvent e) 
		{
         String command = e.getActionCommand();
         
         if (command.equals("Add Photo"))
			{
        	 if(GlobalValues.getName().equalsIgnoreCase(""))
        	 {
        		 JOptionPane.showMessageDialog(null, "Please select a name ");
        	 }
        	 else
        	 {
         	//frame3.dispose();
             System.out.println("Add Photo button called end of line");
             String t = GlobalValues.getName();//text.getText();
             System.out.println(t);
             String passingName = GlobalValues.getName();//text.getText();
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
             FileNameExtensionFilter filter=new FileNameExtensionFilter("images", "jpg","gif","png");
             fileChooser.setFileFilter(filter);
             returnVal=fileChooser.showOpenDialog(null);
             File selectedFile=fileChooser.getSelectedFile();
             File targetLocation = new File("C:\\Database_Images");
             if(returnVal==JFileChooser.APPROVE_OPTION)
				{
                 System.out.println("Selected file: " + selectedFile);
                 if(selectedFile.getName().endsWith(".JPG")||selectedFile.getName().endsWith(".jpg"))//||selectedFile.getName().endsWith(".gif"))
                 {
                     String path = "C:\\Database_Images\\";
                     String pathPicture = "C:\\Database_Backup\\";
                  /*   try {
                         Mentes.Mentes();
                     } catch (IOException ex) {
                         Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
                     }*/
                     try 
						{                           
                         System.out.println("CopyDirectory Called out");
                         Files.copy(selectedFile.toPath(),                           ///copy file to directory to selected name
                             (new File(path + t +".jpg")).toPath(),
                             StandardCopyOption.REPLACE_EXISTING);
                         
                     /*    Files.copy(selectedFile.toPath(),                           ///copy file to directory to selected name
                                 (new File(pathPicture + t +".jpg")).toPath(),
                                 StandardCopyOption.REPLACE_EXISTING);*/

                     } catch (IOException ex) {
                         Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
                     }

                 }
                 else
					{
                     JOptionPane.showMessageDialog(null,"Please select .jpg file");

                     String stf =(String)selectedFile.toString();
                     System.out.println(stf);

                     ///from here should call copy method to copy picture from selected path to C:\\Database_Images TO selected USER_NAME.jpg

                 }

                 File imagefile = new File("C:\\Database_Images\\" + t + ".jpg");

                 try {
                     image = ImageIO.read(imagefile);
                 } catch (IOException ex) {
                     Logger.getLogger(t).log(Level.SEVERE, null, ex);
                 }
                 BufferedImage buffered = (BufferedImage) image;

                 sbi = ImagePreviewPanel.resizeImg(buffered, 1200, 828);
                 File outputfile = new File("C:\\Database_Images\\" + t + ".jpg");
                 try 
					{
                     ImageIO.write(sbi, "jpg", outputfile);
                 } catch (IOException ex) {
                     Logger.getLogger(t).log(Level.SEVERE, null, ex);
                 }
                 ImagePreviewPanel.popUpImageWindow(passingName);
				}
        	 }
		}
         else if(returnVal == JFileChooser.CANCEL_OPTION){				//JFileChoser cancel button called out
             JOptionPane.showMessageDialog(null, "you closed with out selecting file");
         }
        	 	

     }

     public static BufferedImage resizeImg(BufferedImage img, int newW, int newH)
     {
         int w = img.getWidth();
         int h = img.getHeight();
         BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
         Graphics2D g = dimg.createGraphics();
         g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
             RenderingHints.VALUE_INTERPOLATION_BILINEAR);
         g.drawImage(img, 0, 0, newW, newH, 0, 0, w, h, null);
         g.dispose();
         return dimg;      
     }

     public static void popUpImageWindow(String name)
		{
         ImageIcon pc = null;
         JLabel lab = null;         

         JOptionPane.showMessageDialog(null,"Image file");
         JFrame framePhoto = new JFrame("Add Photo");
         framePhoto.getContentPane().removeAll();
         JPanel panel = new JPanel();
         JLabel addedToName = new JLabel("The picture added to user " + name);
         String nameToPicture = GlobalValues.getName();//text.getText();
       
         System.out.println("nameToPicture " + GlobalValues.getName());
         SwingUtilities.updateComponentTreeUI(framePhoto);    //refres the window to redraw  
         ImageIcon imageIcon = new ImageIcon("C:\\Database_Images\\" + nameToPicture+".jpg"); // load the image to a imageIcon
         Image image = imageIcon.getImage(); // transform it
         Image newimg = image.getScaledInstance(240, 240,  java.awt.Image.SCALE_FAST); // scale it the smooth way 
         imageIcon = new ImageIcon(newimg);  // transform it back
         //****************************
         framePhoto.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
         panel.add(addedToName);
         framePhoto.add(panel);
         lab = new JLabel(imageIcon, SwingConstants.CENTER);
         lab.setIcon(imageIcon);
         panel.add(lab);
         lab.setPreferredSize(new Dimension(320, 250));//Pname.setPreferredSize(new Dimension(250, 100));
         framePhoto.add(panel);
         panel.add(addedToName);
         framePhoto.setMinimumSize(new Dimension(400,350));
         framePhoto.getContentPane().add(panel);
         framePhoto.setResizable(false);
         framePhoto.setLocation(40,40);
         framePhoto.setVisible(true);
         imageIcon.getImage().flush();
         framePhoto.setVisible(true);
         Action.closeFrame3();
         DatabaseFinalV3.setsecondWindowIsOpne(3, false);//secondWindowIsOpne3 = false;
     }
>>>>>>> origin/master
 }