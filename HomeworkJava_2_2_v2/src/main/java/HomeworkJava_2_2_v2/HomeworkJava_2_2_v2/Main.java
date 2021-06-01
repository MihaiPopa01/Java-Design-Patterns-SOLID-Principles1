package HomeworkJava_2_2_v2.HomeworkJava_2_2_v2;

public class Main {

	public static void main(String[] args) {

		C2 c2 = new C2("{\"nr1\":100 ,\"nr2\":25}");
		String jsonString = c2.getJsonString();
		C2toC1Adapter c2toc1adapter = new C2toC1Adapter(jsonString);
		System.out.println(c2toc1adapter.sum());
	}

}
