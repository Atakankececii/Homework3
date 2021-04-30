package homework3;

public class InstructorManager extends UserManager {
	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" sisteme eklendi.");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" e�itmen bilgileri g�ncellendi. ");
	}

	public void Delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" e�itmen silinmi�tir.");
	}
	
	public void Show(Instructor instructor) {
		System.out.println("Bilgileri istenen e�itmenin ad� :"+instructor.getFirstName()+"\n"+
	"E�itmenin soyad�:"+instructor.getLastName()+"\n"+"E�itmenin numaras� :"+instructor.getInstructorNumber()+"\n"+"E�itmenin verdi�i kurs:"+instructor.getCourseName());
	}
	
	
}
