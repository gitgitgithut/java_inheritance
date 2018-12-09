import java.io.Serializable;

public class WoodScrew extends Screw implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -278155052364744152L;
	private String Drive;
	private String Point;
	
	public WoodScrew(double L, String D, String M, String F, String H, String drive, String point, double P, int n) throws IllegalFastener {
		super(L, D, M, F, H, P, n);
		//Drive
		if (drive == " 6-Lobe" || drive == "Philips" || drive == "Slotted" || drive == "Square")
			Drive = drive;
		else
			throw new IllegalFastener("IllegalFastener Drive");
		//Point
		if (point == "Double Cut" || point == "Sharp" || point == "Type 17")
			Point = point;
		else
			throw new IllegalFastener("IllegalFastener Point");
	}	
	
	public String toString(){
		return "Wood Screw, " + Drive + ", " + Point + ", " + super.toString();
	}
}
