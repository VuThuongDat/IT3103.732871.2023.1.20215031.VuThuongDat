//Vu Thuong Dat 20215031
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	public DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered;
	private static int nextId = 1;
	public Cart() {
		this.qtyOrdered = 0;
	}
//Kiem tra dieukien
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null)
			return;
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Gio hang da day");
			return;
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].equals(disc)) {
				System.out.println("Khong the them vi " + disc.getTitle() + " da co trong gio hang!!");
				return;
			}
		}
		disc.setId(nextId++);
		itemsOrdered[qtyOrdered] = disc;
		qtyOrdered++;
		System.out.println("Them thanh cong " + disc.getTitle()+ " (ID: " + disc.getId() + ")");
	}
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
        for (DigitalVideoDisc disc : dvdList) {
            addDigitalVideoDisc(disc);
        }
    }
    
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	addDigitalVideoDisc(dvd1);
    	addDigitalVideoDisc(dvd2);
    }
//remove DVD
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (disc == null)
			return;
		if (qtyOrdered == 0) {
			System.out.println("Gio hang trong");
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
			System.out.println("Khong tim thay " + disc.getTitle());
		else {
			System.out.println("Da xoa "+ disc.getTitle());
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
	
	public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        if (qtyOrdered != 0) {
            for (int i = 0; i < qtyOrdered; ++i) {
                System.out.println((i + 1) + ". DVD " + itemsOrdered[i].toString());
            }
        } else {
            System.out.println("");
        }

        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}