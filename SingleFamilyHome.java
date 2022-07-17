//this subclass represents a single family home
public class SingleFamilyHome extends Residential
{
	private boolean garage;

	public SingleFamilyHome() 
	{
		super();
	}//end empty argument constructor

	public SingleFamilyHome(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor

	public boolean isGarage() 
	{
		return garage;
	}

	public void setGarage(boolean garage) 
	{
		this.garage = garage;
	}//end setGarage
	
	public void draw()
	{
		System.out.println("Drawing code for SingleFamilyHome");
	}//end draw
	
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		String yesOrNo = garage ? "Yes" : "No";
		
		return "==============================================================\nSingle Family Home\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN + "\nGarage: " + yesOrNo;
	}
	//end displayData
	
	
	
	
	
	
	
}//end class
