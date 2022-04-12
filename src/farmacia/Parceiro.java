package farmacia;

public abstract class Parceiro {

    private int cod;
    private String nome;
    private String tell;
    private String email;



    public Parceiro(){

        /* construtor sem parâmetros da classe Produtos */
        cod = 0;
        nome = "AAA";
        tell = " ";
        email = "BBB";
    }

    public Parceiro(int cod, String nome, String tell, double pr){
        /* construtor com parâmetros da classe Produtos */
        cod = cod;
        nome = nome;
        tell = tell;
        email = email;
    }

    public Parceiro(Parceiro p){
	/* construtor cópia da classe Produtos,
	tambem chamado de Copy constructor */
        cod = p.cod;
        nome = p.nome;
        tell = p.tell;
        email = p.email;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Parceiro(int cod, String nome, String tell, String email) {
        this.cod = cod;
        this.nome = nome;
        this.tell = tell;
        this.email = email;
    }

    public void imprimirParceiro() {
        System.out.println("");
        System.out.println("cod " + this.getCod());
        System.out.println("nome " + this.getNome());
        System.out.println("tell" + this.getTell());
        System.out.println("email: " + this.getEmail());
    }

    public int verificarCodigo(int cod){
        if (cod <= 0||cod > 1000){
            System.out.print("Digite apenas códigos maiores que 0 e menores que 1000. Digite código novamente:  ");
            return 0;
        }
        return 1;
    }
    public int verificarTell(String tell){
        if (tell.length() < 13 || tell.length() > 13){
            System.out.print("Número invalido. Digite código novamente:  ");
            return 0;
        }
        return 1;
    }


    @Override
    public String toString() {
        return "Parceiro{" +
                "cod =" + cod +
                ", nome ='" + nome + '\'' +
                ", tell =" + tell +
                ", email ='" + email + '\'' +
                '}';
    }
}
