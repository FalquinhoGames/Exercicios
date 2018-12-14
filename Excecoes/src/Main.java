import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidCpfFormatException, HugeNameException {
        Scanner entrada = new Scanner(System.in);
        boolean teste = false;
        String cpf;

        do{
            try{
                System.out.println("Digite seu cpf");
                cpf = entrada.nextLine();
                new Pessoa("Filipe", cpf, 9485759);
                teste = true;
            } catch (InvalidCpfFormatException e){
                System.out.println("CPF Invalido");
            } catch (HugeNameException e){
                System.out.println("Nome invalido");
            }
        }  while(teste == false);
        System.out.println("CPF valido");
    }
}
