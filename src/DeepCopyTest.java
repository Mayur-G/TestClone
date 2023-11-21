
public class DeepCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		 Student object1 = new Student();
	     object1.setName("Ravi");
	     object1.setRollNo(1); 	        
	     Address a1 = new Address(101, "CHD");
	     object1.setAddress(a1);
	     
	     //DEEP COPY , clone both Student and Address class 
	     Student object2 = (Student) object1.clone();
	     object2.setAddress((Address)object1.getAddress().clone());
	 
	     object2.setName("Ram");
	     object2.setRollNo(2); 	        
	     object2.getAddress().setCity("KRK");
	     object2.getAddress().setPinCode(102);
	     
	     
	     
	     System.out.println("Printing values from Object1:");
	     System.out.println("Name:"+object1.getName() + " RollNo:"+ object1.getRollNo());
	     System.out.println("Address:"+ object1.getAddress().getPinCode() + " and " + object1.getAddress().getCity());
	    System.out.println();
	     System.out.println("Printing values from Object2:");
	     System.out.println("Name:"+object2.getName() + " RollNo:"+ object2.getRollNo());
	     System.out.println("Address:"+ object2.getAddress().getPinCode() + " and " + object2.getAddress().getCity());
	     System.out.println("Is both object are same in heap memory:" + (object1 == object2));
	     System.out.println("Is both Address object are same in heap memory:"+(object1.getAddress() == object2.getAddress()));
	}

}
