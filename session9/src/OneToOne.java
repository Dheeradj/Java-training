/*
 * 
 * Relation ship mapping: has a mapping
 * 
 * 
 * Use case:
 * one customer has one address
 * 1 customer has many addresses
 * many customers has many addresses
 * 
 * 	Name
 * 	phone
 * 	email
 * 
 * 
 * Adress
 * 	addreslin
 * 	city
 * 	state
 * 
 * example:
 * 
 * 1 teacher can teach many classes
 * 1 teacher can teach many subjects
 * many students are being thought by 1 teacher
 * Customer
 * 
 */

class teacher{
//	Attributes: propery of objects
	String name;
	String phone;
	String email;
	subject[] sbjn;
	
//	Constructer: is executed whic is executed when obejct is created
	//Default constructor
	teacher(){
		name="NA";
		phone="NA";
		email="NA";
		sbjn=null;
	}
	
	teacher(String name, String phone, String email, subject[] sbjn) {
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.sbjn=sbjn;
	}
	
	void updateTeacherDetails(String name, String phone, String email, subject[] sbjn) {
		this.name=name;
		this.phone=phone;
		this.email=email;
		this.sbjn=sbjn;
	}
	
	
	
	void showTeacherDetails() {
		System.out.println("=======================");
		System.out.println("Name is:      "+name);
		System.out.println("Phone is:      "+phone);
		System.out.println("Email is:      "+email);
		System.out.println("=======================");
		System.out.println();
		
//		sbjn.showSubjectDetails();
		for(subject s : sbjn) {
			s.showSubjectDetails();
		}
	}
}




class subject{
	String subjectcode;
	String subjectname;
	String subjectbook;
	
	//default constructor
	subject(){
		subjectcode="NA";
		subjectname="NA";
		subjectbook="NA";
	}
	
	void updateSubjectDetails(String subjectcode, String subjectname, String subjectbook) {
		this.subjectcode=subjectcode;
		this.subjectname=subjectname;
		this.subjectbook=subjectbook;
		
	}
	subject(String subjectcode, String subjectname, String subjectbook){
		this.subjectcode=subjectcode;
		this.subjectname=subjectname;
		this.subjectbook=subjectbook;
	}
	
	void showSubjectDetails() {
		System.out.println("=======================");
		System.out.println("subjectcode is:      "+subjectcode);
		System.out.println("subjectname is:      "+subjectname);
		System.out.println("subjectbook is:      "+subjectbook);
		System.out.println("=======================");
		System.out.println();
		
	}
}

public class OneToOne {

	public static void main(String[] args) {
//		teacher t1 = new teacher("Ishant", "234533245", "afksnk@example.com");
//		t1.showTeacherDetails();
		
		subject s1 = new subject("bsbc-401", "Java", "Javait");
//		s1.showSubjectDetails();
		
		subject s2 = new subject("bsbc-402", "Python", "Phytonworld");
//		s2.showSubjectDetails();
		
	
		subject [] subArr = {s1,s2};
		teacher t1 = new teacher("Ishant", "234533245", "afksnk@example.com", subArr);
		t1.showTeacherDetails();
		
	}

}
