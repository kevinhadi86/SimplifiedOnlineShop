package simplified.Online.Shop.dto;

import java.util.List;

public class Transaction {

    private int id;
    private int totalPrice;
    private int buyersId;
    private List<Product> items;

    public Transaction(int totalPrice, int buyersId, List<Product> items) {
        this.totalPrice = totalPrice;
        this.buyersId = buyersId;
        this.items = items;
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
     * Getter method for property totalPrice.
     *
     * @return property value of totalPrice
     **/
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * Setter method for property totalPrice.
     *
     * @param totalPrice value to be assigned to property totalPrice
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * Getter method for property buyersId.
     *
     * @return property value of buyersId
     **/
    public int getBuyersId() {
        return buyersId;
    }

    /**
     * Setter method for property buyersId.
     *
     * @param buyersId value to be assigned to property buyersId
     */
    public void setBuyersId(int buyersId) {
        this.buyersId = buyersId;
    }

    /**
     * Getter method for property items.
     *
     * @return property value of items
     **/
    public List<Product> getItems() {
        return items;
    }

    /**
     * Setter method for property items.
     *
     * @param items value to be assigned to property items
     */
    public void setItems(List<Product> items) {
        this.items = items;
    }
}
