package Week3.Day2;

public class Students {

	
	public void getStudentInfo(int id){
		System.out.println("Student ID is " + id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println(name + "'s ID number is " + id);		
	}
	
	public void getStudentInfo(String name, String email, int phoneNumber) {
		System.out.println(name + "'s email is " + email);
		System.out.println(name + "'s contact number is " + phoneNumber);		
	}
	
	public static void main(String[] args) {
		Students objStudent = new Students();
		
		objStudent.getStudentInfo(1234567);
		objStudent.getStudentInfo(9876543, "Ben");
		objStudent.getStudentInfo("David", "david@david.co.nz", 23984545);
		
		
	}
}


