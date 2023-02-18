package task2_1.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;

public class JsonReader {

    private static JSONParser reader = new JSONParser();

    public static String getDataFromJsonFile(String path, String keyName) {

        String value;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            JSONObject jsonObject = (JSONObject) reader.parse(bufferedReader);
            value = (String) jsonObject.get(keyName);

        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return value;

    }
}
