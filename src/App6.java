public class App6 {

	public static void main(String[] args) {
		System.out.println(digital_root(30));
		System.out.println(digital_root(497821));
		
	}
//Esta es la más sencilla si no nos hicieran falta números gigantes, si no seguir
  public static int digital_root(int n) {
    int solucionSuma = 0;
  	String number = String.valueOf(n) ;
  	char[] digitos = number.toCharArray();
    int[] myInt = new int[digitos.length];
  	for (int i = 0; i < digitos.length; i++) {
			myInt[i] = Character.getNumericValue(digitos[i]);
		}
  	for (int i = 0; i < myInt.length; i++) {
			solucionSuma += myInt[i];
		}
  	
  	if (solucionSuma > 10) {
  		String number2 = String.valueOf(solucionSuma) ;
    	char[] digitos2 = number2.toCharArray();
      int[] myInt2 = new int[digitos2.length];
    	for (int i = 0; i < digitos2.length; i++) {
  			myInt2[i] = Character.getNumericValue(digitos2[i]);
  		}
			solucionSuma = 0;
    	for (int i = 0; i < myInt2.length; i++) {
    		solucionSuma += myInt2[i];
  		}
		}
  	
  	if (solucionSuma > 10) {
  		String number3 = String.valueOf(solucionSuma) ;
    	char[] digitos3 = number3.toCharArray();
      int[] myInt3 = new int[digitos3.length];
    	for (int i = 0; i < digitos3.length; i++) {
  			myInt3[i] = Character.getNumericValue(digitos3[i]);
  		}
			solucionSuma = 0;
    	for (int i = 0; i < myInt3.length; i++) {
    		solucionSuma += myInt3[i];
  		}
		}
  	
  	    
  	return solucionSuma;
  }
}