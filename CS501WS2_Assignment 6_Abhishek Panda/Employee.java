public class Employee extends Person {

		private String id;
		private String office;
		private double salary;
		private MyDate dateHired;
		
		//Construct Employee object
		public Employee(String id, String name, String address, String phone, String email, String office, double salary) {
			super(name, address, phone, email);
			this.id = id;
			this.office = office;
			this.salary = salary;
			this.dateHired = new MyDate();
		}

		//Return office
		public String getOffice() {
			return office;
		}

		//Returns id
		public String getId() {
			return id;
		}
			
		//Return salary
		public String getSalary() {
			return String.format("%.2f", salary);
		}

		//Return date hired
		public String getDateHired() {
			return dateHired.getMonth() + "/" + dateHired.getDay() 
					 + "/" + dateHired.getYear();
		}

		//Set new office
		public void setOffice(String office) {
			this.office = office;
		}

		//Set new id
		public void setId(String id) {
			this.id = id;
		}
		
		//Set new salary
		public void setSalary(double salary) {
			this.salary = salary;
		}

		//Set new dateHired
		public void setDateHired() {
			dateHired = new MyDate();
		}

		//Return a string description of the class
		public String toString() {
			return "\nID: " + id + super.toString() + "\nOffice: " + office + 
					 "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
		}
	}