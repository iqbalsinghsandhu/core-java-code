package chapterseven;

class DVDInfo implements Comparable<DVDInfo>{
	String title;
	String genre;
	String leadActor;

	DVDInfo(String t, String g, String a) {
		// Sorting Collections and Arrays (Exam Objectives 6.3 and 6.5) 569
		title = t;
		genre = g;
		leadActor = a;
	}

	
	public int compareTo(DVDInfo d) {
		return title.compareTo(d.getTitle()); // #2
		}
	
	public String toString() {
		return title + " " + genre + " " + leadActor + "\n";
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getLeadActor() {
		return leadActor;
	}


	public void setLeadActor(String leadActor) {
		this.leadActor = leadActor;
	}
	
	
	
}