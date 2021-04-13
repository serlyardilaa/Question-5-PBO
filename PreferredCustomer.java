package personfile;

public final class PreferredCustomer extends Customer {
    int purchase;
    double discount;
    
    public PreferredCustomer(String name,String address, int phoneNumber, int customerNumber, boolean mailingList, int purchase){
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.purchase = purchase;
    
    if(purchase == 500)
        setDiscount(5);
    else if(purchase == 1000)
        setDiscount(6);
    else if(purchase == 1500)
        setDiscount(7);
    else if(purchase == 2000)
        setDiscount(10);
    }
    
    public double getPurchase(){
        return purchase;
    }
    
    public double getDiscount(){
        return discount;
    }
    
    public void setPurchase(int purchase){
        this.purchase = purchase;
    }
    
    public void setDiscount(double discount){
        this.discount = discount;
    }
    
    @Override
    public String toString(){
        String preferredCustomer = super.toString()+"\nPurchase: "+getPurchase()+"\nDiscount: "+getDiscount();
        return preferredCustomer;
    }
}
    
    
