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
        config.setBrowser((String) jsonObject.get(Constants.BROWSER_KEY));
        config.setOptions((List<String>) jsonObject.get(Constants.OPTIONS_KEY));
        config.setUrl((String) jsonObject.get(Constants.URL_KEY));
        config.setWaitDuration((String) jsonObject.get(Constants.DURATION_KEY));

        return config;
    }
}
