package JSON;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadMultipleJasonFile {

    public static void main(String[] args) throws IOException, ParseException {
        JSONParser jsonParser = new JSONParser();
        FileReader fileReader = new FileReader(".idea/LeonsData/data1.json");
        Object read = jsonParser.parse(fileReader);
        JSONArray Student = (JSONArray) read;
        System.out.println(Student);
    }
}
