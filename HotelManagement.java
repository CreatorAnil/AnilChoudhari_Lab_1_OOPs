import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class HotelManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hotel hotel = new Hotel("taj","Mumbai",2,7,4.5f,"5 Star");
		
		Amenity AC = new Amenity("AC",true);
	    
		Room room1 = new Room(101,"Single",false,"1");
		room1.setAmenities(Arrays.asList(AC));
		
		Room room2 = new Room(102,"Double",false,"1");
		room2.setAmenities(Arrays.asList(AC));
		
		Room room3 = new Room(103,"Double",false,"1");
		
		Room room4 = new Room(201,"Single",false,"2");
		room4.setAmenities(Arrays.asList(AC));
		
		Room room5 = new Room(202,"Single",false,"2");
		
		Room room6 = new Room(203,"Double",false,"2");
		room6.setAmenities(Arrays.asList(AC));
		
		Room room7 = new Room(204,"Triple",false,"2");
		room7.setAmenities(Arrays.asList(AC));
		
		hotel.setRooms(Arrays.asList(room1,room2,room3,room4,room5,room6,room7));
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("");
			System.out.println("Welcome in Taj hotel");
		
			System.out.println("type of room : Single or Double or Triple");
			String input1 = in.next();
			
			System.out.println("AC or non-AC");
			String input2 = in.next();
			
			System.out.println("which floor: 1 or 2");
			String input3 = in.next();
			
			BookingReq req = new BookingReq(input1,input2,input3);
			
			List<Room> rooms=hotel.getRooms();
			
			for(Room room:rooms) {
				//remaining :-need to add one more validation for AC
				if ((input3.equals(room.getFloor()) && req.getOccupancy().equals(room.getOccupancy()))) {
					if(room.isRoomStatus()==false) {
						Booking book = new Booking(room.getRoomId(),room.getFloor(),room.getOccupancy());
						//remaining :-need add the AC price in book class's method
						System.out.println(room.getRoomId()+" , "+ room.getOccupancy()+" Occupancy "+ book.estimatedprice(room.getOccupancy()));
						//remaining :-need set this status in book class
						room.setRoomStatus(true);
						break;
					}
					}

				//remaining :-need add if user don't give floor number
				
				}
			}
		}
}
	