//Vu Thuong Dat 20215031
public class Aims {
	public static void main(String[] args) {
		var anOrder = new Cart();
		DigitalVideoDisc[] dvdList = new DigitalVideoDisc[19]; //Tao mang dvdList
		
		var dvd1 = new DigitalVideoDisc(
				"The Lion King",
				"Animation",
				"Roger Allers",
				87,
				19.95f
		);
		var dvd2 = new DigitalVideoDisc(
				"Star Wars",
				"Science Fiction",
				"George Lucas",
				87,
				24.95f
		);
		var dvd3 = new DigitalVideoDisc(
				"Aladdin",
				"Animation",
				"Piaka",
				92,
				18.99f
		);
//Add DVD vao mang
//		dvdList[0] = dvd1;
//		dvdList[1] = dvd2;
//		dvdList[2] = dvd3;
		
		anOrder.addDigitalVideoDisc(dvd1,dvd2);
		
		System.out.println("Total cost to be paid: ");
		System.out.println(anOrder.totalCost());
	}
}
		
		