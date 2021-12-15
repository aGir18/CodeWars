public class App4 {

	public static void main(String[] args) {
		int enteroDado = 1234;
		System.out.println(countBits(enteroDado));
		countBits(enteroDado);
	}

	public static int countBits(int n){
		String sol = "";
		char[] caracteres = new char[20];
    sol = Integer.toBinaryString(n);
    caracteres = sol.toCharArray();
    int acumulador = 0;
    for (int i = 0; i < caracteres.length; i++) {
			if (caracteres[i] == '1') {
				acumulador ++;
			}
		}
    
		return acumulador;
	}	
}
