package Ex5;

public class Main {
    public static void main(String[] args) {
        Novo n = new Novo();
        Velho v = new Velho();

        n.setEndereco("Rua vbsks N°2354");
        n.setPreco(200000);
        n.novoPreco(5000);

        System.out.println();

        v.setEndereco("Rua uihauiw N°232");
        v.setPreco(150000);
        v.novoPreco(6000);
    }
}
