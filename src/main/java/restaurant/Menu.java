package restaurant;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

       private ArrayList<MenuItem> menuItems = new ArrayList<>();
        private Date lastUpdated;

        //not including a constructor definition allows for the use of the default constructor - that's how Caroline did it, but I did it this way?
       public Menu (Date dateUpdated, ArrayList<MenuItem> menuItems){
           this.lastUpdated = dateUpdated;
           this.menuItems = menuItems;
       }


    public ArrayList<MenuItem> getMenuItems(){
           for(MenuItem item : menuItems){
               System.out.println(item.toString());
           }
           return menuItems;
    }

//    public getAllMenuItems() {
//        for(MenuItem item : menuItems) {
//            item.toString();
//        }

  //  }

    public void addMenuItem(MenuItem newItem){
    String message = "That item is on the menu already.";
    if(menuItems.contains(newItem)){
        System.out.println(message);
        return;
        }
    for(MenuItem item : menuItems){
        if(item.equals(newItem)){
            System.out.println(message);
            return;
            }
        }

        menuItems.add(newItem);
//        lastUpdated = LocalDate.now();

    }

    public void removeItem(MenuItem item){
        menuItems.remove(item);
        lastUpdated = new Date();
    }

}
