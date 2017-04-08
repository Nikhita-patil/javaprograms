package json;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonFileoperator {
	static Scanner sc=new  Scanner(System.in);
	public static void jsonfilewriter(String url) throws IOException
     {
		JSONObject main=new JSONObject();
		JSONArray  rice=new JSONArray();
		JSONArray  wheat=new JSONArray();
		JSONArray  pulse=new JSONArray();
		JSONObject s1=new JSONObject();
		System.out.println("enter the number of enteries you want");
		
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			
			System.out.println("which type of food item you want");
			System.out.println("1. Wheat:");
			System.out.println("2. Pulse:");
			System.out.println("3. Rice:");
			System.out.print("Enter the choice::");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter the wheat type");
			    s1.put("Type", sc.next());
				System.out.println("Enter the wheat Weight");
				s1.put("Weight", sc.next());
				System.out.println("Enter the wheat Price");
				s1.put("Price", sc.next());
				wheat.add(s1);
				main.put("Wheat", wheat);
				break;
			case 2:
				System.out.println("Enter the pulse type");
			    s1.put("Type", sc.next());
				System.out.println("Enter the pulse Weight");
				s1.put("Weight", sc.next());
				System.out.println("Enter the pulse Price");
				s1.put("Price", sc.next());
				break;	
			case 3:
				System.out.println("Enter the rice type");
			    s1.put("Type", sc.next());
				System.out.println("Enter the rice Weight");
				s1.put("Weight", sc.next());
				System.out.println("Enter the rice Price");
				s1.put("Price", sc.next());
				wheat.add(s1);
				main.put("pulse", pulse);
				break;		
          default:
        	    break;
        	    
       }
		}
			FileWriter fw=null;
			try {
				fw = new FileWriter(url);
				fw.write(main.toJSONString());
				fw.flush();
				System.out.println("DataInserted successfully");
			}
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			}
			finally
			{
				sc.close();
			
				try 
				{
					fw.close();
				} 
				
				catch (IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		
     
		
		public static void jsonFileReader(String url) throws IOException {
			FileReader fis=null;
			JSONParser parser1 = new JSONParser();
			try {
				 
				fis= new FileReader(url);
				Object obj = parser1.parse(fis);
				JSONObject jsonobj = (JSONObject) obj;
				System.out.println("Data Retrived Successfully");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sc.close();
			
		}
		
		
	
}
