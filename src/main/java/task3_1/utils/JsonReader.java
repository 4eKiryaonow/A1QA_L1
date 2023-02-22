package task3_1.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class JsonReader {

    public static final String PATH_TO_CONFIG = "src/test/resources/configdata/config.json";
    private static JSONParser reader = new JSONParser();

    public static List<String> getListFromJsonFile(String path, String keyName) {

        List<String> value;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            JSONObject jsonObject = (JSONObject) reader.parse(bufferedReader);
            value = (List<String>) jsonObject.get(keyName);

        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return value;

    }

    public static String getStringFromJsonFile(String path, String keyName) {

        String value;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            JSONObject jsonObject = (JSONObject) reader.parse(bufferedReader);
            value = jsonObject.get(keyName).toString();

        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return value;

    }


}