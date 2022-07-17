//this subclass represents a residential building
public class Residential extends Building
{
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	
	public Residential() 
	{
		super();
	}//end empty argument constructor
	
	public Residential(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end constructor

	public int getNumBedrooms() 
	{
		return numBedrooms;
	}//end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) 
	{
		this.numBedrooms = numBedrooms;
	}//end setNumBedrooms

	public int getNumBathrooms() 
	{
		return numBathrooms;
	}//end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) 
	{
		this.numBathrooms = numBathrooms;
	}//end setNumBathrooms

	public boolean isLaundryRoom() 
	{		
		return laundryRoom;
	}//end isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) 
	{
		this.laundryRoom = laundryRoom;
	}//end setLaundryRoom
	
	public void draw()
	{
		System.out.println("Drawing code for Residential");
	}//end draw
	
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		
		return "==============================================================\nResidential\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN;
	}
	//end displayData

	@Override
	public String toString() 
	{
		return "Residential [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + ", numBedrooms="
				+ numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom=" + laundryRoom + "]";
	}//end toString
	
}//end class
