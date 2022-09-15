package Question9.com;
//WAP to demonstrate the use of clone method. Clone one object of Product class :-
//pid, pname, price and unitOfMeasurement. When you clone object of class Product 
//change the product name and price.  With the help of instanceOf check that the
//newly created object is belong to Product class or not.
public class Product implements Cloneable{
	int pid;
	String pname;
	int price;
	String unitOfMeasurement;
	
	public Product(int pid, String pname, int price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}

	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

public static void main(String[] args) {
	try{  
		Product p=new Product(1,"kajal",20000,"rs");  
		  
		Product p1=(Product)p.clone();
		
		System.out.println(p.pname+" "+p.pname);
		System.out.println(p1.price+" "+p1.price);
		
		String pname ="asdd";
		boolean re1=pname instanceof String;
		 System.out.println("pname is instance of String"+re1);
		boolean re2=p instanceof Product;	
		  System.out.println("pname is instance of string"+re2);
		}catch(CloneNotSupportedException c){}  
		  
		}  

}
