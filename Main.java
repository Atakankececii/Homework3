package homework3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Atakan");
		student1.setLastName("Ke�eci");
		student1.setStudentNumber("123456");
		student1.setActive(true);
		student1.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		student1.setHomework("3.g�n JAVA �devi");
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setInstructorNumber("1");
		instructor1.setActive(true);
		instructor1.setCourseName("Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)");
		
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		studentManager.Show(student1);
		System.out.println("----------");
		instructorManager.Show(instructor1);
		

	}

}
