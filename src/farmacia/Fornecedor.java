package farmacia;

public class Fornecedor extends Parceiro {

    private String nomeSocial;
    private String numIe;
    private String  cnpj;

    public Fornecedor(String nomeSocial, String numIe, String cnpj) {
        this.nomeSocial = nomeSocial;
        this.numIe = numIe;
        this.cnpj = cnpj;
    }

    public Fornecedor(int cod, String nome, String tell, double pr, String nomeSocial, String numIe, String cnpj) {
        super(cod, nome, tell, pr);
        this.nomeSocial = nomeSocial;
        this.numIe = numIe;
        this.cnpj = cnpj;
    }

    public Fornecedor(Parceiro p, String nomeSocial, String numIe, String cnpj) {
        super(p);
        this.nomeSocial = nomeSocial;
        this.numIe = numIe;
        this.cnpj = cnpj;
    }

    public Fornecedor() {
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getNumIe() {
        return numIe;
    }

    public void setNumIe(String numIe) {
        this.numIe = numIe;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public static boolean validaCnpj(String cnpj) {
        // considera-se erro CNPJ's formados por uma sequencia de numeros iguais
        if (cnpj.equals("00000000000000") || cnpj.equals("11111111111111") ||
                cnpj.equals("22222222222222") || cnpj.equals("33333333333333") ||
                cnpj.equals("44444444444444") || cnpj.equals("55555555555555") ||
                cnpj.equals("66666666666666") || cnpj.equals("77777777777777") ||
                cnpj.equals("88888888888888") || cnpj.equals("99999999999999") ||
                (cnpj.length() != 14)) {
            System.out.print("CNPJ invalido. Digite código novamente:  ");
            return (false);
        }
        return (true);
    }
    public int verificarIe(String numIe){
        if (numIe.length() < 1 || numIe.length() > 15){
            System.out.print("Número de IE invalido. Digite novamente:  ");
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "\nFornecedor: " +
                "\nCodigo = " + getCod() +
                "\nNome = " + getNome() +
                "\nTelefone = " + getTell() +
                "\nE-mail = " + getEmail() +
                "\nNome Social = " + nomeSocial +
                "\nNumero IE = " + numIe +
                "\nCNPJ = " + cnpj;
    }
}
