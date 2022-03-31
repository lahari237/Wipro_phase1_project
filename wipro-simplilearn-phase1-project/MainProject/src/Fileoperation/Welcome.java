package Fileoperation;
import java.io.*;
public class Welcome{
	public void welcomeScreen() throws IOException{
		DisplayingOptions d=new DisplayingOptions();
		d.displayMenu();
	}
	public void initialScreen() {
		System.out.println("************************************\n");
		System.out.println("Application Name : LockedMe.com");
		System.out.println("Developer Name   : Geetha Lahari\n");
		System.out.println("************************************\n");
		
	}
	public static void main(String args[]) throws IOException{
		Welcome w =new Welcome();
		w.initialScreen();
		w.welcomeScreen();
		
	}

}
