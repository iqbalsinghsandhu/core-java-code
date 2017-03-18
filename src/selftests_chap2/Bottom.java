package selftests_chap2;

class Top {
public Top(String a){
	System.out.println("B");
}
}

 public class Bottom extends Top {
	 //public void Top (){
		// System.out.println("x");
	 //}
	 public Bottom(String s){
		 super("c");
		 System.out.println("D");
	 }
	 
	 public static void main(String args[]){
		 new Bottom("C");
		 System.out.println("M");
	 }
 }