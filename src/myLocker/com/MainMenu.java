package myLocker.com;
import java.util.*;


public class MainMenu {

	private int ch;
	
	public void displayMenu() {
		Scanner obj = new Scanner(System.in);
		do
		{
			System.out.println();
			System.out.println("************************************************************************************************************");
			System.out.println("\t\tSelect From The Following" + "\n" + "\t\t1. List of all files" + 
			"\n" + "\t\t2. User Interface"  + "\n" + "\t\t3. Exit");
			System.out.println("Enter your Choice : ");
			ch = Integer.parseInt(obj.nextLine());
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
				"\n" + "\t\t2. If You Want To A Delete File Please Enter 2"  + "\n" + "\t\t3. If You Want To Search A File Please Enter 3 "
				+ "\n" + "\t\t4. If You Want To Back To The Main Menu Enter 4");
				System.out.println("Enter your Choice");
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
				default: System.out.println("Please Enter The Correct option ");
				break;
					}
		    	}while(ch1>0);
		    break;
		    case 3: System.exit(0);
		    break;
		    default : System.out.println(" Please Enter The Correct option ");
		    }
		}while(ch>=0);
		obj.close();
	}
	
}
