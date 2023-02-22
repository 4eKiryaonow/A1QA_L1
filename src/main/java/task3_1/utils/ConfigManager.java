package task3_1.utils;

import task3_1.models.Config;

import java.util.List;
import java.util.Objects;

public class ConfigManager {

    public static final String PATH_TO_CONFIG = "src/test/resources/configdata/config.json";

    private static Config config;

    public static Config getConfig() {

        if (Objects.isNull(config)) {

            config = ConfigReader.readConfig(new Config(), PATH_TO_CONFIG);
        }

        return config;

    }

    public static String getURL() {

        return getConfig().getUrl();
    }

    public static String getBrowser() {

        return getConfig().getBrowser();

    }

    public static int getWaitDuration() {

        return Integer.parseInt(getConfig().getWaitDuration());

    }

    public static List<String> getOptions() {

        return getConfig().getOptions();

    }


}
