package service;

import entity.User;

import java.util.List;

public class ValidateServiceClass {


    public int checkUserHaveIdAndName(List<User> list) {

        int check = 0;

        for (User user : list) {
            if (user.getId() != 0 && user.getName() != null) {

                check++;

            }
        }
        return check;
    }
}
