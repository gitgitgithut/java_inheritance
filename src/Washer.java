import java.io.Serializable;

public class Washer extends Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4783636973472462597L;
	private Double OuterDiameter;
	private Double InnerDiameter;
	private Double Thickness;
	
	public Washer(Double OD, Double ID, Double T, String M, String F, double P, int n) throws IllegalFastener {
		super(M, F, P, n);
		if (F == "Black Phosphate" || F == "ACQ 1000 Hour" || F == "Lubricated")
			throw new IllegalFastener("Illegal Finish");
		//Outer Diameter
		if (OD >= 0.187 && OD <= 2.010)
			OuterDiameter = OD;
		else
			throw new IllegalFastener("Illegal Outer Diameter");
		// Inner Diameter
		if (ID >= 0.068 && ID <= 0.817 && ID <= (OuterDiameter - 0.1))
			InnerDiameter = ID;
		else
			throw new IllegalFastener("Illegal Inner Diameter");
		//Thickness
		if (T >= 0.015 && T <= 0.109)
			Thickness = T;
		else
			throw new IllegalFastener("Illegal Thickness");
	}
	
	public String toString(){
		return OuterDiameter + "\" OD, " + InnerDiameter + "\" ID, " + Thickness + "\" thick, " + super.toString();
	}
}
