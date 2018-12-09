import java.io.Serializable;

public class Fastener implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3962924282906586389L;
	private String Diameter;
	private Double Length;
	private String Material;
	private String Finish;
	private String Head;
	private double UnitPrice;
	private int Number;
	
	//default constructor
	public Fastener(double P, int n) throws IllegalFastener{
		//Unit Price
		if (P > 0)
			UnitPrice = P;
		else
			throw new IllegalFastener("Illegal Unit Price");
		//Number of Unit
		if (n == 1 || (n > 0 && (n % 5) == 0))
			Number = n;
		else
			throw new IllegalFastener("Illegal Number per Unit");	
	}
	/**
	 * Constructor
	 * @param M (String)material
	 * @param F (String)finish
	 * @param P (double)price per unit
	 * @param n (int)number per unit
	 * @throws IllegalFastener
	 */
	public Fastener(String M, String F, double P, int n) throws IllegalFastener{
	this(P, n);
	//Materials and Finish
	if ( M == "Steel"){
		Material = M;
		if (F == "Chrome" || F == "Hot Dipped Galvanized" || F == "Plain" || F == "Yellow Zinc" || F == "Zinc" || F == "Black Phosphate" 
				|| F == "ACQ 1000 Hour" || F == "Lubricated")
			Finish = F;
		else
			throw new IllegalFastener("Illegal Finish");
	}
	else if (M == "Brass" || M == "Stainless Steel" || M == "Aluminium" || M == "Copper" || M == "Nylon"){
		Material = M;
		if (F == "Plain")
			Finish = F;
		else 
			throw new IllegalFastener("Illegal Finish");
	}
	else
			throw new IllegalFastener("Illegal Material");

	}
	
	public Fastener(String D, String M, String F, double P, int n) throws IllegalFastener{
		this(M, F, P, n);
		//Diameter
		if (D == "#8-13" || D == "#8-15" || D == "#8-32" || D == "#10-13" || D == "#10-24" || D == "#10-32" 
		|| D == "1/4-20"  || D == "5/16-18" || D == "3/8-16" || D == "7/16-14" || D == "1/2-13" || D == "5/8-11" || D == "3/4-10")
			Diameter = D;
		else
			throw new IllegalFastener("Illegal Diameter");
	}
	/**
	 * Constructor
	 * @param L (double) length
	 * @param M (String) material
	 * @param F (String) finish
	 * @param P (double) price per unit
	 * @param n (int) number per unit
	 * @throws IllegalFastener
	 */
	public Fastener(double L, String D, String M, String F, double P, int n) throws IllegalFastener{
		this(D, M, F, P, n);
		//Length
		if (L < 6 && L > 0.5){
			if (Math.IEEEremainder(L, 0.25) != 0)
				throw new IllegalFastener("Illegal Length");
			else
				Length = L;
		}
		else if (L < 11 && L > 6){
			if (Math.IEEEremainder(L, 0.5) != 0)
				throw new IllegalFastener("Illegal Length");
			else
				Length = L;
		}
		else if (L < 20 && L > 11){
			if (Math.IEEEremainder(L, 1) != 0)
				throw new IllegalFastener("Illegal Length");
			else
				Length = L;
				}
		else
			throw new IllegalFastener("Illegal Length");
	}
	
	/**
	 * third Constructor, further includes Head
	 * @param L length
	 * @param D diameter/thread size
	 * @param M material
	 * @param F finish
	 * @param H head
	 * @param P price per unit
	 * @param n number per unit
	 * @throws IllegalFastener
	 */
	public Fastener(double L, String D, String M, String F, String H, double P, int n ) throws IllegalFastener{
		this(L, D, M, F, P, n);
		//Head	
		if (H == "Bugle" || H == "Flat" || H == "Oval" || H == "Pan" || H == "Round")
			Head = H;
		else
			throw new IllegalFastener("Illegal Head");
	}
	
	public double getOrderCost(int order){
			return UnitPrice * Number * order;
	}
	
	public String toString(){
		return Head + ", " + Length + "\" long, " + Diameter + ", " + Material + ", with a" + Finish + " finish. " + Number + " in a unit, $" + 
						UnitPrice + " per unit.\n";
	}
}
