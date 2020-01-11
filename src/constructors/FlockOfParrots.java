package constructors;

public class FlockOfParrots {

	public static void main(String[] args) {
	}

public class Parrot {
		
	String name;
		
	public Parrot(String parrotName) {
	
		/* Parrot p = new Parrot();
		 * p.name = parrotName:
		 * return p
		 */
		
		name = parrotName; //name refers to our instance variable
					
		Parrot myParrot = new Parrot("Dewd");
	
									// from dog exercise in Head First Java p 62
		//myParrot.talk ();

				//Parrot array
		
		Parrot[] myFlock = new Parrot[3];
		
				//some parrots
		
		myFlock[0] = new Parrot();
		myFlock[1] = new Parrot();
		myFlock[2] = myParrot;
		
		myFlock[0].name = "Pickles";
		myFlock[1].name = "Jerry";
				
		System.out.println("My last parrot's name is " + myFlock[3].name);
	
		int x = 0;
		while(x < myFlock.length) {
			myFlock[x].talk();
			x = x + 1;
		}
	}
	public Parrot() {
		// TODO Auto-generated constructor stub
	}
	public void talk() {
		System.out.println(name + "says SQWAK!");
	}
}
			// not sure if I did this right... what outcome did we want? 
						
}

