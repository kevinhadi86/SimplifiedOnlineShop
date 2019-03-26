package simplified.Online.Shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import simplified.Online.Shop.dao.UserDAO;
import simplified.Online.Shop.dto.User;

@Service
public class LoginServiceImpl implements LoginService {
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
}
