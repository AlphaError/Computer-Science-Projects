/**
 * 
 */
package Notes;

/**
 * @author User
 *
 */
public class ClassNotes9 {

	/**
	 * 
	 */
	public ClassNotes9() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/* Polymorphism
	 * * Ensures that the correct method is called for an object of a specific type,
	 * * * even when that object is disguised as a reference to a more generic type
	 * * * type: the type of the object's superclass or some ancestor higher up on the inheritance line
	 * * Once you define a common superclass, polymorphism is just there so you don't need to do anything special
	 * Implemented through a technique in Java known as late(or dynamic) method binding
	 * * this means that it determines which method to call at run-time instead of compile time
	 * * In *Triangle.java Assume we had left getArea() & getPerimeter() as concrete methods
	 * * * if we call Triangle eqTri = new EquilateralTriangle(12) --> eqTri will be an triangle with an equilateral triangle inside it,
	 * * * *its just using equilateral's parameter
	 * * * Then saying eqTri.getArea() would overwrite the getArea() in it's superclass(Triangle) and use Equilateral's method~due to polymorphism
	 * * * * get calls at runtime
	 */
	 
	
	/* Interfaces (and Class Hierarchies)
	 * * interface: any mechanism that connects two devices or entities and defines the rules for their interaction
	 * |Chess/Checkers/Chomp| <-- |Player| --> |ComputerPlayer/HumanPlayer|
	 * * * player is the interface that governs interactions between the types of players and the game
	 * * * think of the interaction system from your Unreal Game (its an interface)
	 * *Java interfaces are like abstract classes
	 * * * does not have fields or constructors
	 * * * all of its methods are abstract
	 */
	//ex interface code
	public interface Strategy {
		Location findBestMove(ChompGame game);
		Location findRandomMove(ChompGame game); //has location class
	}
	/*
	 * * "public abstract" is not written because all the methods are public abstract
	 * * Interface can have public static constants
	 * * * must state that a class impliments an interface
	 * ex; public class Walts implements Dance {}
	 * * * also unlike superclasses, you can impliment an infinite amount of interfaces
	 */
	
	/* Review
	 * interface --> implements
	 * * you need to define all previous methods
	 * superclass --> extends
	 */
	
	public class Waltz implements Dance { //dance is an interface
		//...
		public String getName() {
			return "Waltz";
		}
		public String getSteps(int m) {/*...*/}
		public int[] getBeat() {/*...*/}
		//...
	}
	/* Interfaces cont'd (next day)
	 * * A concrete class that implements an interface must redefine all methods of said interface
	 * * An abstract class that implements an interface can supply some of the methods, leaving others abstract
	 * * A class can implement several interfaces
	 * * Like an abstract class, an interface supplies a secondary data type of objects of a class that impliments the interface
	 * ex; Dance d = new Waltz();
	 */
	public interface Edible{
		String getFoodGroup();
		int getCaloriesPerServing();
		
	}
	public class Pancake implements Edible {}
	public class Breakfast {
		private int my TotalCalories = 0;
		//...
		public void eat(Edible obj, int servings) {
			myTotalCalories += obj.getCaloriesPerServing{}*servings;
		} //the correct method is called for any specfic type of Edible eg; {
	//...
	}
	
	/* Classes (properties)
	 * * superclasses provides a secondary data type to objects of its subclass
	 * * an abstract cannot be instantiated
	 * * a concrete subclass of an abstract class must define all inherited abstract methods
	 * * a class can extend another class - a subclass can add methods and override some of the superclass' methods
	 * * a class can only extend one class
	 * * a class can have fields
	 * * a class can define its own constructor (or a default constructor)
	 * * a class has all of its methods defined. An abstract class usually has one or more abstract methods
	 * * * an abstract class can implement an interface and leave some of its methods abstract *
	 * Interfaces (properties)
	 * * an interface provides a secondary data type to objects of classes that implement that interface
	 * * an interface cannot be instigated
	 * * a concrete class that implements on interface must define all the methods specified by interface
	 * * an interface can extend another interface (called a superinterface) by adding declarations of abstract methods
	 * * a class can implement any number of interfaces
	 * * an interface cannot have fields (besides some public static final constants)
	 * * an interface has no constructors
	 * * an interface may belongs to a small hierarchy of interfaces, but it isnt common practice
	 * * * you can extend an interface from a subclass but cannot extend an interface from a subinterface
	 */
	
	
	/* Test Review **
	 * What is an abstract class?
	 * * a class that contains one or more abstract methods
	 * Why is it better to use an abstract method than an empty method?
	 * * the compiler ensures that your concrete class defines all abstract methods of a superclass (reminder to not override it)
	 * What is a concrete class?
	 * * a class with all methods defined (aka not an abstract class)
	 * What is the main difference(s) between an abstract class and an interface?
	 * * all an interface's methods are abstract vs. an abstract class can contain both abstract and concrete classes
	 * * interfaces also cannot have constructors and have very limited fields vs. classes that can use both
	 * Can a class implement several interfaces?
	 * * yes (however not multiple superclasses)
	 * Supposed you declare a variable of an interface type. What kind of value can be assignment to that variable?
	 * * An object of any class that implements the interface
	 */
	
	/* Worksheet Corrections:
	 * 1
	 * * Subclasses invoke the constructor(s) of their superclasses by using super()
	 * 15
	 * * A subclass of Quadrilateral could be abstract, and abstract subclasses do not have to define all the abstract methods of its superclass
	 * * * all methods must be defined for a program to execute
	 * 16
	 * * super() must always be at the top of the constructor or you will get an error
	 * 18
	 * * must only have abstract classes in an interface --> therefore no declaration can be made
	 * * * cannot cast a class to another class of a different hierarchy
	 * 22
	 * * class polyporphism on c2 --> which needs to be casted to class two to run method 2
	 * 37-38
	 * * polymorphic method, this means that it is a superclass method that is overridden in at least one of its subclasses during run time,
	 * *  there is dynamic binding between the calling object and the method, that is, the actual instance is bound to its particular overridden method,
	 * *  In drawLetters the method, the correct version of draw is called during each iteration of the for loop, and a banner with
	 * *  the appropriate letters is drawn
	 * * * aka how the compiler decides which method to use
	 * 
	 */

}
