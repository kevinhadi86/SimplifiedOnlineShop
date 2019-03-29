package simplified.Online.Shop.dao;

import com.ibatis.sqlmap.client.SqlMapClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Repository;
import simplified.Online.Shop.dto.Product;

import java.util.List;

@Repository
public class ProductDAOImpl extends SqlMapClientDaoSupport implements ProductDAO {

    @Autowired
    @Qualifier("sqlMapClient")
    public void injectSqlMapClient(SqlMapClient sqlMapClient) {
        setSqlMapClient(sqlMapClient);
    }

    @Override
    public List<Product> getAllMyProduct(int id) {
        try {
            return (List<Product>) getSqlMapClientTemplate().queryForList("product.getAllMyProduct",id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;    }

    @Override
    public List<Product> getAllOthersProduct(int id) {
        try {
            return (List<Product>) getSqlMapClientTemplate().queryForList("product.getAllOthersProduct",id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Product getOneProduct(int id) {
        try {
            return (Product) getSqlMapClientTemplate().queryForObject("product.getOneProduct", id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void createProduct(Product product) {
        try {
            getSqlMapClientTemplate().insert("product.createProduct", product);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateProduct(Product product) {
        try {
            getSqlMapClientTemplate().update("product.updateProduct", product);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteProduct(int id) {
        try {
            getSqlMapClientTemplate().delete("product.deleteProduct", id);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
