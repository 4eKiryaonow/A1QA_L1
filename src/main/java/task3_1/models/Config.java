package task3_1.models;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Config {

    private String url;
    private String browser;
    private String waitDuration;
    private List<String> options;

}
