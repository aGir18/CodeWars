public class App3 {

	public static void main(String[] args) {
		String palabra = "1234";
		String palabra2 = "587958";
		String palabra3 = "falss";
		String palabra4 = "";
		String palabra5 = "1234567";
		String palabra6 = "abcd";
		
		System.out.println(validatePin(palabra));
		System.out.println(validatePin(palabra2));
		System.out.println(validatePin(palabra3));
		System.out.println(validatePin(palabra4));
		System.out.println(validatePin(palabra5));
		System.out.println(validatePin(palabra6));
	}
// Esta es copiada
	public static boolean validatePin(String pin) {
		return pin != "" && pin.matches("[0-9]+") && (pin.length() == 4 || pin.length() == 6) ? true : false;
	}
// Esta es la mía que no funcionaba del todo, daba problema con palabra6
	public static boolean validatePin2(String pin) {
		boolean solucion = false;
		char[] primera = new char[6];
		int[] caracteresEnteros = new int[6];

		if (pin.length() <= 6) {
			for (int i = 0; i < pin.length(); i++) {
				primera[i] = pin.charAt(i);
			}
			for (int i = 0; i < pin.length(); i++) {
				if ((Integer.valueOf(primera[i]) <= 9)& ((Integer.valueOf(primera[i]) >= 0)))
				caracteresEnteros[i] = Integer.valueOf(primera[i]);
			}

			if ((pin.length() == 4 || pin.length() == 6) && caracteresEnteros != null) {
				solucion = true;
			}
		} else {
			solucion = false;
		}

		return solucion;
	}	
}