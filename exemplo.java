import java.text.DecimalFormat;
import java.util.Scanner;

public class exemplo {
    public static void main(String[] args) {
        int numeroFuncionario, horasTrabalhadas;
        double valorHora, salarioFuncionario;
 
        Scanner s = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("0.00");
        numeroFuncionario = s.nextInt();
        horasTrabalhadas = s.nextInt();
        valorHora = s.nextDouble();
        s.close();
        salarioFuncionario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + formatador.format(salarioFuncionario));
        
    }
}
