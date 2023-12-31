package hust.soict.globalict.garbage;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
		String filename = "sample.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;

		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (Exception e) {
			e.printStackTrace();
		}

		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}
