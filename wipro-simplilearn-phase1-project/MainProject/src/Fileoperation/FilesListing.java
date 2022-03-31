package Fileoperation;
import java.util.*;
import java.io.*;

public class FilesListing {
	
	public ArrayList<String> arr=new ArrayList<>();
	File file=new File("Directory");
	public void listFilesInOrder() throws IOException{
		File f[]=file.listFiles();
		for(File temp:f) {
			if(temp.isFile()) {
				arr.add(temp.getName());
			}
		}
		Collections.sort(arr);
		for(String temp:arr) {
			System.out.println(temp);
		}
		/*File myDir=new File("Directory");
		myDir.mkdir();
		File to =new File("Directory","success.txt");
		to.createNewFile();
		File f=new File("Directory");
		System.out.println(f.listFiles());
		return arr;*/
	}
}

	/*public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FilesListing fo=new FilesListing();
		ArrayList<String> temp=fo.listFilesInOrder();
		for(String t:temp)
			System.out.println(t);

	}

}*/
