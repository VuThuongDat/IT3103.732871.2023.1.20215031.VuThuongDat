public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered;

	public Cart() {
		this.qtyOrdered = 0;
	}
//Kiem tra dieukien
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null)
			return;
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is almost full");
			return;
		}
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("The disc has been added");
	}
//remove DVD
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null)
			return;
		if (qtyOrdered == 0) {
			System.out.println("The cart is  empty");
			return;
		}

		var found = false;
		for (int i = 0; i < qtyOrdered; ++i) {
			if (!found && itemsOrdered[i] == disc)
				found = true;
			if (found && i < qtyOrdered - 1) {
				itemsOrdered[i] = itemsOrdered[i + 1];
			} else if (found) {
				itemsOrdered[i] = null;
			}
		}

		if (!found)
			System.out.println("The disc was not in the cart");
		else {
			System.out.println("The disc has been removed");
			qtyOrdered--;
		}
	}
//total

	public float totalCost() {
		float sum = 0;
		for (int i = 0; i < qtyOrdered; ++i) {
			sum += itemsOrdered[i].getCost();
		}
		return sum;
	}
}