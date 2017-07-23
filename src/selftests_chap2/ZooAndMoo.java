package selftests_chap2;

public class ZooAndMoo {
	
	public void useAMoo(){
		System.out.println("In useAMoo method");
		Moo m = new Moo();
		m.useAZoo();
	}
	
	public static void main (String args[]){
		ZooAndMoo z = new ZooAndMoo();
		z.useAMoo();
	}
	

}

class Zoo {
	public String coolMethod() {
	return "Wow baby";
	}
	}
	class Moo {
	public void useAZoo() {
	Zoo z = new Zoo();
	// If the preceding line compiles Moo has access
	// to the Zoo class
	// But... does it have access to the coolMethod()?
	System.out.println("A Zoo says, " + z.coolMethod());
	// The preceding line works because Moo can access the
	// public method
	}
	}