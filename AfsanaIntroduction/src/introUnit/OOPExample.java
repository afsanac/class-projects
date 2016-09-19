/**
 * 
 */
package introUnit;

/**
 * @author Student8
 * This class us designed to contrast with the ProceduralExample.
 * It embodies an Object-Oriented approach
 */
public class OOPExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian","progammer");
		Student joseph = new Student("Joseph");
		Student jordan = new Student("Jordan");
		jillian.talk();
		joseph.talk();
		jordan.talk();

	}

}

