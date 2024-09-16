package academy.devdojo.maratonajava.javacore.Xserializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {
    @Serial
    private static final long serialVersionUID = 911278911733960856L;

    private Long id;
    private String nome;
    private transient String password;
    private static final String NOME_ESCOLA = "DevDojo Viradão no Jiraya";
    private transient Turma turma;

    public Aluno(Long id, String nome, String password) {
        System.out.println("Dentro do Construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;
    }

    @Serial
    private void writeObject(ObjectOutputStream oos){
        try{
            oos.defaultWriteObject();
            oos.writeObject(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private void writeObject(ObjectInputStream ois){
        try{
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", NOME_ESCOLA='" + NOME_ESCOLA + '\'' +
                ", turma='" + turma + '\'' +
                '}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
