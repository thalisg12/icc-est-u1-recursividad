public class App {
    public static void main(String[] args) throws Exception {
        EjerciciosRecursivo e = new EjerciciosRecursivo();

        int fibonacci = e.fibonacci(5);
        System.out.println("Respuesta " + fibonacci);

        int suma = e.sumaConsecutivos(5);
        System.out.println("Suma de los primeros 5 números: " + suma);

        int potencia = e.getPotencia(fibonacci, suma);
        System.out.println("Potencia de " + fibonacci + " elevado a " + suma + ": " + potencia);

        int numero = 15;
        int dig = e.sumaDigitos(numero);

        System.out.println("La suma de los dígitos de " + numero + " es: " + dig);

    }

}
