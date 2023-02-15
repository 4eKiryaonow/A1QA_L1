package reader;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class JsonReader {

    public static List<User> getDataFromJsonFile(String path) {
        List<User> listOfUsers;

        try {

            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            ObjectMapper objectMapper = new ObjectMapper();
            listOfUsers = Arrays.asList(
                    objectMapper.readValue(bufferedReader, User[].class));
        } catch (Exception e) {

            throw new RuntimeException(e);
        }

        return listOfUsers;


    }


}
