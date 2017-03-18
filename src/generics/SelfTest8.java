package generics;

import java.util.*;

public class SelfTest8 {

	public static void main(String args[]) {

		TreeSet<String> s = new TreeSet<String>();
		TreeSet<String> subs = new TreeSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("d");
		s.add("e"); // s -> a b c d e

		subs = (TreeSet) s.subSet("b", true, "d", true); //subs -> b c d
		s.add("g"); // s -> a b c d e g
		s.pollFirst(); // s -> b c d e g
		s.pollFirst(); // s -> c d e g
		s.add("c2"); // s -> c c2 d e g
		System.out.println(s.size() + " " + subs.size());
	}
}
