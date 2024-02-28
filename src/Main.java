public class Main {
    public static void main(String[] args) {

        // Imprimir en consola los números del 1 al 2,500 incrementando de uno en uno.
        for (int i = 1; i <= 2500; i++) {
            System.out.println(i);
        }

        // Imprimir en consola los números del 5 al 950, incrementando de cinco en cinco.
        for (int i = 5; i <= 950; i += 5) {
            System.out.println(i);
        }

        // Imprimir en consola los números del 1 al 100, incrementando de tres en tres.
        for (int i = 1; i <= 100; i += 3) {
            System.out.println(i);
        }

        // Imprimir en consola en orden descendente los valores numéricos partiendo desde 800, reduciendo de dos en dos.
        for (int i = 800; i >= 0; i -= 2) {
            System.out.println(i);
        }

        // Imprimir en consola los valores enteros del 1 al 300. Por cada iteración verificar si el valor actual es igual a 150, si es así, imprimir "Mitad del proceso".
        for (int i = 1; i <= 300; i++) {
            System.out.println(i);
            if (i == 150) {
                System.out.println("Mitad del proceso");
            }
        }

        // Imprimir en consola los valores enteros del 1 al 500. Por cada iteración verificar si el valor actual es divisible entre 2. Si es así, imprimir el valor actual, de lo contrario imprimir "No aplica este valor".
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.println("No aplica este valor");
            }
        }
    }
}
