package simplified.Online.Shop.dto;

public class Product {

    private int id;
    private String name;
    private String description;
    private int price;
    private int stock;

    public Product() {
    }

    public Product(String name, String description, int price, int stock) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
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
     * Getter method for property name.
     *
     * @return property value of name
     **/
    public String getName() {
        return name;
    }

    /**
     * Setter method for property name.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property description.
     *
     * @return property value of description
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Setter method for property description.
     *
     * @param description value to be assigned to property description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Getter method for property price.
     *
     * @return property value of price
     **/
    public int getPrice() {
        return price;
    }

    /**
     * Setter method for property price.
     *
     * @param price value to be assigned to property price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * Getter method for property stock.
     *
     * @return property value of stock
     **/
    public int getStock() {
        return stock;
    }

    /**
     * Setter method for property stock.
     *
     * @param stock value to be assigned to property stock
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
