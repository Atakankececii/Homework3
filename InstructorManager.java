package homework3;

public class InstructorManager extends UserManager {
	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" sisteme eklendi.");
	}
	
	public void Update(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" eðitmen bilgileri güncellendi. ");
	}

	public void Delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+""+instructor.getLastName()+" eðitmen silinmiþtir.");
	}
	
	public void Show(Instructor instructor) {
		System.out.println("Bilgileri istenen eðitmenin adý :"+instructor.getFirstName()+"\n"+
	"Eðitmenin soyadý:"+instructor.getLastName()+"\n"+"Eðitmenin numarasý :"+instructor.getInstructorNumber()+"\n"+"Eðitmenin verdiði kurs:"+instructor.getCourseName());
	}
	
	
}
