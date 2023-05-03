import java.util.Scanner;

public class OpMain {
    public void op(){
        Scanner scanner = new Scanner(System.in);
        Niveles niveles = new Niveles();
        int siguiente = 0,x = 0;

        while (x!=2){
            System.out.printf("\n\n");
            siguiente = niveles.nivel1(scanner);
            if(siguiente != 4){
                System.out.println("Subes de nivel");
                siguiente = niveles.nivel2(scanner,siguiente);
                if(siguiente != 4){
                    System.out.println("Subes de nivel");
                    siguiente = niveles.nivel3(scanner,siguiente);
                    if(siguiente != 4){
                        System.out.println("Subes de nivel");
                        siguiente = niveles.nivel4(scanner,siguiente);
                        if (siguiente != 4) {
                            System.out.println("- - G A N A S T E - -");
                        }else System.out.println("\nP E R D I S T E :(");
                    }else System.out.println("\nP E R D I S T E :(");
                } else System.out.println("\nP E R D I S T E :(");
            }else System.out.println("\nP E R D I S T E :(");

            System.out.println("\n¿Quieres seguir jugando?\nSi (1)  No(2)");
            x = scanner.nextInt();
        }
    }
}
