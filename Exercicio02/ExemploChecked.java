package Exercicio02;
import java.io.FileReader;
import java.io.FileNotFoundException;
public class ExemploChecked {
public static void main(String[] args) {
try {
// exceção checked: FileNotFoundException obriga tratamento (try/catch) ou throws
FileReader arquivo = new FileReader("dados.txt");
} catch (FileNotFoundException e) {
// try/catch: tratando a exceção checked
System.out.println("Arquivo não encontrado.");
}
}
}