package homework3;

public class StudentManager extends UserManager {
	
	public void Add(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" sisteme eklendi.");
	}
	
	public void Update(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" ��renci bilgileri g�ncellendi. ");
	}

	public void Delete(Student student) {
		System.out.println(student.getFirstName()+""+student.getLastName()+" ��renci silinmi�tir.");
	}
	
	public void Show(Student student) {
		System.out.println("Bilgileri istenen ��rencinin ad� :"+student.getFirstName()+"\n"+
	"��rencinin soyad�:"+student.getLastName()+"\n"+"��rencinin numaras�:"+student.getStudentNumber()+"\n"+"��rencinin aktif olma durumu:"+student.isActive()+"\n"+"��rencinin varsa �devi:"+student.getHomework()
	+"\n"+"��rencinin ald��� kurs ad�:"+student.getCourseName());
	}
}
