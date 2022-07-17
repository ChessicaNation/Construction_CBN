//this subclass represents a business
public class Business extends Building
{
	protected int numRentableUnits;

	public Business() 
	{
		super();
	}//end empty argument constructor

	public Business(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor
	
	public int getNumRentableUnits() 
	{
		return numRentableUnits;
	}//end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) 
	{
		this.numRentableUnits = numRentableUnits;
	}//end setNumRentableUnits

	public void draw()
	{
		System.out.println("Drawing code for Business");
	}//end draw
	
	public String displayData()
	{
		return "==============================================================\nBusiness\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Rentable Units: " + numRentableUnits;
	}//end displayData

	@Override
	public String toString() 
	{
		return "Business [projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + ", numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
}//end class
