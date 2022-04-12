package farmacia;

import java.util.Scanner;

public class CadatroParceiros {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);//instancia criada a para Scanner

        Funcionario func = new Funcionario(); //instancia criada a partir da classe Conta
        Clientes cli = new Clientes(); //instancia criada a partir da classe ContaPoupanca
        Fornecedor forn  = new Fornecedor(); //instancia criada a partir da classe ContaCorrente

        int op = 10;
        while  (op != 0) { // para sair do programa basta digitar 0 (zero)
            System.out.println("\n<1> Cadastrar Cliente \n<2> Cadastrar Funcionário\n<3> Cadastrar Fornecedor\n<0> Listar o parceiro cadastrado");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("\nCodigo do cliente: ");
                cli.setCod(sc.nextInt());
                while (cli.verificarCodigo(cli.getCod()) == 0)
                    cli.setCod(sc.nextInt());
                System.out.println("\nNome:");
                cli.setNome(sc.next());
                System.out.println("\nTelefone: ");
                cli.setTell(sc.next());
                while (cli.verificarTell(cli.getTell()) == 0)
                    cli.setTell(sc.next());
                System.out.println("\nEmail: ");
                cli.setEmail(sc.next());
                System.out.println("\nRG: ");
                cli.setRg(sc.next());
                System.out.println("\nCPF :");
                cli.setCpf(sc.next());
                while (!Clientes.validaCpf(cli.getCpf()))
                    cli.setCpf(sc.next());

            }else if (op == 2) {
                System.out.println("\nCodigo do funcionario: ");
                func.setCod(sc.nextInt());
                while (func.verificarCodigo(func.getCod()) == 0)
                    func.setCod(sc.nextInt());
                System.out.println("\nNome:");
                func.setNome(sc.next());
                System.out.println("\nTelefone: ");
                func.setTell(sc.next());
                while (func.verificarTell(func.getTell()) == 0)
                    func.setTell(sc.next());
                System.out.println("\nEmail: ");
                func.setEmail(sc.next());
                System.out.println("\n Numeração da sua carteira de trabalho: ");
                func.setNumCTPS(sc.next());
                while (func.verificarCTPS(func.getNumCTPS()) == 0)
                    func.setNumCTPS(sc.next());

            }else if (op == 3) {
                System.out.println("\nCodigo do forncedor: ");
                func.setCod(sc.nextInt());
                while (func.verificarCodigo(func.getCod()) == 0)
                    func.setCod(sc.nextInt());
                System.out.println("\nNome:");
                forn.setNome(sc.next());
                System.out.println("\nTelefone: ");
                forn.setTell(sc.next());
                while (forn.verificarTell(forn.getTell()) == 0)
                    forn.setTell(sc.next());
                System.out.println("\nEmail: ");
                forn.setEmail(sc.next());
                System.out.println("\nDigite seu nome social");
                forn.setNomeSocial(sc.next());
                System.out.println("\n Número da IE: ");
                forn.setNumIe(sc.next());
                while (forn.verificarIe(forn.getNumIe()) == 0)
                    cli.setTell(sc.next());
                System.out.println("\n CNPJ: ");
                forn.setCnpj(sc.next());
                while (!Fornecedor.validaCnpj(forn.getCnpj())) {
                    forn.setCnpj(sc.next());
                }
            }
        }

        sc.close();

        System.out.println(cli.toString());
        System.out.println(func.toString());
        System.out.println(forn.toString());
    }
}
