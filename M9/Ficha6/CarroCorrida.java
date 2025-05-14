public class CarroCorrida {
    private int numeroCarro;
    private String piloto;
    private String equipa;
    private double velocidadeMaxima;
    private double velocidadeAtual;
    private boolean ligado;
 
    // Construtor com parâmetros principais
    public CarroCorrida(int numeroCarro, String piloto, String equipa, double velocidadeMaxima) {
        this.numeroCarro = numeroCarro;
        this.piloto = piloto;
        this.equipa = equipa;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = 0.0; // Inicialmente parado
        this.ligado = false; // Inicialmente desligado
    }
 
    // Métodos setters e getters necessários
    
    // Método para imprimir os dados do carro de corrida
    public void imprimeCarro() {
        System.out.println("Número do Carro: " + numeroCarro);
        System.out.println("Piloto: " + piloto);
        System.out.println("Equipa: " + equipa);
        System.out.println("Velocidade Máxima: " + velocidadeMaxima);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println("Ligado: " + (ligado ? "Sim" : "Não"));
    }
 
    // Método para acelerar o carro
    public void acelerar(double incremento) {
        if (ligado && (velocidadeAtual + incremento <= velocidadeMaxima)) {
            velocidadeAtual += incremento;
            if (velocidadeAtual > velocidadeMaxima)
                velocidadeAtual = velocidadeMaxima; 
            } else if (!ligado){
                System.out.println("O carro está desligado!");
            } else{
                System.out.println ("Atingiu a velocidade máxima!");
            }  
        
    }
 
    // Método para travar o carro
    public void travar(double decremento) {
        if (velocidadeAtual - decremento >= 0) 
            velocidadeAtual -= decremento; 
        
       if (velocidadeAtual < 0)
            velocidadeAtual=0;
 
       if(velocidadeAtual == 0)
           ligado=false;
 
        
    }
 
    // Método para desligar o carro
    public void desligar() {
       if(velocidadeAtual == 0 && ligado){
           ligado=false;}
       else{
           if(ligado)
               System.out.println ("O carro ainda está em movimento!");
           else{
               ligado=false;}
       }    
       
        
    }
 
    // Método para ligar o carro
    public void ligar() {
       if(!ligado){
           ligado=true;}
       else{
           ligado=true;}  
        
        
    }
 }