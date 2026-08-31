// Codigo encapsulado e profissional
public class Principal {
    public static void main(String[] args) {
        // 1. Instanciando o aluno
        Aluno aluno1 = new Aluno();

        // 2. Atribuindo valores de forma segura (com os SETTERS)
        aluno1.setNome("Maria Silva");
        aluno1.setEnderecoResidencial("Rua das Flores, 123");
        aluno1.setTelefoneContato("(91) 98888-7777");
        aluno1.setEmail("maria.silva@email.com");
        aluno1.setMatricula("202601001");

        // 3. Exibindo os valores de forma segura (com os GETTERS)
        System.out.println("--- Dados do Aluno Cadastrado ---");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Endereço: " + aluno1.getEnderecoResidencial());
        System.out.println("Telefone: " + aluno1.getTelefoneContato());
        System.out.println("E-mail: " + aluno1.getEmail());
        System.out.println("Matrícula: " + aluno1.getMatricula());
    }
}
