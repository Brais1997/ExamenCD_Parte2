package examenfinalparte2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String arg[]) {
        /**
         * En esta clase main simplemente declaramos variables , y dejamos el
         * for con algunos cambios para asi mostrar los numeros primos. Entre
         * ellos los cambios son: Usamos el metodo ContarDigitos como contador y
         * el calcularNumPrimo para si es true que salga el numero primo
         */
        boolean numPrimo = false;
        int digito = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un numero"));
        int numeroDigito = 0;
        if (digito <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int i = 1; i <= 99999; i++) {

            int contador = ContarDigitos(i);
            numeroDigito = contador;
            numPrimo = CalcularNumPrimo(numeroDigito, digito, i, numPrimo);
            if (numPrimo == true) {
                System.out.println(i);
            }
        }
    }

    /**
     * Este metodo lo que hace es calcular numeros primos
     *
     * @param numeroDigito Este parametro es el numero de digitos
     * @param digito Este es el digito
     * @param i Este simplemente guarda un numero para acabar viendo numeros
     * primos
     * @param numPrimo Valor de boolean
     * @return
     */
    private static boolean CalcularNumPrimo(int numeroDigito, int digito, int i, boolean numPrimo) {
        if (numeroDigito == digito) {
            if (i < 4) {
                numPrimo = true;
            } else {
                if (i % 2 == 0) {
                    numPrimo = false;
                } else {
                    int contador = 0;
                    int i1 = 1;
                    int limite = (i - 1) / 2;
                    if (limite % 2 == 0) {
                        limite--;
                    }

                    while (i1 <= limite) {
                        if (i % i1 == 0) {
                            contador++;
                        }
                        i1 += 2;
                        if (contador == 2) {
                            i1 = limite + 1;
                        }
                    }

                    if (contador == 1) {
                        numPrimo = true;
                    }
                }
            }

            if (numPrimo == true) {
                System.out.println(i);
            }
        }
        return numPrimo;
    }

    /**
     * Aqui lo que hacemos es un metodo que sirve para contar los digitos
     *
     * @param i
     * @return Retorna el numero de digitos que lo sabemos gracias a un contador
     */
    private static int ContarDigitos(int i) {
        int auxiliar = i;
        int contador = 0;
        while (auxiliar != 0) {
            auxiliar= auxiliar / 10;
            contador++;
        }
        return contador;
    }
}
