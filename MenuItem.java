//Class for Menu Item
public class MenuItem {
	
    private int itemNumber;
    
    private String itemName;
    private String description;
    private double basicPrice;
    
    // Default Constructor
    MenuItem()
    {
        itemNumber=0;
        basicPrice= 200;
        itemName= "unknown";
        description=null;
    }
    // Parameterized Constructor
    MenuItem(int itemNumber,String name,String description,double basicPrice)
    {
        this.itemNumber = itemNumber;
        this.itemName = name;
        this.description = description;
        this.basicPrice = basicPrice;
    }
    //getter for number
     public int getItemNumber()
    {
        return itemNumber;
    }
    //setter for number
     public void setItemNumber(int itemNumber)
    {
        this.itemNumber = itemNumber;
    }
    //getter for name 
     public String getItemName()
     {
         return itemName;
     }
     //setter for name
     public void setItemName(String name)
     {
         this.itemName = name;
     }
     //getter for description
     public String getDescription()
     {
         return description;
     }
     //setter for description
     public void setDescription(String description)
     {
         this.description = description;
     }
     //getter for price
     public double getBasicPrice()
     {
         return basicPrice;
     }
     //setter for price
     public void setBasicPrice(double basicPrice)
     {
         this.basicPrice = basicPrice;
     }
     // Customized toString method
     @Override
     
     public String toString()
     {
         return "Menu => "+"\n  Number : "+getItemNumber()+"\n Name : "+getItemName()+"\n Price : "+getBasicPrice()+"\n Description : "+getDescription();
     }
     
    }
    
    // Class for Standard Menu Item
    class StandardMenuItem extends MenuItem{
        // Default Constructor
        StandardMenuItem()
        {
          super();
        }
        // Parameterized Constructor
        StandardMenuItem(int itemNumber,String itemName,String description,double itemPrice)
        {
            super(itemNumber,itemName,description,itemPrice);
        }
        //getter for price
        public double getItemPrice()
        {
            return super.getBasicPrice();
        }
        //setter for price
        public void setItemPrice(double itemPrice)
        {
            super.setBasicPrice(itemPrice);
        }
        @Override
        public String toString()
        {
             return "Standard Menu => "+"\n  Number : "+getItemNumber()+"\n Name : "+getItemName()+"\n Price : "+getItemPrice()+"\n Description : "+getDescription();
        }
        
    }
    
    //Class for Premium Menu Item
    class PremiumMenuItem extends MenuItem{
        
        private double surcharge;
        
        //Default Constructor
        PremiumMenuItem()
        {
            super();
        }
        //Parameterized Constructor
        PremiumMenuItem(int number,String name,String description,int basicPrice,int surcharge)
        {
            super(number,name,description,basicPrice);
            this.surcharge = surcharge;
        }
        //getter for Price
        public double getItemPrice()
        {
            
            return super.getBasicPrice()+(surcharge/100)*super.getBasicPrice();
        }
        //setter for price
        public void setItemPrice(double basicPrice,double surcharge)
        {
            super.setBasicPrice(basicPrice);
            this.surcharge = surcharge;
            
        }
        @Override
        public String toString()
        {
            return "Standard Menu => "+"\n  Number : "+getItemNumber()+"\n Name : "+getItemName()+"\n Price : "+getBasicPrice()+"\n Description : "+getDescription();
        }
    }
