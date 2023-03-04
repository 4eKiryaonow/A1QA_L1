package task3_1.models;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User {

    private String firstName;
    private String lastName;
    private String age;
    private String email;
    private String salary;
    private String department;


}
