public class Aims {
	public static void main(String[] args) {
		var anOrder = new Cart();
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
				18.99f
		);

		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("Tong so tien la: " + anOrder.totalCost());

		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println(
				"Tong so tien sau khi xoa dvd2 la: " +
						anOrder.totalCost()
		);
		anOrder.removeDigitalVideoDisc(dvd1);
		System.out.println(
				"Tong so tien sau khi xoa dvd1 la: " +
						anOrder.totalCost()
		);
		anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println(
				"Tong so tien sau khi xoa dvd3 la: " +
						anOrder.totalCost()
		);
		anOrder.removeDigitalVideoDisc(dvd2);
	}
}