package task2_1.utils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DataManager {

    private List<String> languages;
    private String query;
    private String pathFileToWrite;
    private int valueOfCompResults;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<String> getLanguages() {
        return languages;
    }
    public void setLanguages(List<String> languages) {
        this.languages = languages
                .stream()
                .map(language ->language.toLowerCase(Locale.ROOT))
                .collect(Collectors.toList());
    }

    public String getPathFileToWrite() {
        return pathFileToWrite;
    }
    public void setPathFileToWrite(String pathFileToWrite) {
        this.pathFileToWrite = pathFileToWrite;
    }

    public int getValueOfCompResults() {
        return valueOfCompResults;
    }

    public void setValueOfCompResults(int valueOfCompResults) {
        this.valueOfCompResults = valueOfCompResults;
    }
}
