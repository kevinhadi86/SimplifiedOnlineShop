package simplified.Online.Shop.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import simplified.Online.Shop.dto.CartItem;
import simplified.Online.Shop.dto.Product;
import simplified.Online.Shop.dto.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransactionDAOImpl extends SqlMapClientDaoSupport implements TransactionDAO {

    @Autowired
    @Qualifier("sqlMapClient")
    public void injectSqlMapClient(SqlMapClient sqlMapClient) {
        setSqlMapClient(sqlMapClient);
    }

    @Override
    public List<Transaction> getAllTransactionByBuyerId(int id) {
        try {
            return (List<Transaction>) getSqlMapClientTemplate().queryForList("transaction.getAllTransactionByBuyerId",id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Transaction getLastTransaction() {
        try {
            return (Transaction) getSqlMapClientTemplate().queryForObject("transaction.getLastTransaction");
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    public void createDetailTransaction(int id, List<CartItem> items) {
        try {
            for (CartItem item:items) {
                Map map = new HashMap();
                map.clear();
                map.put("transactionId",id);
                map.put("quantity",item.getQuantity());
                map.put("productId", item.getProduct().getId());
                System.out.println(map);
                getSqlMapClientTemplate().insert("transaction.createDetailTransaction", map);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
