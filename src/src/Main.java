import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        char[][] matriz = new char[10][10];

        Scanner sc = new Scanner(System.in);

        Random rd = new Random();

        final char YODA = 'Y';
        final char FINAL = 'F';
        final char POCIONES = 'P';

        String inputUser;

        int vidas = 10;
        int pocionesDisponible = 5;
        int randomX;
        int randomY;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = '*';
            }
        }

        int posicionXYoda = 0;
        int posicionYYoda = 0;
        matriz[posicionXYoda][posicionYYoda] = YODA;
        matriz[matriz.length - 1][matriz.length - 1] = FINAL;
        do {
            randomX = rd.nextInt(9);
            randomY = rd.nextInt(9);

            if (matriz[randomX][randomY] == '*') {
                matriz[randomX][randomY] = POCIONES;
                pocionesDisponible--;
            }
        } while (pocionesDisponible != 0);

        matriz[rd.nextInt(matriz.length - 1)][rd.nextInt(matriz.length - 1)] = 'M';

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }

        char desplazamiento = sc.next().charAt(0);

        if (desplazamiento == 'd') {
            matriz[posicionXYoda][posicionYYoda] = '*';
            posicionYYoda++;
        }

        matriz[posicionXYoda][posicionYYoda] = YODA;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println(" ");
        }
    }
}