
	class Student{
		String name;
		String email;
		long phone;
		int age;
		String course;
		int batch;
		
		void setDetailsOfStudent(String n,String e,long p,int a,String c,int ba) {
			name =n;
			email=e;
			phone=p;
			age=a;
			course=c;
			batch=ba;
		}
		
		void showDetailsOfStudent() {
			System.out.println("Name:       "+name);
			System.out.println("Email:      "+email);
			System.out.println("Phone:      "+phone);
			System.out.println("Age:        "+age);
			System.out.println("Course:     "+course);
			System.out.println("Batch:      "+batch);
			
		}
	}

public class assignment {
	
	public static void main(String[] args) {
		
		int i = 10;

		int[] arr = {10, 20, 30, 40, 50};
		
		
		
		Student student1= new Student();
		Student student2= new Student();
		Student student3= student1;
		
		
	
		
		student1.setDetailsOfStudent("Dheeradj", "d@gmail.com", 8968849114l, 20, "BCA", 24);
		student2.setDetailsOfStudent("Ronaldo", "ronaldo@Email.com", 8968849114l, 20, "BCA", 24);
		student3.setDetailsOfStudent("Dheeradj", "Email", 8968849114l, 20, "BCA", 24);
		student1.showDetailsOfStudent();
	
	}



	
}

