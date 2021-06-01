package homeworkJava_2_2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {

	public static void main(String[] args) {
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		String json = "{\"n1\":7,\"n2\":10}";
		
		C2 c2 = gson.fromJson(json, C2.class);
		C2toC1Adapter adapter = new C2toC1Adapter(c2);
		System.out.println("Sum of n1 and n2n is: " + adapter.getSum() );
	}

}
