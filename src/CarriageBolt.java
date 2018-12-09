import java.io.Serializable;

public class CarriageBolt extends Bolt implements Serializable{
	
	private static final long serialVersionUID = -6018613361762201344L;

	public CarriageBolt(double L, String D, String M, String F, double P, int n) throws IllegalFastener {
		super(L,D, M, F, "Round", P, n);
	}

	public String toString(){
		return "Carriage Bolt, " + super.toString();
	}
}
