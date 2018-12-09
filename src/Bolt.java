import java.io.Serializable;

public class Bolt extends Fastener implements Serializable{
	
	private static final long serialVersionUID = 3124538503363096569L;

	public Bolt(double L, String D, String M, String F, String H, double P, int n) throws IllegalFastener {
		super(L, D, M, F, H, P, n);
		if (F == "Black Phosphate" || F == "ACQ 1000 Hour" || F == "Lubricated")
			throw new IllegalFastener("Illegal Finish");
		else if (M == "Aluminium" || M == "Copper" || M == "Nylon")
			throw new IllegalFastener("Illegal Material");
	}
	
	public String toString(){
		return super.toString();
	}
}