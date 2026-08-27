public class Principal {
    public static void main(String[] args) {
        // Instanciando a classe Aluno
        Aluno aluno1 = new Aluno();

        // Atribuindo valores aos atributos
        aluno1.nome = "Maria Silva";
        aluno1.enderecoResidencial = "Rua das Flores, 123";
        aluno1.telefoneContato = "(91) 98888-7777";
        aluno1.email = "maria.silva@email.com";
        aluno1.matricula = "202601001";

        // Exibindo os valores para testar o código
        System.out.println("--- Dados do Aluno Cadastrado ---");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Endereço: " + aluno1.enderecoResidencial);
        System.out.println("Telefone: " + aluno1.telefoneContato);
        System.out.println("E-mail: " + aluno1.email);
        System.out.println("Matrícula: " + aluno1.matricula);
    }
}
