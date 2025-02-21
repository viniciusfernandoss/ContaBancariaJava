import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: conhecer e importar a classe Scanner
        //Exibit as mensagens para o nosso usuário
        //Obter pela classe Scanner os valores digitados no terminaal
        //Exibir a mensagem final

        Scanner leia = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Por favor, insira o numero: ");
        numero = leia.nextInt();
        System.out.print("Por favor, insira o agencia: ");
        agencia = leia.next();
        System.out.print("Por favor, insira o nome: ");
        nomeCliente = leia.next();
        System.out.print("Por favor, insira o saldo: ");
        saldo = leia.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque");
    }
}
