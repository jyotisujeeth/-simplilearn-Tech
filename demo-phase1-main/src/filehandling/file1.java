package filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file1 {

	public static void main(String[] args) throws IOException {
		
		File newfile = new File("C:\\Users\\LENOVO\\Desktop\\files\\MyFile1.txt");
//		
//		newfile.createNewFile();
		
//		System.out.println("File created successfully !");
//		
//		
//		
//		FileWriter fw = new FileWriter("C:\\Users\\LENOVO\\Desktop\\files\\MyFile1.txt");
//		fw.write("hii this is my first file. I am writting my data here..!!");
//		System.out.println("data written successfully !");
//		fw.close();
		
		
		//READ 
		
//		Scanner sc= new Scanner(newfile);
//		
//		while(sc.hasNextLine())
//		{
//			String line = sc.nextLine();
//			System.out.println(line);
//		}
//		
//		sc.close();
		
		//delete 
		
//		newfile.delete();
//		
//		System.out.println("File deleted successfully !");
		
		//check file exist or not 
		
		if(newfile.exists())
		{
		System.out.println("file exists !");
		}
		else 
		{
			System.out.println("file doesn't exists !!");
		}

	}

}
