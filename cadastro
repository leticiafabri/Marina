import java.util.Scanner;
public class Cadastro {
    private String nome;
    private String email;
    private String cpf;
    private String senha;

    public Cadastro(String nome, String email, String cpf, String senha){
        setNome(nome);
        setEmail(email);
        setCpf(cpf);
        setSenha(senha);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha){this.senha=senha;}

    @Override
    public String toString() {
        return  "Nome: " + nome + "\n" +
                "Email: " + email + "\n"+
                "CPF: " + cpf + "\n" +
                "Senha: " + senha + "\n";
    }
}

