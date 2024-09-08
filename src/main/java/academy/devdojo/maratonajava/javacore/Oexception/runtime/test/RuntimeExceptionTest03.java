package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        abreConexao2();
        System.out.println("Finalizou");
    }

    private static String abreConexao() {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException("erro");
//            System.out.println("Escrevendo arquivo");
//            return "conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

    private static void abreConexao2() {
        try{
            System.out.println("Abrindo arvuico");
            System.out.println("Escrevendo arquivo");
            throw new RuntimeException("erro2");
        }finally {
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
