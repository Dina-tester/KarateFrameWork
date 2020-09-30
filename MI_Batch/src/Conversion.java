import java.io.File;

public class Conversion {

	public static void main(String[] args) {

		File ods = new File("C:\\Users\\dinesh\\Desktop\\CV and Index\\");
		String[] list = ods.list();
	int listSize = list.length;
		System.out.println(listSize);
		for (String x : list) {
			System.out.println(x);
		}

		File[] ODSFiles = ods.listFiles();
		System.out.println(ODSFiles);
		int length = ODSFiles.length;
		System.out.println(length);
//
//		for (File file : ODSFiles) {
//
//			System.out.println(file.getName());
//
//		}
//		System.out.println();
//		System.out.println("----------------------------");
		System.out.println();
		for (int i = 0; i < ODSFiles.length; i++) {
			String path = ODSFiles[i].getPath();
			System.out.println("getPath() = "+path);

		System.out.println("getName() = "+ODSFiles[i].getName());

			File absoluteFile = ods.getAbsoluteFile();
			System.out.println("getAbsoluteFile() = "+absoluteFile);

			String absolutePath = ods.getAbsolutePath();
			 System.out.println("getAbsolutePath() = "+absolutePath);
			 
			 System.out.println("getPath() = "+ods.getPath());
			 System.out.println("getName() = "+ods.getName());

	}

	}

}
