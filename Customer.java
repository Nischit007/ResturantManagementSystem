package ResturantManagementSystem;

public class Customer {
   private String name;
   private double discount;
   private String status;
   Customer(){
    this.name="unknown";
    this.status="unknown";    
   }
   Customer(String name,String status){
    this.name=name;
    this.status=status;

    
   }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setStatus(String status){
        this.status=status;
    }
    public String getStatus(){
        return status;
    }
    public void setDiscount(String status){
        if(status=="active"){
           discount=10;
        }else if(status=="vip"){
            discount=15;

        }else{
            discount=0;
        }
    }
    
    public double getDiscount(){
        return discount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ").append(name).append("\n");
        sb.append("Status: ").append(status).append("\n");
        sb.append("Disount: ").append(discount).append("\n");
        return sb.toString();
    }

}
