import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject main = new JSONObject();
		JSONObject js = new JSONObject();
		js.put("Name", "Nikhita");
		js.put("Id", new Integer(20));
		js.put("sal", new Double(20000));
		JSONArray ja = new JSONArray();
		ja.add(js);
		main.put("Empl", ja);
		System.out.println(main);
	}
}
