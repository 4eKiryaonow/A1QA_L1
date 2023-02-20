package task2_1.entity;

import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class GameResult {
    private String name;
    private List<GamePlatform> gamePlatforms;
    private String releaseDate;
    private String reviewSummaryResult;
    private String price;


}
