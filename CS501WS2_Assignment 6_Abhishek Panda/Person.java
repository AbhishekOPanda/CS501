import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
		
		private String name;
		private String address;
		private String phone;
		private String email;
		private static final String EMAIL_REGEX = "^[a-zA-Z][a-zA-Z0-9._-]*\\@\\w+(\\.)*\\w+\\.\\w+$";
	    private static final Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
	    
		class InvalidEmailException extends Exception
		{
		    public InvalidEmailException(String s)
		    {
		        // Call constructor of parent Exception
		        super(s);
		    }
		}
		
		boolean isValidEmail(String email) throws InvalidEmailException{
	        Matcher matcher = emailPattern.matcher(email);
	        if(matcher.matches()==false) {
	        	throw new InvalidEmailException("Email is Invalid.");
	        }
			return true;
	    }
		
		class InvalidSalaryException extends Exception
		{
		    public InvalidSalaryException(String s)
		    {
		        // Call constructor of parent Exception
		        super(s);
		    }
		}
		

		boolean salaryCheck(double salary) throws InvalidSalaryException{
			if(salary<0){
				throw new InvalidSalaryException("Salary is less than zero! Invalid input.");
			}
			return false;
		}

		class InvalidNumberException extends Exception
		{
		    public InvalidNumberException(String s)
		    {
		        // Call constructor of parent Exception
		        super(s);
		    }
		}
		

		boolean numberCheck(String pphone) throws InvalidNumberException{
			if(String.valueOf(pphone).length() !=10){
				throw new InvalidNumberException("Number is Invalid.");
			}
			return true;
		}
		
		//Construct default Person object
		public Person() {
			this("Unknown","Unknown", "Unknown","Unknown");
		}

		//Construct Person object with specified name, address, phone and email
		public Person(String name, String address, String phone, String email) {
			this.name = name;
			this.address = address;
			this.phone = phone;
			this.email = email;
		} 

		//Return name
		public String getName() {
			return name;
		}

		//Return address
		public String getAddress() {
			return address;
		}

		//Return phone
		public String getPhone() {
			return phone;
		}

		//Return email
		public String getEmail() {
			return email;
		}

		//Set new name
		public void setName(String name) {
			this.name = name;
		}

		//Set new address
		public void setAddress(String address) {
			this.address = address;
		}

		//Set new phone number
		public void setPhone(String phone) {
			this.phone = phone;
		}

		//Set new email
		public void setEmail(String email) {
			this.email = email;
		}

		//Return a string description of the class
		public String toString() {
			return "\nName: " + name + "\nAddress: " + address + 
					 "\nPhone number: " + phone + "\nEmail address: " + email;
		}
		
		public String printName() {
			return name;
		}
	}