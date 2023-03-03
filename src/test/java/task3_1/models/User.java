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
    private int age;
    private String email;
    private int salary;
    private String department;


}
