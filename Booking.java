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
	
	public int estimatedprice(String occupancy) {
		switch(occupancy) {
		case "Single": return 2000;
		case "Double": return 3000;
		case "Triple": return 4000;
		}
		return 0;
	}

}