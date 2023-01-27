package operaciones;
public class Operaciones{
	/**
	 * 
	 * @param valor1 Recoge el primer numero para hacer una operacion
	 * @param valor2 Recoge el segundo numero para hacer una operacion
	 * @return el resultado de la operacion entre los 2 numeros
	 * @throws ArithmeticException Si hay un error este devuelve un error Aritmetico
	 * 
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    
    
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    
    public int dividir (int valor1, int valor2)throws ArithmeticException{ 
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    
    public int resto (int valor1, int valor2){
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}