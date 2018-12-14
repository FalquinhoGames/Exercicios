public class Pessoa {
    private String nome;
    private String cpf;
    private int rg;

    public Pessoa(String nome, String cpf, int rg) throws HugeNameException, InvalidCpfFormatException {
        setNome(nome);
        setCpf(cpf);
        this.rg = rg;
    }

    public void setNome(String nome) throws HugeNameException {
        this.nome = nome;
        if(nome.length() >= 50 || nome.length() <= 1) {
            throw new HugeNameException();
        }else{
            this.nome = nome;
        }
    }

    public void setCpf(String cpf) throws InvalidCpfFormatException {
        this.cpf = cpf;
        if(cpf.length() != 14 || cpf.charAt(3) != '.' || cpf.charAt(7) != '.' || cpf.charAt(11) != '-'){
            throw new InvalidCpfFormatException();
        }

        for (int i = 0; i < cpf.length(); i++){
            try {
                Integer.parseInt(cpf.charAt(i) + "");
            } catch (NumberFormatException e){
                if(i != 3 && i != 7 && i != 11){
                    throw new InvalidCpfFormatException();
                }
            }
        }
    }
}