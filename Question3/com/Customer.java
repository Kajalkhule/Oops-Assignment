//Create Class Customer which will have following class members: - CustId, 
//accountno, custname, cust_address, cust_dob, cust_account_opening_date, 
//Branch_Obj. Class Branch  :- branch_id, branch_name, branch_address.
//Class Customer_Account_Statement:-  CAID, CustId, amount, deposit_withdrawl, 
//deposit_date. Now you have to create Customer, Branch and CustomerAccountStatement class object. CustomerAccountStatement will have multiple records as one customer will deposit and withdrawal the amount. So you need to print the statement as per the CustomerId.
//What is expected:- you will create multiple object of customer class. Also you have to create multiple object of the CustomerAccountStatement and while printing detail of CustomerAccountStatement you have to print detail of Customer.

package Question3.com;

public class Customer {
	int custid;
	int accountno;
	String custname;
	String cust_address;
	String cust_dob;
	String cust_account_opening_date;
	String Branch_Obj;
	
	public int getCustid() {
		return custid;
	}
  public void setCustid(int custid) {
		this.custid = custid;
	}
  public int getAccountno() {
		return accountno;
	}
public void setAccountno(int accountno) {
		this.accountno = accountno;
	}
public String getCustname() {
		return custname;
	}

public void setCustname(String custname) {
		this.custname = custname;
	}
public String getCust_address() {
		return cust_address;
	}
public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
public String getCust_dob() {
		return cust_dob;
	}
public void setCust_dob(String cust_dob) {
		this.cust_dob = cust_dob;
	}
public String getCust_account_opening_date() {
		return cust_account_opening_date;
	}
public void setCust_account_opening_date(String cust_account_opening_date) {
		this.cust_account_opening_date = cust_account_opening_date;
	}
public String getBranch_Obj() {
		return Branch_Obj;
	}
public void setBranch_Obj(String branch_Obj) {
		Branch_Obj = branch_Obj;
	}
public Customer(int custid, int accountno, String custname, String cust_address, String cust_account_opening_date2,
			String branch_Obj2) {
		super();
		this.custid = custid;
		this.accountno = accountno;
		this.custname = custname;
		this.cust_address = cust_address;
		this.cust_dob = cust_account_opening_date2;
		this.cust_account_opening_date = branch_Obj2;
	}
}
