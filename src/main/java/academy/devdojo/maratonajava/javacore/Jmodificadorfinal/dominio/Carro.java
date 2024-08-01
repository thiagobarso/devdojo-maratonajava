package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio;

public class Carro {
    private String nome;
//    public static final double VELOCIDADE_LIMITE = 250;
//    a) public static final double VELOCIDADE_LIMITE;

    public final double VELOCIDADE_LIMITE;

//     a)
//     static {
//         VELOCIDADE_LIMITE = 250;
//     }

//    b)
//    {
//        VELOCIDADE_LIMITE = 250;
//    }


    public Carro() {
        VELOCIDADE_LIMITE = 250;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
