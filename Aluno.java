public class Aluno {
    
    // 1. Atributos protegidos (ENCAPSULAMENTO)
    private String nome;
    private String enderecoResidencial;
    private String telefoneContato;
    private String email;
    private String matricula;

    // 2. Construtor Vazio (permite criar 'new Aluno()' e usar Setters depois)
    public Aluno() {
    }

    // 3. Construtor Completo (preenche tudo usando o 'this')
    public Aluno(String nome, String enderecoResidencial, String telefoneContato, String email, String matricula) {
        this.nome = nome;
        this.enderecoResidencial = enderecoResidencial;
        this.telefoneContato = telefoneContato;
        this.email = email;
        this.matricula = matricula;
    }

    // 4. Métodos GETTERS e SETTERS

    // Nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Endereço Residencial
    public String getEnderecoResidencial() {
        return this.enderecoResidencial;
    }
    public void setEnderecoResidencial(String enderecoResidencial) {
        this.enderecoResidencial = enderecoResidencial;
    }

    // Telefone Contato
    public String getTelefoneContato() {
        return this.telefoneContato;
    }
    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    // E-mail
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Matrícula
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
