import java.io.Serializable;

public class FlatWasher extends Washer implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5152313082125788048L;

	public FlatWasher(double OD, double ID, double T, String M, String F, double P, int n) throws IllegalFastener {
		super(OD, ID, T, M, F, P, n);
	}	
	
	public String toString(){
		return "Flat Washer, " + super.toString();
	}
}