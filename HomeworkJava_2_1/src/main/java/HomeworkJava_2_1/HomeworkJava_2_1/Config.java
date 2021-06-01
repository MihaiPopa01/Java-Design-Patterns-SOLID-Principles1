package HomeworkJava_2_1.HomeworkJava_2_1;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config {
	String color;
	int weight;
	private static Config config;

	private Config() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader reader = new FileReader(".\\jsonFiles\\config.json");
		Object obj = jsonParser.parse(reader);
		JSONObject jsonobj = (JSONObject) obj;
		String sColor = (String) jsonobj.get("color");
		String sWeight = (String) jsonobj.get("weight");
		color = sColor;
		weight = Integer.parseInt(sWeight);
	}

	public static void setConfig(Config config) {
		Config.config = config;
	}

	public String getColor() {
		return color;
	}

	public int getWeight() {
		return weight;
	}

	public static Config getConfig() throws IOException, ParseException {
		if (config == null) {
			config = new Config();
		}
		return config;

	}

}
