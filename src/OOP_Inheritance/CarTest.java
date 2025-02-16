package OOP_Inheritance;

public class CarTest {

	public static void main(String[] args) {
          BMW b = new BMW();
          b.start(); //child (BMW) -- overridden
          b.stop();  //Parent(CAR) - Inherited
          b.refuel(); //Inherited
          b.autoPark(); //Individual method of BMW
          b.engine();
          b.increaseSpeed();
          Car.billing();
          b.getInfo();
          System.out.println(b.speed);
          
          System.out.println("-------------");
          
          Audi au = new Audi();
          au.start();
          au.stop();
          au.refuel();
          au.theftSafety();
          au.engine();
          System.out.println(au.speed);
          
          System.out.println("-------------");
          
          Car c = new Car();
          c.start();
          c.stop();
          c.refuel();
          c.engine();
          System.out.println(c.speed);
          
          System.out.println("-------------");
          
          Truck tr = new Truck();
          tr.loading();
          
          System.out.println("-------------");
          
          //Child class object can be referred by parent class reference variable
          //TOP Casting 
          //With top casting Only connected methods will be accessible
          //Individual methods will not be accessible
          //IS-A relationship
          //BMW is a Car - Top casting
          //BMW is a Vehicle - Top
          //Car is a vehicle - Top
          
          //Every Car is not a BMW - down
          //Every Vehicle is not a BMW - down
          
          
          Car c1 = new BMW();  //no one is referring this object
          c1.refuel();
          c1.stop();
          c1.start();
          c1.engine();
          c1.increaseSpeed();
          c1.getInfo();
          Car.billing();
          BMW.billing();
          
          
          
          // c1.autoPark(); // wont be allowed
          
          
          // Downcasting
          //parent class object can be referred by child class ref variable
          
          // BMW b1 = new Car(); now allowed -- need to apply relationship 
          BMW b1 = (BMW) new Car();  //ClassCastexception during runtime
          b1.autoPark();
          
          BMW b2 = (BMW) new Vehicle(); //ClassCastexception during runtime
          b2.engine();
	}

}
