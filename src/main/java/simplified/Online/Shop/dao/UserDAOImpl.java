package simplified.Online.Shop.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;
import simplified.Online.Shop.dto.User;

@Repository
public class UserDAOImpl extends SqlMapClientDaoSupport implements UserDAO {

    @Autowired
    @Qualifier("sqlMapClient")
    public void injectSqlMapClient(SqlMapClient sqlMapClient) {
        setSqlMapClient(sqlMapClient);
    }

    @Override
    public User validateLogin(User user) {
        try {
            return (User) getSqlMapClientTemplate().queryForObject("user.getUser", user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public User getUserById(int id) {
        try {
            return (User) getSqlMapClientTemplate().queryForObject("user.getUserById", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createUser(User user) {
        try {
            getSqlMapClientTemplate().insert("user.createUser", user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User user) {
        try {
            getSqlMapClientTemplate().update("user.updateUser", user);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
