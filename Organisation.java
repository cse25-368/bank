public class Organisation extends Customer {
    
    private String email;
    private String fax;
    private String tradingName;

    public Organisation(){
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getTradingName() {
        return tradingName;
    }

    public void setTradingName(String tradingName) {
        this.tradingName = tradingName;
    }

    public String toString() {
        String s="Organisation Information\n"+"Email: " + email +
          "\nFax: " + fax +
          "\nTrading Name: " + tradingName;
        return s;
    }
}
