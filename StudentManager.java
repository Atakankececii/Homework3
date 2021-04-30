package homework3;

public class StudentManager extends UserManager {
	
	public void Add(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" sisteme eklendi.");
	}
	
	public void Update(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" öðrenci bilgileri güncellendi. ");
	}

	public void Delete(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" öðrenci silinmiþtir.");
	}
	
	public void Show(Student student) {
		System.out.println("Bilgileri istenen öðrencinin adý :"+student.getFirstName()+"\n"+
	"Öðrencinin soyadý:"+student.getLastName()+"\n"+"Öðrencinin numarasý:"+student.getStudentNumber()+"\n"+"Öðrencinin aktif olma durumu:"+student.isActive()+"\n"+"Öðrencinin varsa ödevi:"+student.getHomework()
	+"\n"+"Öðrencinin aldýðý kurs adý:"+student.getCourseName());
	}
}
