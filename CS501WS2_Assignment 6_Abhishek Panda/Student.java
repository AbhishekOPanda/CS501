
public class Student extends Person {

		private String id;
		private int status;
		public final static int FRESHMAN = 1;
		public final static int SOPHOMORE = 2;
		public final static int JUNIOR = 3;
		public final static int SENIOR = 4;

		public Student(String id, String name, String address, String phone, String email, int status) {
			super(name, address, phone, email);
			this.id = id;
			this.status = status;
		}

		public Student() {
			// TODO Auto-generated constructor stub
		}

		//Set new id
		public void setId(String id) {
			this.id = id;
		}
		
		//Set new status
		public void setStatus(int status) {
			this.status = status; 
		}

		//Returns id
		public String getId() {
			return id;
		}
		
		//Return status
		public String getStatus() {
			switch (status) {
				case 1 : return "freshman"; 
				case 2 : return "sophomore"; 
				case 3 : return "junior"; 
				case 4 : return "senior";
				default : return "Unknown"; 
			}
		}

		//Return a string description of the class
		public String toString() {
			return "\nID: " + id + super.toString() + "\nStatus: " + getStatus();
		}
	}