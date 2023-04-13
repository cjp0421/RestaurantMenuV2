package restaurant;

import java.time.LocalDate;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private LocalDate dateAdded;

    public MenuItem(String name, String description, double price, String category){
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }
@Override
    public String toString(){
        String newModifier = isNew() ? "*New!" : "";
        return "Name: "+name+
                " Description: "+description+
                " Price: $"+price+"\n"+
                "Date Added: " + dateAdded;
    }

@Override
    public boolean equals(Object toBeCompared){
        //this checks if the object is at the same reference location as the other object
        if(this == toBeCompared){
            return true;
        }
        //Null check
    if(toBeCompared == null){
        return false;
    }
    //Class check
    if(getClass() != toBeCompared.getClass()){
        return false;
    }

    MenuItem otherItem = (MenuItem) toBeCompared;
    return this.name.equals(otherItem.getName());
}

    boolean isNew(){

        boolean isNew = false;

        return isNew;
    }
}

