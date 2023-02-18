package task2.utils;

import org.openqa.selenium.json.Json;

import java.security.PrivateKey;

public class DataManager {

    private static final String CONFIG_DATA_PATH = "src/test/resources/config/ConfigData.json";
    private static final String TEST_DATA_PATH = "src/test/resources/testdata/TestData.json";
    private String login;
    private String password;

    public static String getURL() {return JsonReader.getDataFromJsonFile(CONFIG_DATA_PATH, "url");}
    public static String getBrowser() {return JsonReader.getDataFromJsonFile(CONFIG_DATA_PATH, "browser");}
    public void setLogin() {login = JsonReader.getDataFromJsonFile(TEST_DATA_PATH, "login");}
    public String getLogin() {return login;}
    public void setPassword() { password = JsonReader.getDataFromJsonFile(TEST_DATA_PATH, "password");}
    public String getPassword() {return password; }





}
