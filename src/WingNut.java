import java.io.Serializable;

public class WingNut extends Nut implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -288466255794945090L;

	public WingNut(String D, String M, String F, double P, int n) throws IllegalFastener {
		super(D, M, F, P, n);
	}
	
	public String toString(){
		return "Wing Nut, " + super.toString();
	}
}
