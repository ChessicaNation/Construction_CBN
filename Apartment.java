//this subclass represents an apartment
public class Apartment extends Residential
{
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	
	public Apartment() 
	{
		super();
	}//end empty argument constructor
	
	public Apartment(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
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

	public double getAvgUnitSize() 
	{
		return avgUnitSize;
	}//end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) 
	{
		this.avgUnitSize = avgUnitSize;
	}//end setAvgUnitSize

	public boolean isParkingAvailable() 
	{
		return parkingAvailable;
	}//end isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) 
	{
		this.parkingAvailable = parkingAvailable;
	}//end setParkingAvailable
	
	public void draw()
	{
		System.out.println("Drawing code for Apartment");
	}//end draw
	
	public String displayData()
	{
		String yOrN = laundryRoom ? "Yes" : "No";
		String yesOrNo = parkingAvailable ? "Yes" : "No";
		
		return "==============================================================\nApartment\n==============================================================\n" 
				+ "Project Name: " + projectName + "\nComplete Address: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup
				+ "\nNumber of Bedrooms: " + numBedrooms + "\nNumber of Bathrooms: " + numBathrooms
				+ "\nLaundry Room: " + yOrN + "\nNumber of Rentable Units: " + numRentableUnits
				+"\nAverage Unit Size: " + avgUnitSize + "\nParking Available: " + yesOrNo;
	}//end displayData

	@Override
	public String toString() {
		return "Apartment [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + ", numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}//end toString
	
}//end class
