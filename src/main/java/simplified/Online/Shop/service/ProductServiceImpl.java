package simplified.Online.Shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import simplified.Online.Shop.dao.ProductDAO;
import simplified.Online.Shop.dto.Product;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductDAO productDAO;

    /**
     * Getter method for property productDAO.
     *
     * @return property value of productDAO
     **/
    public ProductDAO getProductDAO() {
        return productDAO;
    }

    /**
     * Setter method for property productDAO.
     *
     * @param productDAO value to be assigned to property productDAO
     */
    public void setProductDAO(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public List<Product> getAllMyProduct(int id) {
        return productDAO.getAllMyProduct(id);
    }

    @Override
    public List<Product> getAllOthersProduct(int id) {
        return productDAO.getAllOthersProduct(id);
    }

    @Override
    public Product getOneProduct(int id) {
        return productDAO.getOneProduct(id);
    }

    @Override
    public void createProduct(Product product) {
        productDAO.createProduct(product);
    }

    @Override
    public void updateProduct(Product product) {
        productDAO.updateProduct(product);
    }

    @Override
    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
    }
}
