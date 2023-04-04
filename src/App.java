import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Double valorHora, horasTrabalhadas, valorMes;
      
        System.out.println("Quanto vc ganha ?");
        valorHora = entrada.nextDouble();


        System.out.println("Numero de horas trabalhadas por dia ?");
        horasTrabalhadas = entrada.nextDouble();

        valorMes = (valorHora * horasTrabalhadas * 24);
        System.out.println("Seu salario mensal é " + valorMes);

        entrada.close();   
    }
}