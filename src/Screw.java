import java.io.Serializable;

public class Screw extends Fastener implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Screw(double L, String D, String M, String F, String H, double P, int n) throws IllegalFastener {
		super(L, D, M, F, H, P, n);
		if (M == "Aluminium" || M == "Copper" || M == "Nylon")
			throw new IllegalFastener("Illegal Material");
	}
	
	public String toString(){
		return super.toString();
	}
}
