package farmacia;

public class Clientes extends Parceiro {

    private String rg;
    private String cpf;

    public Clientes(String rg, String cpf) {
        this.rg = rg;
        this.cpf = cpf;
    }

    public Clientes(int cod, String nome, String tell, double pr, String rg, String cpf) {
        super(cod, nome, tell, pr);
        this.rg = rg;
        this.cpf = cpf;
    }

    public Clientes(Parceiro p, String rg, String cpf) {
        super(p);
        this.rg = rg;
        this.cpf = cpf;
    }

    public Clientes(int cod, String nome, String tell, String email, String rg, String cpf) {
        super(cod, nome, tell, email);
        this.rg = rg;
        this.cpf = cpf;
    }

    public Clientes() {

    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public static boolean validaCpf(String cpf) {
        // considera-se erro CPF's formados por uma sequencia de numeros iguais
        if (cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222")
                || cpf.equals("33333333333") || cpf.equals("44444444444") || cpf.equals("55555555555")
                || cpf.equals("66666666666") || cpf.equals("77777777777") || cpf.equals("88888888888")
                || cpf.equals("99999999999") || (cpf.length() != 11)) {
            System.out.print("CPF invalido. Digite código novamente:  ");
            return false;
        }
        return true;
    }

        @Override
    public String toString() {
        return "Clientes :" +
                "\nCodigo = " + getCod() +
                "\nNome = " + getNome() +
                "\nTelefone = " + getTell() +
                "\nE-mail = " + getEmail() +
                "\nRG = " + rg +
                "\nCPF = " + cpf;
    }
}
