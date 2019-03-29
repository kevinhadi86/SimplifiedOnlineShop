package simplified.Online.Shop.service;

import simplified.Online.Shop.dto.User;

public interface UserService {
    User findEmailAndPassword(User user);
    User getUserById(int id);
    void createUser(User user);
    void updateUser(User user);
}
