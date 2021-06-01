package HomeworkJava_2_1.HomeworkJava_2_1;

import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main {
	public static void main(String[] args) throws IOException, ParseException {

		Config config = Config.getConfig();
		System.out.println(config.getColor());
		System.out.println(config.getWeight());

	}
}
