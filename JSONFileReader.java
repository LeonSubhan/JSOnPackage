package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class JSONFileReader {

    public static void main(String[] args) throws IOException, ParseException {
        FileReader fileReader = new FileReader(".idea/LeonsData/data.json");
        Object obj = new JSONParser().parse(fileReader);
        JSONObject jsonObject = (JSONObject) obj;
        String id = (String)jsonObject.get("studentId");
        String classID = (String)jsonObject.get("ClassID");
        String firstName = (String)jsonObject.get("studentfirstName");
        String lastName = (String)jsonObject.get("studentLastName");
        String phone = (String)jsonObject.get("phone");
        String email = (String)jsonObject.get("studentEmail");
        JSONArray subject = (JSONArray)jsonObject.get("subject");
        JSONArray address = (JSONArray) jsonObject.get("address");

        System.out.println("Id is " + id);
        System.out.println("Class Id is:" + classID);
        System.out.println("First name is: " + firstName);
        System.out.println("Last name is: " + lastName);
        System.out.println("Phone number is: " + phone);
        System.out.println("Email address is ; " + email);
        System.out.println("subject: ");
        Iterator iterator = subject.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Address: ");
        Iterator iterator1 = address.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }






    }

}
