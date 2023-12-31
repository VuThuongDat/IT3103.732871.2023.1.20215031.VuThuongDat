package hust.soict.hedspi.garbage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class CreateTextFile {
	public static void main(String[] args) {
		String fileName = "sample.txt";
		int fileSizeKB = 100;

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
// Tao noi dung voi kich thuoc xap xi 10 KB
			StringBuilder content = new StringBuilder();
			while (content.length() < fileSizeKB * 1024) {
				content.append("hello world ");
			}
// Ghi noi dung vao tep tin
			writer.write(content.toString());

			System.out.println("Tao file thanh cong: " + fileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
