/*import java.time.LocalDateTime;
import java.util.ArrayList;*/

abstract class Account{

private String branchName;
private String accountNo;
//private double deposit;
private double balance;
//private LocalDateTime date;
//private ArrayList<String> transactionHistory;
private Customer id;
private String chequeId;
private String investmentId;
private String savingsId;
private String type;

public Account(Customer id, String branchName, String chequeId, String investmentId, String savingsId, String accountNo){
 this.id=id;
this.branchName=branchName;
this.accountNo=accountNo;
this.chequeId=chequeId;
this.investmentId=investmentId;
this.savingsId=savingsId;
}

public String getBranchName(){
return branchName;
}

public void setBranchName(String branchName){
this.branchName=branchName;
}

public String getAccountNo(){
return accountNo;
}

public void setAccountNo(String accountNo){
this.accountNo=accountNo;
}

public double getBalance(){
return balance;
}

public Customer getId(){
return id;
}

public void setId(Customer id){
this.id=id;
}

public boolean processDeposit(double deposit){

if (deposit > 0){
this.balance = this.balance + deposit;
return true;
}
System.out.println("ERROR: Invalid transaction amount!");
return false;
}

public String determineAccountType(){

if((this.investmentId==null && this.savingsId==null) && this.chequeId != null){
type="Cheque Account";}
else if(((this.chequeId==null && this.savingsId==null) && this.investmentId!= null)){
type="Investment Account";}
else {type="Savings Account";}
return type;

}

public String toString(){

String s="Customer Information\n\n" +"Branch Name: "+branchName+ "\nAccount Number: "+accountNo+"\nAccount Type: "+type;
return s; 
}


}