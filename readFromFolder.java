package Database;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public  class readFromFolder
	{
       private  String File;
       private static ArrayList<Data> Contacts = new ArrayList<Data>();
       private static Scanner in = new Scanner(System.in);
       public static void readFromFolder()throws IOException, ClassNotFoundException 
		{

           Contacts = new ArrayList<Data>(); 
           List<File> filesInFolder;
           filesInFolder = Files.walk(Paths.get("C:\\Database"))
           .filter(Files::isRegularFile)
           .map(Path::toFile)
           .collect(Collectors.toList());
           int filesSize = 0;

           int readSize = filesInFolder.size();

           for(int i=0;i<readSize;i++)
			{
 
               String filesInFolderToString = (String)filesInFolder.get(i).toString();
  
               Path filePath = Paths.get(filesInFolderToString);
               Scanner scanner = new Scanner(filePath);
  
               String name =  scanner.nextLine();
               String firstName =  scanner.nextLine();
               String lastName =  scanner.nextLine();
               String address1 =  scanner.nextLine();
               String address2 =  scanner.nextLine();
               String address3 =  scanner.nextLine();
               String PPSNumber =  scanner.nextLine();
               String studentID =  scanner.nextLine();
               String contact = scanner.nextLine();
               String emailAddress =  scanner.nextLine();
               Data.Data1(name, firstName, lastName, address1, address2, address3, PPSNumber, studentID, contact, emailAddress);

               filesInFolderToString = null;
               name = null;

               contact = null;
               in.close();
           }

       }

   }