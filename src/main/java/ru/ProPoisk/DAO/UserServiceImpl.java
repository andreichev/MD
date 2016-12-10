package ru.ProPoisk.DAO;

import ru.ProPoisk.models.User;

import java.sql.SQLException;

/**
 * Created by apple on 22.08.16.
 */
public class UserServiceImpl implements UserService {

    UserDao myDAO;

    public UserServiceImpl(UserDao userDao){
        myDAO = userDao;
    }

    public boolean isRegistered(String userName) {
        User[] allUsers = new User[0];
        try {
            allUsers = myDAO.getAll();
        } catch (SQLException e) {
            System.out.println("Error getting all users: " + e.getMessage());
        }

        for(User user : allUsers) {
            if (user.getName().equals(userName)) {
                return true;
            }
        }

        return false;
    }
}
