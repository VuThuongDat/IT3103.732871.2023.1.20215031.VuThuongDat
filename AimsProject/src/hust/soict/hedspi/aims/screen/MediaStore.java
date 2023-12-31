package hust.soict.hedspi.aims.screen;
import hust.soict.hedspi.aims.cart.Cart;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.Playable;
public class MediaStore extends JPanel {
	private Media media;
	private static Cart cart=new Cart();
	public MediaStore(Media media) {
		this.media = media;
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		JLabel title = new JLabel(media.getTitle());
		title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 20));
		title.setAlignmentX(CENTER_ALIGNMENT);

		JLabel cost = new JLabel(""+ media.getCost()+" $");
		cost.setAlignmentX(CENTER_ALIGNMENT);

		JPanel container = new JPanel();
		container.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton addButton = new JButton("Add to cart");
		container.add(addButton);
		addButton.addActionListener(new ButtonListener(media));
		if (media instanceof Playable) {
			JButton playButton = new JButton("Play");
			container.add(playButton);
			playButton.addActionListener(new ButtonListener(media));
		}

		this.add(Box.createVerticalGlue());
		this.add(title);
		this.add(cost);
		this.add(Box.createVerticalGlue());
		this.add(container);

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	public static void setCart(Cart cart) {
		MediaStore.cart = cart;
	}
	private class ButtonListener implements ActionListener {
        private Media media;
        public ButtonListener(Media media) {
            super();
            this.media = media;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String button = e.getActionCommand();
            if (button.equals("Add to cart")) {
                    cart.addMedia(media);
            } else if (button.equals("Play")) {
                    media.play();
            }
        }
    }
}