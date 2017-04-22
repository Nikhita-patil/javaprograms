package dataStructure;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class unorderedlist {
	FileWriter fw = null;
	String rep;

	public String getFile() 
	{

		FileInputStream fis;
		String str="";
		int i;
		try {
			fis = new FileInputStream("/home/bridgeit/workspace/program/src/txtFile/hello");
			try {
				while((i=fis.read())!=-1){
					str = str + (char)i;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		

		return str;
	
	}

	public void addToFile(String str) {
		
		 FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("/home/bridgeit/workspace/program/src/txtFile/hello");
			byte b[] = str.getBytes();
			fout.write(b);
			fout.flush();
			System.out.println("Data inserted SuccessFully");
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fout != null)
			{
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}