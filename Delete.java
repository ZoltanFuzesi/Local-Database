package Database;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Delete 
	{
      
	public static boolean delete(int i)
	{
       boolean ans = false;
          int removeCon = GlobalValues.getDelInt();
          String tempFileName = GlobalValues.getName();
          File fileName = new File("C:\\Database\\" + tempFileName + ".txt");
          File FileNamePicture = new File("C:\\Database_Images\\" + tempFileName + ".jpg");
          //File fileName = new File("C:\\Desktop\\Database" + tempFileName + ".txt");
          Data.removeContact(removeCon);//Data.Contacts.remove(t);
          DatabaseFinalV3.setsecondWindowIsOpne(2, false);//secondWindowIsOpne2=false;
          if (!(fileName.isDirectory()))
          {
              fileName.delete();
              FileNamePicture.delete();
              ans = true;
              
          }
          return ans;
      } 
	
	
	}
    