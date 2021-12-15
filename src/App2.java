public class App2 {

	public static void main(String[] args) {
		String texto1 = "the-stealth-warrior";
		String texto2 = "The_Stealth_Warrior";
		System.out.println(toCamelCase(texto1));
		System.out.println(toCamelCase(texto2));
		
	}

  static String toCamelCase(String s){
    String texto = "";
    String separador1 = "-";
    String separador2 = "_";
    String[] texto1;
    
    if (s.contains(separador1)) {
    	texto1 = s.split(separador1);
      for (int i = 1; i < texto1.length; i++) {
        String primeraLetra = texto1[i].substring(0, 1);
        String restoLetras = texto1[i].substring(1, texto1[i].length());
        primeraLetra = primeraLetra.toUpperCase();
        texto1[i] = primeraLetra + restoLetras;
  		}
      for (String string : texto1) {
  			texto += string;
  		}      
		}    
    if (s.contains(separador2)) {
    	texto1 = s.split(separador2);
      for (int i = 0; i < texto1.length; i++) {
        texto += texto1[i];
      }
     
    }
		return texto;
	
  }
}
