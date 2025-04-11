public class EjerciciosRecursivo {
    public int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int sumaConsecutivos(int n) {
        if (n == 1) {
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n - 1);
        int resultado = n + resultadoParcial;
        return resultado;

    }

    /*
     * Escribe una funcion recursiva que calcule la potencia de un numero base
     * elevado a un exponente entero.
     * Por ejemplo, si la base es 2 y exponente es 3, la funcion debe devolver 8.
     */
    public int getPotencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        }
        return base * getPotencia(base, exponente - 1);
    }
    /*
     * Si el numero es menor que 10, lo cual significa que solo tiene un digito, se
     * devuelve el numero mismo.
     * En caso contrario, se extrae el ultimo digito utilizando el operador modulo %
     * y se calcula los digitos menos el ultimo utilizando la division entera /10.
     * Luego, se realiza una llamada recursiva a sumaDigitos con el resto y se suma
     * el ultimo digito.
     */

    public int sumaDigitos(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + sumaDigitos(n / 10);
    }
}
