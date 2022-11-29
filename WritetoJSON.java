package JSON;

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WritetoJSON {

    public static void main(String[] args) throws IOException, IOException {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("studentID", "1");
        jsonObject.put("classID", "2202");
        jsonObject.put("firstName", "Mohammad");
        jsonObject.put("lastName", "Reza");
        jsonObject.put("phone", "5617014986");
        jsonObject.put("email", "sreza30th@gmail.com");
        FileWriter fileWriter = new FileWriter(".idea/LeonsData/data2.json");
        fileWriter.write(jsonObject.toJSONString());

        fileWriter.close();
        System.out.println("New JSON file" + jsonObject);
    }
}
