package Exercicio02;
class ConexaoSimulada implements AutoCloseable {

public ConexaoSimulada() {
System.out.println("Conexão aberta.");
}
public void executar() {
System.out.println("Executando operação...");
}
@Override
public void close() {
    // close(): chamado automaticamente pelo Java ao final do try-with-resources
System.out.println("Conexão fechada.");
}
}
public class Exemplo03 {
    // try-with-resources: o recurso é fechado automaticamente, sem precisar chamar close()
try (ConexaoSimulada conexao = new ConexaoSimulada()) {
conexao.executar();
}
}
}