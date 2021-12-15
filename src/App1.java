public class App1 {

	public static void main(String[] args) {
	String[] s1 = {"Vicente"};
	String[] s2 = {"Vicente", "Ernesto"};
	String[] s3 = {"Vicente", "Ernesto", "Luis Manuel"};
	String[] s4 = {"Vicente", "Ernesto", "Luis Manuel", "Juan Manuel"};
	String[] s5 = {"Vicente", "Ernesto", "Luis Manuel", "Juan Manuel", "Jose Enrique", "Salvador"};

	System.out.println(whoLikesIt(s1));
	System.out.println(whoLikesIt(s2));
	System.out.println(whoLikesIt(s3));
	System.out.println(whoLikesIt(s4));
	System.out.println(whoLikesIt(s5));	
	}

	public static String whoLikesIt(String... names) {
		String texto = "";
		if (names.length == 0) {
			texto = "no one likes this";
		} else if (names.length == 1) {
			texto = names[0] + " likes this";
		} else if (names.length == 2) {
			texto = names[0] + " and " + names[1] + " like this";
		} else if (names.length == 3) {
			texto = names[0] + ", " + names[1] + " and " + names[2] + " like this";
		} else if (names.length >= 4) {
			texto = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
		}

		return texto;
	}
}
