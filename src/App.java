import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner area= new Scanner(System.in);


        System.out.print("Valor do lado do quadrado?");
        Double valor= area.nextDouble();

        Double resultado =  Math.pow(valor,2);
        System.out.println("O valor da área é:"+resultado);

        Double dobro= resultado *2;
        System.out.print("O dobro da área:"+dobro);




      


    }
}