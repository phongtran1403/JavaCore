package files;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class File_Method {
	private static final String FILE_NAME = "D:\\FileTraining\\abc1102.txt";
	private static final String FOLDER_NAME = "D:\\FileTraining\\";

	public static void main(String[] args) {
		File fileObj = new File(FOLDER_NAME);
		if (fileObj.exists()) {

			// in ra đường link tập tin
			System.out.println("getAbsolutePath : " + fileObj.getAbsolutePath());

			// in ra mục chứa tập tin
			System.out.println("getParent : " + fileObj.getParent());

			// in ra có tập tin có thể đọc k?
			System.out.println("canRead : " + fileObj.canRead());

			// in ra có tập tin có viết đọc k?
			System.out.println("canWrite : " + fileObj.canWrite());

			// in ra có tập tin có phải là thư mục không
			System.out.println("isDirectory : " + fileObj.isDirectory());

			// in ra có tập tin có phải là file không
			System.out.println("isFile : " + fileObj.isFile());

			// in ra chiều dài của FILE
			System.out.println("lenght : " + fileObj.length());

			// thời gian chỉnh sửa cuối cùng
			Date date = new Date(fileObj.lastModified());
			System.out.println("lastModified : " + date);

			// xóa file
			if (fileObj.delete())
			System.out.println("delate successful");

			System.out.println("---------------------------");

			// list file
			File[] listFile = fileObj.listFiles();
			System.out.println("chiều dài file : " + listFile.length);
			// in ra thông số trong tập tin
			for (int i = 0; i < listFile.length; i++) {
				File fileTmp = listFile[i];
				if (fileTmp.isDirectory()) {
					System.out.println("Forlder : "+ fileTmp.getName());
				}if(fileTmp.isFile()) {
					System.out.println("File : "+ fileTmp.getName());
				}
			}

		} else {
			System.out.println("not exist");
			try {
				fileObj.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
