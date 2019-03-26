package simplified.Online.Shop.service;

import simplified.Online.Shop.dto.User;

public interface LoginService {
    User findEmailAndPassword(User user);
}
