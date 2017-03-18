package chapterseven;

import java.util.*;
import java.io.*; // populateList() needs this

public class TestDVD {
	ArrayList<DVDInfo> dvdlist = new ArrayList<DVDInfo>();

	public static void main(String[] args) {
		new TestDVD().go();
	}

	public void go() {
		populateList();
		System.out.println(dvdlist); // output as read from file
		Collections.sort(dvdlist);
		System.out.println(dvdlist); // output sorted by title
		GenreSort gs = new GenreSort();
		Collections.sort(dvdlist, gs);
		System.out.println(dvdlist); // output sorted by genre
	}

	public void populateList() {
		// read the file, create DVDInfo instances, and
		// populate the ArrayList dvdlist with these instances
		try {
			File dvd = new File("C:/Iqbal/Java/newDir/dvdinfo.txt");
			ArrayList<String> al1 = new ArrayList<String>();
			FileWriter fw1 = new FileWriter(dvd);
			dvd.createNewFile();
			String s1 = new String();
			fw1.write("Donnie Darko sci-fi Gyllenhall, Jake\n");
			fw1.write("Raiders of the Lost Ark action Ford, Harrison\n");
			fw1.write("2001 sci-fi ??\n");
			fw1.write("Caddy Shack comedy Murray, Bill\n");
			fw1.write("Star Wars sci-fi Ford, Harrison\n");
			fw1.write("Lost in Translation comedy Murray, Bill\n");
			fw1.write("Patriot Games action Ford, Harrison\n");
			fw1.close();

			BufferedReader br1 = new BufferedReader(new FileReader(
					"C:/Iqbal/Java/newDir/dvdinfo.txt"));
			String Line;
			while ((Line = br1.readLine()) != null) {
				al1.add(Line);
			}

			System.out.println(al1.size() + "\n");
			System.out.println(al1);

			//System.out.println(dvd.canRead());
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}
}