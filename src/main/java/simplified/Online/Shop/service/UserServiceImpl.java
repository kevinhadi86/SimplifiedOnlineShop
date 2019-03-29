package simplified.Online.Shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplified.Online.Shop.dao.UserDAO;
import simplified.Online.Shop.dto.User;

@Service("loginService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDAO userDAO;

    /**
     * Getter method for property userDAO.
     *
     * @return property value of userDAO
     **/
    public UserDAO getUserDAO() {
        return userDAO;
    }

    /**
     * Setter method for property userDAO.
     *
     * @param userDAO value to be assigned to property userDAO
     */
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public User findEmailAndPassword(User user) {
        return userDAO.validateLogin(user);
    }

    @Override
    public User getUserById(int id) {
        return userDAO.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userDAO.createUser(user);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }
}
