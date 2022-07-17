//this subclass represents a mall
public class Mall extends Business
{
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	
	public Mall() 
	{
		super();
	}//end empty argument constructor
	
	public Mall(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) 
	{
		super(projectName, completeAddress, totalSquareFeet, occupancyGroup, subgroup);
	}//end preferred constructor

	public int getNumRentedUnits() 
	{
		return numRentedUnits;
	}//end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) 
	{
		this.numRentedUnits = numRentedUnits;
	}//end setNumRentedUnits

	public double getMedianUnitSize() 
	{
		return medianUnitSize;
	}//end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) 
	{
		this.medianUnitSize = medianUnitSize;
	}//end setMedianUnitSize

	public int getNumParkingSpaces() 
	{
		return numParkingSpaces;
	}//end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) 
	{
		this.numParkingSpaces = numParkingSpaces;
	}//end setNumParkingSpaces
	
	public void draw()
	{
		System.out.println("Drawing code for Mall");
	}//end draw
	
	public String displayData()
	{
		return "==============================================================\nMall\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Rentable Units: " + numRentableUnits + "\nNumber of Rented Units: " + numRentedUnits
				+ "\nMedian Unit Size: " + medianUnitSize + "\nNumber of Parking Spaces: " + numParkingSpaces;
	}//end displayData

	@Override
	public String toString() 
	{
		return "Mall [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet=" 
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup 
				+ ", numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + "]";
	}//end toString
	
}//end class
