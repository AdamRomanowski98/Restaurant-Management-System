
package Main;

import java.util.Vector;




public class Menu {
   
    Vector<Item> Appetizers = new Vector<>();
    Vector<Item> Burgers = new Vector<>();         //creating vectors for each section 
    Vector<Item> Drinks = new Vector<>();
    
    
    
    
   
    public Menu(){
        //appetizers
        Appetizers.add(new Item("Chips", "Appetizers", 3));
        Appetizers.add(new Item("Onion Rings", "Appetizers", 3));     //adding items to the vector
        Appetizers.add(new Item("Chicken Wings", "Appetizers", 3));
        
        //burgers
        Burgers.add(new Item("Beef Burger", "Burgers", 9));
        Burgers.add(new Item("Chilli Burger", "Burgers", 10));      //adding items to the vector
        
        //drinks
        Drinks.add(new Item("Sprite", "Drinks", 1));
        Drinks.add(new Item("Coca Cola", "Drinks", 1));                 //adding items to the vector
        
    }
    
  public String getAppetizers(){
      
      String apetizers = "Appetizers:\n";
    
      for(int i = 0; i < Appetizers.size(); i++){
          Item a = Appetizers.get(i);                   //acessor to get the values from the vector
          apetizers += a.toString()+ "\n";
      }
      return apetizers;
      
      
  }
   
  public String getBurgers(){
      
      String burgers = "Burgers :\n";
    
      for(int i = 0; i < Burgers.size(); i++){
          Item a = Burgers.get(i);                  //acessor to get the values from the vector
          burgers += a.toString()+ "\n";
      }
      return burgers;
      
      
  }
  
   public String getDrinks(){
      
      String drinks = "Drinks :\n";
    
      for(int i = 0; i < Drinks.size(); i++){
          Item a = Drinks.get(i);                           //acessor to get the values from the vector
          drinks += a.toString()+ "\n";
      }
      return drinks;
      
      
  }
  
   
   
    
}
