package task3_1.utils;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import task3_1.models.Config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PipedReader;
import java.util.List;

public class ConfigReader {

    private static JSONParser reader = new JSONParser();
    private static String BROWSER;
    private static List<String> OPTIONS;
    private static String URL;
    private static String DURATION;


    public static Config readConfig(Config config, String path) {

        JSONObject jsonObject;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            jsonObject = (JSONObject) reader.parse(bufferedReader);

        } catch (Exception e) {
            InfoLogger.error(e.getMessage());
            throw new RuntimeException(e);
        }

        BROWSER = (String) jsonObject.get(Constants.BROWSER_KEY);
        OPTIONS = (List<String>) jsonObject.get(Constants.OPTIONS_KEY);
        URL = (String) jsonObject.get(Constants.URL_KEY);
        DURATION = (String) jsonObject.get(Constants.DURATION_KEY);


        config.setBrowser(BROWSER);
        config.setOptions(OPTIONS);
        config.setUrl(URL);
        config.setWaitDuration(DURATION);

        return config;
    }
}
