import java.io.Serializable;

public class Nut extends Fastener implements Serializable{


	private static final long serialVersionUID = -5569470705527663928L;

	public Nut(String D, String M, String F, double P, int n) throws IllegalFastener {
		super(D, M, F, P, n);
		if (F == "Black Phosphate" || F == "ACQ 1000 Hour" || F == "Lubricated")
			throw new IllegalFastener("Illegal Finish");
		else if (M == "Aluminium" || M == "Copper" || M == "Nylon")
			throw new IllegalFastener("Illegal Material");
	}
	
	public String toString(){
		return super.toString();
	}

}
