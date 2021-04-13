package personfile;

public class Customer extends person{
    int customerNumber;
    boolean mailingList;
    
    Customer(String name,String address, int phoneNumber, int customerNumber, boolean mailingList){
    super(name, address, phoneNumber);
    this.customerNumber = customerNumber;
    this.mailingList = mailingList;
    }

    public int getCustomerNumber(){
        return customerNumber;
    }
    
    public boolean getMailingList(){
        return mailingList;
    }
    
    public void setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
    }
    
    public void setMailingList(boolean mailingList){
        this.mailingList = mailingList;
    }
    
    @Override
    public String toString(){
        return "\n\nThe customer name is: "+name+".\tThe customer address is: "+address+".\tThe phone number: "+phoneNumber+".\nThe customer number is: "+customerNumber+".\tMailing list: "+mailingList;
    }
}
