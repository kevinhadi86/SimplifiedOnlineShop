package simplified.Online.Shop.dto;

import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private int id;
    private int totalPrice;
    private int buyerId;
    private List<CartItem> items;

    public Transaction() {
        items = new ArrayList<>();
    }

    public Transaction(int totalPrice, int buyerId, List<CartItem> items) {
        this.totalPrice = totalPrice;
        this.buyerId = buyerId;
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
    public int getBuyerId() {
        return buyerId;
    }

    /**
     * Setter method for property buyersId.
     *
     * @param buyerId value to be assigned to property buyersId
     */
    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    /**
     * Getter method for property items.
     *
     * @return property value of items
     **/
    public List<CartItem> getItems() {
        return items;
    }

    /**
     * Setter method for property items.
     *
     * @param items value to be assigned to property items
     */
    public void setItems(List<CartItem> items) {
        this.items = items;
    }

    public void addItemToList(CartItem cartItem){
        items.add(cartItem);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                ", buyerId=" + buyerId +
                ", items=" + items +
                '}';
    }
}
