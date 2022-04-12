package farmacia;

public class Funcionario extends Parceiro {

    private String numCTPS;

    public Funcionario(String numCTPS) {
        this.numCTPS = numCTPS;
    }

    public Funcionario(int cod, String nome, String tell, double pr, String numCTPS) {
        super(cod, nome, tell, pr);
        this.numCTPS = numCTPS;
    }

    public Funcionario(Parceiro p, String numCTPS) {
        super(p);
        this.numCTPS = numCTPS;
    }

    public Funcionario(int cod, String nome, String tell, String email, String numCTPS) {
        super(cod, nome, tell, email);
        this.numCTPS = numCTPS;
    }

    public Funcionario() {

    }

    public String getNumCTPS() {
        return numCTPS;
    }

    public void setNumCTPS(String numCTPS) {
        this.numCTPS = numCTPS;
    }


    public int verificarCTPS(String numCTPS){
        if (numCTPS.length() <= 1 || numCTPS.length() > 5000){
            System.out.print("\nDigite apenas códigos maiores que 0 e menores que 5000.");
            System.out.print("\nInforme seu CTPS (Carteira  de  Trabalho  e  Previdência  Social) novamente: ");
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "\nFuncionario:" +
                "\nCodigo = " + getCod() +
                "\nNome = " + getNome() +
                "\nTelefone = " + getTell() +
                "\nE-mail = " + getEmail() +
                "\nNumero CTPS = " + numCTPS;
    }
}
