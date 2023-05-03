import java.util.Random;
import java.util.Scanner;

public class Niveles {
    int T = 5;/*Esta variable controla cuantos puntos aumentar si el jugador adivina la palabra, el maximo de puntos debe
    ser de 10,  */

    public int nivel1 (Scanner scanner){
        String buscar;
        char [] caracteres = new char[26];
        int puntos = 0;
        int perdiendo = 0;

        for (int i = 0; i < 26; i++) {
            caracteres [i] = (char) ('a'+i);
        }

        System.out.println("\t\t- - N I V E L  1 - -\n");

        while (perdiendo < 3 && puntos != 10 ){
            Random random = new Random();
            int correcto = random.nextInt(26) + 1;////////////////////////////26

            String si = String.valueOf(caracteres[correcto]);

            System.out.println("\n\t- - Adivina el caracter - -");
            System.out.println("Ingresa un caracter: ");
            buscar = scanner.next();

            if(buscar.equals(si)){
                System.out.println("Correcto, la letra era " + caracteres[correcto]);
                puntos = puntos + T;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }else {
                System.out.printf("Perdiste, la letra era " + caracteres[correcto]);
                perdiendo ++;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }
        }

        if(perdiendo == 3) return 4;
        else return perdiendo;
    }



    public int nivel2(Scanner scanner,int p){
        int buscar;
        int puntos = 10;
        int perdiendo = p;

        System.out.println("\n\n\t\t- - N I V E L  2 - -\n");
        System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);

        while (perdiendo < 3 && puntos != 20 ){

            Random random = new Random();
            int correcto = random.nextInt(1000) + 1;//////////////////////1000

            System.out.println("\n\t- - Adivina el numero - -");
            System.out.println("Ingresa un numero: ");
            buscar = scanner.nextInt();

            if(buscar == correcto){
                System.out.println("Correcto, el numero era " + correcto);
                puntos = puntos + T;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }else {
                System.out.printf("Perdiste, el numero era " + correcto);
                perdiendo ++;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }
        }
        if(perdiendo == 3) return 4;
        else return perdiendo;
    }


    public int nivel3(Scanner scanner,int p){
        int buscar;
        int puntos = 20;
        int perdiendo = p;
        int par = 1;
        System.out.println("\n\n\t\t- - N I V E L  3 - -");
        System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);

        while (perdiendo < 3 && puntos != 30 ){
            int bandera = 0;
            while (bandera != 1){
                Random random = new Random();
                par = random.nextInt(1000) + 1;//////////////////////1000
                if(par%2==0) bandera = 1;
                else bandera = 0;
            }

            System.out.println("\n\t- - Adivina el numero par - -");
            System.out.println("Ingresa un numero par: ");
            buscar = scanner.nextInt();

            if(buscar == par){
                System.out.println("Correcto, el numero par era " + par);
                puntos = puntos + T;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }else {
                System.out.printf("Perdiste, el numero par era " + par);
                perdiendo ++;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }
        }
        if(perdiendo == 3) return 4;
        else return perdiendo;
    }


    public int nivel4(Scanner scanner,int p){
        int buscar;
        int puntos = 30;
        int perdiendo = p;
        int par = 1;
        System.out.println("\n\n\t\t- - N I V E L  4 - -");
        System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);

        while (perdiendo < 3 && puntos != 40 ){
            int bandera = 0;
            while (bandera != 1){
                Random random = new Random();
                par = random.nextInt(1000) + 1;//////////////////////1000
                if(par%2!=0) bandera = 1;
                else bandera = 0;
            }

            System.out.println("\n\t- - Adivina el numero impar - -");
            System.out.println("Ingresa un numero impar: ");
            buscar = scanner.nextInt();

            if(buscar == par){
                System.out.println("Correcto, el numero impar era " + par);
                puntos = puntos + T;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }else {
                System.out.printf("Perdiste, el numero impar era " + par);
                perdiendo ++;
                System.out.println("\nPuntos: " + puntos + " Perdiendo: " + perdiendo);
            }
        }
        if(perdiendo == 3) return 4;
        else return perdiendo;
    }
}
