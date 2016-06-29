package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionAdd implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
	String command = e.getActionCommand();
    if (command.equals("Add")) 
		{ 
        detailsFrame.setVariables();
        System.out.println("Add method called");
        String firstName = GlobalValues.getFirstName();//firstNameText.getText();
        String lastName = GlobalValues.getLastName();//secondNameText .getText();
        String address1 = GlobalValues.getAddress1();//addressLine1Text.getText();
        String address2 = GlobalValues.getAddress2();//addressLine2Text.getText();
        String address3 = GlobalValues.getAddress3();//myItem;
        String PPSNumber= GlobalValues.getPPSNumber();//ppsNumberText.getText();
        String studentID = GlobalValues.getStudentId();//studentIdText.getText();
        String contact = GlobalValues.getContactNumber();//contactText.getText();
        String emailAddress = GlobalValues.getEmail();//emailText.getText();
        String name = firstName + " " + lastName;
        GlobalValues.setFullName(firstName + " " + lastName); 
        Data.Data(name, firstName, lastName, address1, address2, address3, PPSNumber, studentID, contact, emailAddress);
			try 
			{
            Mentes.Mentes(GlobalValues.getFullName());  
        } catch (IOException ex){
            Logger.getLogger(DatabaseFinalV3.class.getName()).log(Level.SEVERE, null, ex);
        } 
				detailsFrame.getFrameAdd();
				DatabaseFinalV3.setsecondWindowIsOpne(1, false);//secondWindowIsOpne1=false;
    }
	
	}	
}
