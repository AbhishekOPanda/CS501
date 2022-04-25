public class Staff extends Employee {

		private String title;

		// Constructors
		//Construct a Staff object
		public Staff(String id, String name, String address, String phone,	String email, String office, String title, double salary) {
			super(id, name, address, phone, email, office, salary);
			this.title = title;
		}

		//Return title
		public String getTitle() {
			return title;
		}

		//Set new title
		public void setTitle(String title) {
			this.title = title;
		}

		//Return a string description of the class
		public String toString() {
			return super.toString() + "\nTitle: " + title;
		}
	}