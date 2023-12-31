//Vu Thuong Dat 20215031
package hust.soict.hedspi.aims.screen;
import javax.swing.*;

import hust.soict.hedspi.aims.media.Book;
import hust.soict.hedspi.aims.media.CompactDisc;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;
import hust.soict.hedspi.aims.media.Track;
import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.cart.Cart;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
public class StoreScreen extends JFrame {
	private Store store;
	private Cart cart;
	private static List<Track> tracks;
	private static List<String> authors;
	public StoreScreen(Store store,Cart cart) {
		this.store = store;
		this.cart = cart;
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());

		cp.add(createNorth(), BorderLayout.NORTH);
		cp.add(createCenter(), BorderLayout.CENTER);
		
		setVisible(true);
		setTitle("Store");
		setSize(1024, 768);
	}
	
	JPanel createNorth() {
		JPanel north = new JPanel();
		north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));
		north.add(createMenuBar());
		north.add(createHeader());
		return north;
	}
	
	JMenuBar createMenuBar() {
		JMenu menu = new JMenu("Options");

		JMenu smUpdateStore = new JMenu("Update Store");
		smUpdateStore.add(new JMenuItem("Add Book"));
		smUpdateStore.add(new JMenuItem("Add CD"));
		smUpdateStore.add(new JMenuItem("Add DVD"));

		menu.add(smUpdateStore);
		menu.add(new JMenuItem("View store"));
		menu.add(new JMenuItem("View cart"));

		JMenuBar menuBar = new JMenuBar();
		menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
		menuBar.add(menu);

		return menuBar;
	}
	
	JPanel createHeader() {
		JPanel header = new JPanel();
		header.setLayout(new BoxLayout(header, BoxLayout.X_AXIS));

		JLabel title = new JLabel("AIMS");
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 50));
		title.setForeground(Color.CYAN);

		JButton viewcart = new JButton("View cart");
		viewcart.setPreferredSize(new Dimension(100, 50));
		viewcart.setMaximumSize(new Dimension(100, 50));
		viewcart.addActionListener(new ButtonListener(cart));

		header.add(Box.createRigidArea(new Dimension(10, 10)));
		header.add(title);
		header.add(Box.createHorizontalGlue());
		header.add(viewcart);
		header.add(Box.createRigidArea(new Dimension(10, 10)));

		return header;
	}
	
	JPanel createCenter() {
		JPanel center = new JPanel();
		center.setLayout(new GridLayout(3, 3, 2, 2));
		MediaStore.setCart(cart);
		ArrayList<Media> mediaInStore = store.getItemsInStore();
		int numItems = Math.min(9, mediaInStore.size());
		for (int i = 0; i < numItems; i++) {
			MediaStore cell = new MediaStore(mediaInStore.get(i));
			center.add(cell);
		}
		return center;
	}
	public static void main(String[] args) throws Exception {
        Store store = new Store();
        Cart cart = new Cart();
        Media media1 = new DigitalVideoDisc("The Lion King", "Animation", "John Director", 87,  19.95f);
        store.addMedia(media1);
        authors= new ArrayList<>();
		authors.add("Antoine de Saint-Exupéry");
		Media media2 = new Book("The little prince","Animation",authors, 18.15f);
		store.addMedia(media2);
		tracks = new ArrayList<>();
		tracks.add(new Track("I do", 5));
		tracks.add(new Track("The night", 3));
		Media media3 = new CompactDisc("Music", "US-UK","Artist X", tracks , 20.81f);
		store.addMedia(media3);
        new StoreScreen(store, cart);
    }
	private class ButtonListener implements ActionListener {
        private Cart cart;

        public ButtonListener(Cart cart) {
            super();
            this.cart = cart;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("View cart")) {
            	new CartScreen(cart);
            }
        }
    }
}