package task2_1.utils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DataManager {

    private List<String> languages;
    private String query;

    public String getQuery() {
        return query;
    }

    public void setQuery(List<String> query) {
        this.query = query.get(0);
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
}
