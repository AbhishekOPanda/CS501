public class Faculty extends Employee {

		private String officeHours;
		private String rank;

		// Constructors
		//Construct a Faculty object with specified id, name, address, phone number, email address, office, salary, office hours and rank
		public Faculty(String id, String name, String address, String phone, String email, String office, String officeHours, String rank, double salary) {
			super(id, name, address, phone, email, office, salary);
			this.rank = rank;
			this.officeHours = officeHours;
		}

		//Return officeHours
		public String getOfficeHours() {
			return officeHours;
		}

		//Return rank
		public String getRank() {
			return rank;
		}
		
		//Set new officeHours
		public void setOfficeHours(String officeHours) {
			this.officeHours = officeHours;
		}

		//Set new rank
		public void setRank(String rank) {
			this.rank = rank;
		}

		//Return a string description of the class
		public String toString() {
			return super.toString() + "\nOffice hours: " + officeHours +
			"\nRank: " + rank;
		}
	}