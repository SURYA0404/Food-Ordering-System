package org.example;

public class FoodOrder {
    private int oid;
    private String customber;
    private String daddress;
    private int items;
    private int quantity;
    private int price;
    private String statues;

    public int getOid() {
        return oid;
    }

    public void setOid(int oid) {
        this.oid = oid;
    }

    public String getCustomber() {
        return customber;
    }

    public void setCustomber(String customber) {
        this.customber = customber;
    }

    public String getDaddress() {
        return daddress;
    }

    public void setDaddress(String daddress) {
        this.daddress = daddress;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    public String getStatues() {
        return statues;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public void setStatues(String statues) {
        this.statues = statues;
    }

}
