package simplified.Online.Shop.dao;

import simplified.Online.Shop.dto.User;

public interface UserDAO {
    User validateLogin(User user);
}
