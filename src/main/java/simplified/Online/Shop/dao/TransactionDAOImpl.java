package simplified.Online.Shop.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.dto.Transaction;

import java.util.List;

public class TransactionDAOImpl extends SqlMapClientDaoSupport implements TransactionDAO {

    @Autowired
    @Qualifier("sqlMapClient")
    public void injectSqlMapClient(SqlMapClient sqlMapClient) {
        setSqlMapClient(sqlMapClient);
    }

    @Override
    public List<Transaction> getAllTransaction() {
        return null;
    }

    @Override
    public void createTransaction(Transaction transaction) {
        try {
            getSqlMapClientTemplate().insert("transaction.createTransaction", transaction);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void createDetailTransaction(int id, List<Product> items) {

    }
}
