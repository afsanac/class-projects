/**
 * 
 */
package introUnit;

/**
 * @author Student8
 *
 */
public class Junior extends Student {
	
	public Junior(String name) {
		super(name);
	}
	
	public void talk(){
		super.talk();
		System.out.println("... and I am a Junior!");
	}

}

