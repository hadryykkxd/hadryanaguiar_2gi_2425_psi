import java.util.Scanner;

public class CarroCorridaTeste {

public static void main(String[] args) {

Scanner scanner= new Scanner(System.in);

System.out.print ("Digite o número do carro:");
int numeroCarro= scanner.nextInt();

System.out.print ("Digite o nome do piloto:");
String piloto= scanner.nextLine();

System.out.print ("Digite o nome da equipa:");
String equipa= scanner.nextLine();

System.out.print ("Digite a velocidade máxima:");
double velMax= scanner.nextDouble();

CarroCorrida carro= new CarroCorrida(numeroCarro,piloto,equipa,velMax);

carro.ligar();
carro.acelerar(50);
carro.travar(20);
carro.desligar();
carro.imprimeCarro();

scanner.close();}}
