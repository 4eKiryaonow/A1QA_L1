package task2_1.utils;

public class BrowserUtils {

    public static String getUrl() {
        return JsonReader.getStringFromJsonFile(JsonReader.PATH_TO_CONFIG, "url");
    }




}
