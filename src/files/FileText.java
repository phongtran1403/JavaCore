package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileText {
	private final static String FILE_NAME = "D:\\FileTraining\\file_text11.txt";

	public static void main(String[] args) {
		writeLineFile();
		System.out.println(readLineFile());
	}

	private static void writeLineFile() {
		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(FILE_NAME, false);
			PrintWriter printWriter = new PrintWriter(fileWriter);

			printWriter.println("Mời");
			printWriter.println("Em");
			printWriter.println("Về");
			printWriter.println("Với");

			printWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static String readLineFile() {
		StringBuffer stringBuffer = new StringBuffer();

		FileReader fileReader;
		try {
			fileReader = new FileReader(FILE_NAME);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String i = null;
			while ((i = bufferedReader.readLine()) != null) {
				stringBuffer.append(i).append("\n");
			}
			bufferedReader.close();
			fileReader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringBuffer.toString();

	}
}
