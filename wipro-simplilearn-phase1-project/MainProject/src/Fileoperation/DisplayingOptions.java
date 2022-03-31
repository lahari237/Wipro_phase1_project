package Fileoperation;

import java.util.Scanner;
import java.io.*;

public class DisplayingOptions {
	public int displayOptionsToUser() {
		System.out.println("----Choose an option----");
		System.out.println("Option 1 : To list files in order");
		System.out.println("Option 2 : To add, delete or search a file");
		System.out.println("Option 3 : To exit the application");
		
		return TakeInput();
	}
	public int TakeInput() {
		Scanner scan=new Scanner(System.in);
		return scan.nextInt();
	}
	
	public void displayMenu() throws IOException{
		int option=this.displayOptionsToUser();
		switch(option) {
		case 1 : FilesListing fl=new FilesListing();
				 fl.listFilesInOrder();break;
		case 2 : OPerationsOnFile op=new OPerationsOnFile();
				 op.makeControl();break;
		case 3 : System.exit(0);
		default: System.out.println("You entered wrong choice");
				displayMenu();
		}
	}

}
