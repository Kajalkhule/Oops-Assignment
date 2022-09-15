package Question1;

public class TestPerson {
	
	public static void main(String[] args) {

		Employee employee = new Employee(222, "kajal", " Pune", "17/09/1994", 1000, "2/6/2021", "hinjewadi",
				"development", "9999999999", "karan@gmail.com");

		Customer customer = new Customer(333, "komal", "nashik", "1/1/1984", "12/7/1999", "moshi", "123456677",
				"rahul@gmail.com");

		System.out.println(employee);
		System.out.println(customer);

	}


}
