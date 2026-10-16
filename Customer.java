abstract class Customer {
    private String name;
    private String id;
    private int number;
    private String address;
    private String password;

    public Customer(){
    }

    public Customer(int number, String password) {
        this.number = number;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString(){
        String s="Customer Information\n"+"Name: " + name +
          "\nID: " + id +
          "\nNumber: " + number + 
          "\nAddress: " + address;
  return s;
    }
}