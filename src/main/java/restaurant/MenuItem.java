package restaurant;

import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();
    }
}
