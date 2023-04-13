package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {



       private ArrayList<MenuItem> menuItems = new ArrayList<>();
    Date lastUpdated;
       public Menu (Date dateUpdated, ArrayList<MenuItem> menuItems){
           this.lastUpdated = dateUpdated;
           this.menuItems = menuItems;
       }



    public void getMenuItems() {
        for(MenuItem item : menuItems) {
            System.out.println(item.toString());
        }

    }
}
