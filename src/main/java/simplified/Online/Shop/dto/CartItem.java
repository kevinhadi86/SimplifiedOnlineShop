package simplified.Online.Shop.dto;

public class CartItem {

    private int id;
    private int transactionId;
    private Product product;
    private int quantity;
    private int productPrice;

    public CartItem() {
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    /**
     * Getter method for property id.
     *
     * @return property value of id
     **/
    public int getId() {
        return id;
    }

    /**
     * Setter method for property id.
     *
     * @param id value to be assigned to property id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter method for property transactionId.
     *
     * @return property value of transactionId
     **/
    public int getTransactionId() {
        return transactionId;
    }

    /**
     * Setter method for property transactionId.
     *
     * @param transactionId value to be assigned to property transactionId
     */
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * Getter method for property product.
     *
     * @return property value of product
     **/
    public Product getProduct() {
        return product;
    }

    /**
     * Setter method for property product.
     *
     * @param product value to be assigned to property product
     */
    public void setProduct(Product product) {
        this.product = product;
    }

    /**
     * Getter method for property quantity.
     *
     * @return property value of quantity
     **/
    public int getQuantity() {
        return quantity;
    }

    /**
     * Setter method for property quantity.
     *
     * @param quantity value to be assigned to property quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getProductPrice() {
        return product.getPrice()*quantity;
    }
}
