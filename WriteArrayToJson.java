package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteArrayToJson {

    public static void main(String[] args) throws IOException {
        JSONObject student1 = new JSONObject();
        student1.put("studentID","2");
        student1.put("classID","2202");
        student1.put("firstName","Asheek");
        student1.put("lastName","Shimul");
        student1.put("phone","14433338227");
        student1.put("email","Asheek.Shimul@uon.edu.au");

        JSONObject student2 = new JSONObject();
        student2.put("studentID","1");
        student2.put("classID","2202");
        student2.put("firstName","Mohammad");
        student2.put("lastName","Reza");
        student2.put("phone","5617014986");
        student2.put("email","sreza30th@gmail.com");

        JSONObject student3 = new JSONObject();
        student3.put("studentID","3");
        student3.put("classID","2202");
        student3.put("firstName","Sarwat");
        student3.put("lastName","Wasim");
        student3.put("phone","1-929-225-5248");
        student3.put("email","sarwat.navid201070@gmail.com");

        JSONObject stu1 = new JSONObject();
        stu1.put("Student", student1);

        JSONObject stu2 = new JSONObject();
        stu2.put("Student", student2);

        JSONObject stu3 = new JSONObject();
        stu3.put("Student", student3);

        JSONArray studentList = new JSONArray();
        studentList.add(stu1);
        studentList.add(stu2);
        studentList.add(stu3);


        FileWriter fileWriter = new FileWriter(".idea/LeonsData/data1.json");
        fileWriter.write(studentList.toJSONString());

        fileWriter.close();
        System.out.println("New JSON array file" + studentList);


    }



}
