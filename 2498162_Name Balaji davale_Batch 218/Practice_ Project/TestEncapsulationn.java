
public class TestEncapsulationn {
	public static void main (String[] args)  
    { 
        Encapsulatee obj = new Encapsulatee(); 
        obj.setName("Shalini"); 
        obj.setAge(20); 
        obj.setRoll(32); 
        System.out.println("My name: " + obj.getName()); 
        System.out.println("My age: " + obj.getAge()); 
        System.out.println("My roll: " + obj.getRoll());      
    } 

}
