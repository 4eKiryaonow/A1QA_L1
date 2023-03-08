package task3_1.util;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import task3_1.models.User;
import task3_1.utils.InfoLogger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class JsonReader {

    private static JSONParser reader = new JSONParser();

    public static List<String> getListFromJsonFile(String path, String keyName) {

        List<String> value;
        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            JSONObject jsonObject = (JSONObject) reader.parse(bufferedReader);
            value = (List<String>) jsonObject.get(keyName);

        } catch (Exception e) {
            InfoLogger.error(e.getMessage());
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
            InfoLogger.error(e.getMessage());
            throw new RuntimeException(e);
        }
        return value;
    }

    public static Map<String, User> getUserDataFromJsonFile(String path) {
        Map<String, User> dataFromJsonFile;
        Gson gson = new Gson();

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Type type = new TypeToken<Map<String, User>>() {
            }.getType();
            dataFromJsonFile = gson.fromJson(bufferedReader, type);
        } catch (Exception e) {
            InfoLogger.error(e.getMessage());
            throw new RuntimeException(e);
        }
        return dataFromJsonFile;
    }
}