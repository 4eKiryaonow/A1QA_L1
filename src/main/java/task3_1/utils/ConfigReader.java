package task3_1.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import task3_1.models.Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

public class ConfigReader {

    private static JSONParser reader = new JSONParser();

    public static Config readConfig(Config config, String path) {

        JSONObject jsonObject;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            jsonObject = (JSONObject) reader.parse(bufferedReader);

        } catch (Exception e) {
            InfoLogger.error(e.getMessage());
            throw new RuntimeException(e);
        }
        config.setBrowser((String) jsonObject.get("browser"));
        config.setOptions((List<String>) jsonObject.get("options"));
        config.setUrl((String) jsonObject.get("url"));
        config.setWaitDuration((String) jsonObject.get("waitDuration"));

        return config;
    }
}
