package chaptersix;

import java.io.*;

public class FirstDir {

	public static void main(String args[]) throws IOException {
		String[] files = new String[10];

		File myDir = new File("newDir");
		// myDir.mkdir();

		File myFile = new File(myDir, "myfile1.txt");

		myFile.createNewFile();

		File myFile2 = new File(myDir, "myfile2.txt");

		myFile2.createNewFile();

		files = myDir.list();

		for (String fn : files)
			System.out.println("Found file " + fn);

		// myFile.delete();

		// File newDir = new File("newDir");

		// myDir.renameTo(newDir);

		// myDir.delete();

		// System.out.println("Delete Dir is "+myDir.delete());

	}

}
