class Booking{
	private int roomId;
	private String floor;
	private String occupancy;
	
	public Booking(int roomId, String floor, String occupancy) {
		this.roomId = roomId;
		this.floor = floor;
		this.occupancy = occupancy;
	}
	
	public int getRoomId() {
		return roomId;
	}
	public String getFloor() {
		return floor;
	}
	public String getOccupancy() {
		return occupancy;
	}
	
	//private Customer customer;

	

/*
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
*/	
	
	

}