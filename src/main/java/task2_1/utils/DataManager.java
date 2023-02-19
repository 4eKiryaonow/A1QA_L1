package task2_1.utils;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class DataManager {

    private List<String> languages;

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
