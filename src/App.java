public class App {
    public static void main(String[] args) throws Exception {
        EjerciciosRecursivo e = new EjerciciosRecursivo();

        int fibonacci = e.fibonacci(5);
        System.out.println("Respuesta " + fibonacci);

        int suma = e.sumaConsecutivos(5);
        System.out.println("Suma de los primeros 5 números: " + suma);

    }

}
