package Exercicio02;
// exceção customizada: criando uma classe de exceção própria
class SaldoInsuficienteException extends RuntimeException {
        // extends RuntimeException => exceção unchecked (compilador não obriga tratar)
public SaldoInsuficienteException(String mensagem) {
super(mensagem);
}

}
class ContaBancaria {
protected double saldo;
public void depositar(double valor) {
saldo += valor;
}
public void sacar(double valor) {
if (valor > saldo) {
    // throw: lançando a exceção customizada
throw new SaldoInsuficienteException("Saldo insuficiente");
}
saldo -= valor;
}
}
public class Exemplo02 {
public static void main(String[] args) {
ContaBancaria conta = new ContaBancaria();
conta.depositar(100.00);
try {
conta.sacar(500.00);
 // try/catch: capturando a exceção customizada
} catch (SaldoInsuficienteException excecao) {
System.out.println("Erro: " + excecao.getMessage());
}
System.out.println("Saldo final: " + conta.saldo);
}
}