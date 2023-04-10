public class Customer {
    private String name;
    private String address;
    
    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String GetName(){
        return this.name;
    }
    public String GetAddress(){
        return this.address;
    }
    public void SetName(String name){
        this.name = name;
    }
    public void SetAddress(String address){
        this.address = address;
    }
}
