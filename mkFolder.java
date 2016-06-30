<<<<<<< HEAD
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
=======
package Database;

import java.io.File;

public class mkFolder
{

    public static void mkFolder(){

        File theDir = new File("C:\\Database");
        File theDir2 = new File("C:\\Database_Backup");
        File theDir3 = new File("C:\\Database_Images");

        if (!theDir.exists()) {
            System.out.println("creating directory: " + theDir);
            boolean result = false;
            try{
                theDir.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
                System.out.println("DIR created");  
            }
        }
        System.out.println("Is Write allow : " + theDir.canWrite());
        System.out.println("Is Read allow : " + theDir.canRead());
        if (!theDir2.exists())
			{
            System.out.println("creating directory: " + theDir2);
            boolean result = false;
            try{
                theDir2.mkdir();
                result = true;
            } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
                System.out.println("DIR2 created");  
            }
        }
        System.out.println("Is Write allow : " + theDir2.canWrite());
        System.out.println("Is Read allow : " + theDir2.canRead());
        if (!theDir3.exists()) 
		{
            System.out.println("creating directory: " + theDir3);
            boolean result = false;
            try{
                theDir3.mkdir();
                result = true;
        } 
            catch(SecurityException se){
                //handle it
            }        
            if(result) {    
                System.out.println("DIR3 created");  
            }
        }
        System.out.println("Is Write allow : " + theDir3.canWrite());
        System.out.println("Is Read allow : " + theDir3.canRead());
    }
>>>>>>> origin/master
}