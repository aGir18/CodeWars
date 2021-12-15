public class App5 {

	public static void main(String[] args) {
		String s1 = "tree";
		String s2 = "foling";
		String s3 = "trashy";
		String s4 = "blue";
		String s5 = "abcdef";
		String s6 = "uvwxyz";
		String[] variasCadenas = {s1, s2, s3, s4, s5, s6};
		System.out.println(longestConsec(variasCadenas, 2));	
		String[] otrasCadena = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
		System.out.println(longestConsec(otrasCadena, 3));
		String[] otrasCadenaDiferente = {"Madrid", "Sevilla", "Betis", "Atleti", "Real Sociedad", "Rayo Vallecano", "Valencia"};
		System.out.println(longestConsec(otrasCadenaDiferente, 2));
	}
//No cumple todas las exigencias, NO está bien
  public static String longestConsec(String[] strarr, int k) {
    String devuelto = "";
  	String intermedio = "";
  	if (strarr.length == 0 || k > strarr.length || k <= 0) {
			devuelto = "Nothing";
		} else {
			for (int i = 0; i < strarr.length - 1; i++) {
				intermedio = strarr[i] + strarr[i + 1];
	  		if (intermedio.length() > devuelto.length()) {
					devuelto = intermedio;
				}
			}
		}
  	  	
  	return devuelto;
  }
}