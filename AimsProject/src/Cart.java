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
		System.out.println("Them thanh cong: " + disc.getTitle());
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
	public void printCart() {
		System.out.println("***********************CART***********************");

		if (qtyOrdered != 0) {
			for (int i = 0; i < qtyOrdered; ++i) {
				System.out.println((i + 1) + ". DVD " + itemsOrdered[i].toString());
			}
		} else {
			System.out.println("Cart is empty! Please add DVD to Cart!");
		}

		System.out.println("Total cost: " + totalCost());
		System.out.println("***************************************************");
	}
	public void searchCart(int id){
    	int check = 0;
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].isMatch(id)) {
    			check = 1;
    			System.out.println(itemsOrdered[i].toString());
    			break;
    		}
    	}
    	if(check == 0) {
    		System.out.println("Khong tim thay");
    	}
    }
    public void searchCart(String title){
    	int check = 0;
    	for(int i = 0; i < qtyOrdered; i++) {
    		if(itemsOrdered[i].isMatch(title)) {
    			check = 1;
    			System.out.println(itemsOrdered[i].toString());
    			break;
    		}
    	}
    	if(check == 0) {
    		System.out.println("Khong tim thay");
    	}
    }
}
