/*6.1-ChoosingOption
 * Vu Thuong Dat-20215031*/
package hust.soict.dsai.lab01;
import javax.swing.JOptionPane;
public class Ex6_1_ChoosingOption{
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
		JOptionPane.showMessageDialog(null,"You're chosen:"+(option==JOptionPane.YES_OPTION?"Yes":"NO"));
		System.exit(0);
	}
}
/*QA:
 * Nếu người dùng chọn hủy chương trình sẽ in ra You'ra chosen:NO
 * De chi co 2 lua chon Yes và No hoặc I do và I don't ta có thể thay câu lệnh thứ 7 và 8 thành
 * Object[] options = {"I do", "I don't"};
 * int option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?","Confirm",
 * JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
 * JOptionPane.showMessageDialog(null,"You're chosen:"+(option==JOptionPane.YES_OPTION?"I do":"I don't"));
 */
 