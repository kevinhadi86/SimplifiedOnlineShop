package simplified.Online.Shop.dao;

import simplified.Online.Shop.dto.User;

public interface UserDAO {
    User validateLogin(User user);
    User getUserById(int id);
    void createUser(User user);
    void updateUser(User user);
}
