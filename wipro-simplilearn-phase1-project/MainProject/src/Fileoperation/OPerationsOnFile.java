package Fileoperation;

import java.io.*;
import java.util.Scanner;

public class OPerationsOnFile {
	
	public void displayOptionsToUser(){
		System.out.println("----Choose an option----");
		System.out.println("Option 1 : To add a user defined file");
		System.out.println("Option 2 : To delete a user defined file");
		System.out.println("Option 3 : To search a user defined file");
		System.out.println("Option 4 : Get back to main menu ");
	}
	public void makeControl() throws IOException {
		displayOptionsToUser();
		Scanner scan=new Scanner(System.in);
		int inp=scan.nextInt();
		switch(inp) {
		case 1  : addAFile();break;
		case 2  : deleteAFile();break;
		case 3  : searchAFile();break;
		case 4  : DisplayingOptions dop=new DisplayingOptions();
				 dop.displayMenu();break;
		default :System.out.println("You entered wrong value");
				makeControl();
		
		}
	}
	public void addAFile() {
		System.out.println("Enter a file name to be added..");
		Scanner scan=new Scanner(System.in);
		String filename=scan.next();
		try {
		File file=new File("Directory",filename);
		if(file.createNewFile()) {
			System.out.println("your file is added successfully");
		}
		else {
			System.out.println("A file already exists with this name");
		}
		}
		catch(IOException e){}
		
	}
	public void deleteAFile() {
		System.out.println("Enter a file name to be deleted..");
		Scanner scan=new Scanner(System.in);
		String file=scan.nextLine();
		String input="Directory/"+file;
			File f=new File(input);
			if(f.delete()) {
				System.out.println("File deleted successfully");
			}
			else {
				System.out.println("File not found");
			}
	}
	public void searchAFile() {
		System.out.println("Enter a file name to be searched..");
		Scanner scan=new Scanner(System.in);
		String str=scan.next();
		int flag=0;
		File file=new File("Directory");
		File f[]=file.listFiles();
		for(File temp:f) {
			if(temp.isFile()) {
				String a=temp.getName();
				if(a.equals(str)) {
					System.out.println("File found");
					flag=1;
					break;
				}
			}
		}
		if(flag==0)
			System.out.println("File not found");
		
		
	}

}
