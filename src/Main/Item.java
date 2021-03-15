
package Main;




class Item {
    
    public double price;  
    public String name;       //objects    
    public String category;
  
    
    
    
    public Item(String name, String category, double price){
        this.name=name;
        this.category=category;    //constructor to save data entered by user
        this.price=price;
        
        
    }
    
   
    @Override
    public String toString(){
        
               return name+ "\t" +price;  //returning the values so name and price can be displayed in String
                 
    }
      
    }
    
    
    

