package reader;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import entity.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class YamlReader {

    public static List<User> getDataFromYamlFile(String path) {
        List<User> listOfUsers;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
            listOfUsers = objectMapper.readValue(bufferedReader, new TypeReference<ArrayList<User>>() {
            });
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return listOfUsers;


    }
}
