package Database;

import java.io.File;

public class mkFolder
{

    public static void mkFolder(){

        File theDir = new File("C:\\Database");
        File theDir2 = new File("C:\\Database_Backup");
        File theDir3 = new File("C:\\Database_Images");

        if (!theDir.exists()) {
            boolean result = false;
            try{
                theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
 
            }
        }

        if (!theDir2.exists())
			{
            boolean result = false;
            try{
                theDir2.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
 
            }
        }

        if (!theDir3.exists()) 
		{

            boolean result = false;
            try{
                theDir3.mkdir();
                result = true;
        } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
 
            }
        }

    }
}