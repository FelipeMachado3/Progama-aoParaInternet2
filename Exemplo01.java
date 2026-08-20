class ContaBancaria {
protected double saldo;
public void depositar(double valor) {
saldo += valor;
}
public void sacar(double valor) {
if (valor > saldo) {
    // throw: lançando uma exceção (unchecked) porque o saldo é insuficiente
throw new IllegalArgumentException("Saldo insuficiente");
}
saldo -= valor;

}
}
public class Exemplo01 {
public static void main(String[] args) {
ContaBancaria conta = new ContaBancaria();
conta.depositar(100.00);
try {
// try/catch: capturando a exceção lançada em sacar()
conta.sacar(500.00);
} catch (IllegalArgumentException excecao) {
// exceção unchecked: o compilador não obriga tratar isso
System.out.println("Erro: " + excecao.getMessage());
}
System.out.println("Saldo final: " + conta.saldo);
}
}