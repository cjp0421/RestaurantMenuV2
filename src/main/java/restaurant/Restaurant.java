package restaurant;


import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Fried Cheese", "Cheese - breaded and fried", 5.00, "Appetizer");
        MenuItem item2 = new MenuItem("Cheese Pizza", "Cheese pizza, tomato sauce", 10.00, "Main Course");
        MenuItem item3 = new MenuItem("Snickerdoodle Cookies", "Two fresh sugar cookies coated in cinnamon sugar", 5.00, "Dessert");
        MenuItem item4 = new MenuItem("Lemon Sorbet", "Two scoops of frozen lemonade flavored sorbet", 4.00, "Dessert");
        MenuItem item5 = new MenuItem("Meat Lover's Pizza", "Cheese pizza, tomato sauce, sausage, pepperoni, and bacon", 13.50, "Main Course");
        Menu menu1 = new Menu(new Date(), new ArrayList<MenuItem>());

        menu1.addMenuItem(item1);
        menu1.addMenuItem(item2);
        menu1.addMenuItem(item3);
        menu1.addMenuItem(item4);
        menu1.addMenuItem(item5);

//        System.out.println(item2.toString());
        menu1.getMenuItems();
    }
}