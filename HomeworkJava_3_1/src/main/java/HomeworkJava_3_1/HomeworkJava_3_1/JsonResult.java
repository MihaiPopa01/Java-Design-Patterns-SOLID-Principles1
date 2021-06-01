package HomeworkJava_3_1.HomeworkJava_3_1;

import org.json.simple.JSONObject;

public class JsonResult {

	private double solution;
	private String errorMessage;
	private JSONObject jsonData = null;

	public JsonResult(double solution, String errorMessage) {
		this.solution = solution;
		this.errorMessage = errorMessage;
	}

	public void parseJsonSolution() {
		JSONObject jsonData = new JSONObject();
		jsonData.put("solution", this.solution);
		jsonData.put("errorMessage", this.errorMessage);
		this.jsonData = jsonData;
	}

	public JSONObject getJsonData() {
		return this.jsonData;
	}
}