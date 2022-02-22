package myLocker.com;
import java.util.*;
import java.io.File;
import java.io.IOException;


public class AllMethod {
   private File file1,file2;
   private String foldername, filename, newpath;
   private static String filePath =  "E:\\Java\\FSDProjectFiles\\";
   Scanner obj = new Scanner(System.in);
   
   public void createFile()
   {
	   System.out.println("Enter your good name");
	   foldername = obj.nextLine();
	   System.out.println("Enter file name which you want to create");
	   filename=obj.nextLine();
	   newpath = filePath+foldername;
	   File file = new File(newpath);
	   boolean tf = file.mkdir();
	   File file2 = new File(newpath + "\\" + filename);
	   if(tf)
	   {
		   try
		   {
			   file2.createNewFile();
			   System.out.println("File created succesfully in " + foldername  );
		   }
		   catch(IOException e)
		   {
			   System.out.println("File not created");
		   }
	   }
	   else
	   {
		System.out.println(" Folder is not created or it already exist :");
		try 
		{
			file2.createNewFile();
		}
		catch(IOException e)
		{
		 e.printStackTrace();	
		}
	   }
   }
   
   
   public void deleteFile()
   {
	   System.out.println("Enter your good name : ");
	   foldername = obj.nextLine();
	   newpath = filePath+foldername;
	   file1 = new File(newpath);
	   if(file1.isDirectory())
	   {
		   System.out.println("Enter File name");
		   filename = obj.nextLine();
		   file2 = new File(newpath + "\\" + filename);
		   
		   if(file2.delete())
		   {
			   System.out.println("File deleted Succesfully");
		   }
		   else
		   {
			System.out.println("File not found ");   
		   }
	   }
	   else
	   {
		   System.out.println("No such directory found");
	   }
   }
   
   
   public void searchFile() {
	   System.out.println("Enter your good name");
	   foldername = obj.nextLine();
	   System.out.println("Enter the filename which you want to search : ");
	   filename = obj.nextLine();
	   file1 = new File (filePath+foldername + "\\" + filename);
	   if(file1.exists())
	   {
		   System.out.println("File is present in directory " + foldername);
	   }
	   else
	   {
		System.out.println("File is not found in " + foldername + " directory ");   
	   }
   }
   
   
   public void reciveAllFiles()
   {
	   List<String> strin = new ArrayList<>();
	   file1 = new File(filePath);
	   String[] folders = file1.list();
	   for ( var strin1 : folders)
	   {
		   newpath = filePath+strin1;
		   file2 = new File (newpath);
		   String[] fold = file2.list();
		   for(var strin2 : fold)
		   {
			   strin.add(strin2);
		   }
	   }
	   Collections.sort(strin);
		   for (String sorted : strin)
		   {
			   System.out.println(sorted);
		   
	   }
		   
		   
		   
		   System.out.println();
			System.out.println("*************************************************************");
			System.out.println("\t\tSelect From The Following" + "\n" + "\t\t1. List of all files" + 
			"\n" + "\t\t2. User Interface"  + "\n" + "\t\t3. Exit");
			System.out.println("Enter your Choice : ");
			int ch = Integer.parseInt(obj.nextLine());
			AllMethod M = new AllMethod();
			
			  switch(ch)
			    {
			    case 1: M.reciveAllFiles();
			    break;
			    case 2 : int ch1;
			    do
			    {
			    	System.out.println();
			    	System.out.println("*************************************************************");
					System.out.println("\t\tChoose From The Following" + "\n" + "\t\t1. If You Want To Create A File Please Enter 1" + 
					"\n" + "\t\t2. If You Want To Delete File Please Enter 2"  + "\n" + "\t\t3. If You Want To Search A File Please Enter 3 "
							+ "\n" + "\t\t4.If You Want To Back To The Main Menu Enter 4");
					System.out.println("Enter your choice");
					ch1 = Integer.parseInt(obj.nextLine());
					switch(ch1) 
					{
					case 1: M.createFile();
					break;
					case 2: M.deleteFile();
					break;
					case 3: M.searchFile();
					break;
					case 4: M.displayMenu();
					break;
					default: System.out.println("  Please Enter The Correct option  ");
					break;
						}
			    	}while(ch1>0);
			    break;
			    case 3: System.exit(0);
			    break;
			    default : System.out.println(" Please Enter The Correct option ");
			    }while(ch>=0);
			     obj.close();
			     
			}
		   
		   
   
   public void displayMenu()
   {
	   
	   System.out.println();
		System.out.println("*************************************************************");
		System.out.println("\t\tSelect From The Following" + "\n" + "\t\t1. List of all files" + 
		"\n" + "\t\t2. User Interface"  + "\n" + "\t\t3. Exit");
		System.out.println("Enter your Choice : ");
		int ch = Integer.parseInt(obj.nextLine());
		AllMethod M = new AllMethod();
		
		  switch(ch)
		    {
		    case 1: M.reciveAllFiles();
		    break;
		    case 2 : int ch1;
		    do
		    {
		    	System.out.println();
		    	System.out.println("*************************************************************");
				System.out.println("\t\tChoose From The Following" + "\n" + "\t\t1. If You Want To Create A File Please Enter 1" + 
				"\n" + "\t\t2. If You Want To Delete File Please Enter 2"  + "\n" + "\t\t3. If You Want To Search A File Please Enter 3 "
						+ "\n" + "\t\t4.If You Want To Back To The Main Menu Enter 4");
				System.out.println("Enter your choice");
				ch1 = Integer.parseInt(obj.nextLine());
				switch(ch1) 
				{
				case 1: M.createFile();
				break;
				case 2: M.deleteFile();
				break;
				case 3: M.searchFile();
				break;
				case 4: M.displayMenu();
				break;
				default: System.out.println("  Please Enter The Correct option  ");
				break;
					}
		    	}while(ch1>0);
		    break;
		    case 3: System.exit(0);
		    break;
		    default : System.out.println(" Please Enter The Correct option ");
		    }while(ch>=0);
		     obj.close();
		}

 }
   

