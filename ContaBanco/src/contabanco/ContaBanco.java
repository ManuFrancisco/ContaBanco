package contabanco;

import java.util.Scanner;

/**
 *
 * @author Manuel Francisco
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	String clienteNome, agency;
	Scanner keyB = new Scanner(System.in);
	ContaTerminal conta = new ContaTerminal();

	System.out.println("Por favor, digite o numero da Agência:");
	int num = keyB.nextInt();
	conta.setNumber(num);

	System.out.println("Por favor, digite a Agência:");
	agency = keyB.next();
	conta.setAgency(agency);

	System.out.println("Por favor, digite o nome do cliente:");
	clienteNome = keyB.next();
	conta.setCostumerName(clienteNome);

	System.out.println("Por favor, insira o valor do saldo:");
	double saldo = keyB.nextDouble();
	conta.setSaldo(saldo);

	System.out.println("Olá " + conta.getCostumerName() + " obrigado por criar"
		+ " uma conta em nosso banco, sua agência é " + conta.getAgency()
		+ " conta " + conta.getNumber() + "\n e o seu saldo " + conta.getSaldo() + " já está disponível para saque!");
    }

}
