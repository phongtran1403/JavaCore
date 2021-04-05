package files;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStream {
	private static final String FILE_NAME = "D:\\FileTraining\\file_stream.txt";

	public static void main(String[] args) {
		writeFile(" Phong ");
		System.out.println(readFile());
//		String A = "D:\\FileTraining\\IMG_3859.JPG";
//		String B = "D:\\FileTraining\\IMGcoppy_3859.JPG";
//		coppiesFile(A, B);
	}

	private static String readFile() {
		StringBuffer stringBuffer = new StringBuffer();
		try {
			FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			int i = 0;
			while ((i = bufferedInputStream.read()) != -1) {
				stringBuffer.append((char) i);

			}
			bufferedInputStream.close();
			fileInputStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stringBuffer.toString();
	}

	private static void writeFile(String data) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME, false);
			BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
			bufferedOutputStream.write(data.getBytes());
			bufferedOutputStream.flush();

			bufferedOutputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void coppiesFile(String pathA, String pathB) { // đường dẫn tới file A và B
		try {
			FileInputStream fileInputStream = new FileInputStream(pathA);
			FileOutputStream fileOutputStream = new FileOutputStream(pathB);
			int i = 0;
			while ((i = fileInputStream.read()) != -1) {
				fileOutputStream.write((byte) i);
			}
			fileInputStream.close();
			fileOutputStream.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
