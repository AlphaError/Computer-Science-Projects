/**
 * 
 */
package Notes;

/**
 * @author User
 *
 */
public class ClassNotes8 {

	/**
	 * 
	 */
	public ClassNotes8() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/* Class Hierarchy and Inheritance
	 * * Helps reduce duplication of code by factoring out common code from similar classes into a common superclass
	 * * * subclasses don't inherit constructors or assessors of the superclass
	 * * * sintax: use subclass.super to reference the superclass
	 */
	
	/* Inheritance
	 * * use inheritance to define a hierarchy of classes
	 * * * ex: Subclass *extends Superclass
	 * * * public class Human extends Animal
	 * * Inheritance represents an IS-A(n) relationship between objects
	 * * * an object of a subclass IS-A(n) object of the superclass
	 */
	
	
	/* Abstract Classes
	 * * some methods in a class can be declared abstract and left with only their method signatures defined
	 * * any class with 1 or more methods, the class itself has to be declared abstract
	 * ex...
	 *  public abstract class Balloon {
			...
			public abstract void draw(...);
		}
	 * * an abstract class can have fields, constructions, and other regular methods
	 * * abstract classes commonly serve as superclasses for more specific classes
	 * * abstract classes are closer to the root of the hierarchy -- they describe more abstract objects
	 * 
	 * * Java doesn't allow you to create objects of abstract classes
	 * * * abstract classes can have constructions
	 * * * * they are called from the constructors of the subclass
	 * * A class with no abstract methods is called concrete
	 */
}
