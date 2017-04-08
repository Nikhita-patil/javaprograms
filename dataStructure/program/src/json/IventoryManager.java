package json;

public class IventoryManager {
     public static void main(String[] args) {
		jsonFileoperator jf=new  jsonFileoperator();
		try
		{
			jf.jsonfilewriter("/home/bridgeit/workspace/program/src/json/file.json");
			jf.jsonFileReader("/home/bridgeit/workspace/program/src/json/file.json");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
