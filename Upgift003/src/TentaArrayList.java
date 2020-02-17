public class TentaArrayList{  
	int id;  
	String name;  
}  
class Test{  
	public static void main(String args[]){  
		//Creating objects  
		TentaArrayList s1=new TentaArrayList();  
		TentaArrayList s2=new TentaArrayList();
		TentaArrayList s3=new TentaArrayList(); 
		TentaArrayList s4=new TentaArrayList(); 
		TentaArrayList s5=new TentaArrayList(); 
		TentaArrayList s6=new TentaArrayList(); 
		//Initializing objects  
		s1.id=101;  
		s1.name="Hasan";  
		s2.id=102;  
		s2.name="Oskar";  
		s3.id=103;  
		s3.name="Calle";  
		s4.id=104;  
		s4.name="Maria";
		s5.id=105;  
		s5.name="Miah";  
		s6.id=106;  
		s6.name="Isabella";
		//Printing data  
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);
		System.out.println(s3.id+" "+s2.name);
		System.out.println(s4.id+" "+s2.name);
		System.out.println(s5.id+" "+s2.name);
		System.out.println(s6.id+" "+s2.name);
	}  
}  