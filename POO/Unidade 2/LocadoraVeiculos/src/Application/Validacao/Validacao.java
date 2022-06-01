package Application.Validacao;

import java.util.Scanner;

public class Validacao {

    public static int validaInteiro(String texto){
        int inteiro;
        while(true){
            try{
                System.out.print(texto);
                inteiro = new Scanner(System.in).nextInt();
                break;
            }
            catch (Exception exception){
                System.out.println("Comando inválido. Tente novamente!");
            }
        }
        return inteiro;
    }

    public static double validaDouble(String texto){
        double decimal;
        while(true){
            try{
                System.out.print(texto);
                decimal = new Scanner(System.in).nextDouble();
                break;
            }
            catch (Exception exception){
                System.out.println("Comando inválido. Tente novamente!");
            }
        }
        return decimal;
    }

    public static String validaString(String texto){
        String txt;
        while(true){
            try{
                System.out.print(texto);
                txt = new Scanner(System.in).nextLine();
                break;
            }
            catch (Exception exception){
                System.out.println("Comando inválido. Tente novamente!");
            }
        }
        return txt;
    }

    public static long validaLong(String texto){
        long inteiro;
        while(true){
            try{
                System.out.print(texto);
                inteiro = new Scanner(System.in).nextLong();
                break;
            }
            catch (Exception exception){
                System.out.println("Comando inválido. Tente novamente!");
            }
        }
        return inteiro;
    }
}
