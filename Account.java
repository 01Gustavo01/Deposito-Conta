//Classe Account que contém uma variável de instância name
//e métodos para configurar e obter seu valor

public class Account 
{
    private String name;//variável de instância
    private double balance;//variável de instância
    
    //Construtor inicializa name com nome do parâmetro
    public Account(String name, double balance) //Nome do construtor é o nome da classe
    {
        this.name = name ;//armazena  o nome
        
        //valida que o balance é maior que 0.0; se não for
        //a variável de instância balance mantém seu valor inicial padrão de 0.0
        if (balance>0.0)//se o saldo for válido
            this.balance = balance;//o atribui à variável de instância balance
    }
    
    //método que deposita (adiciona) apenas uma quantia válida no saldo
    public void deposit(double depositAmount)
    {
        if(depositAmount>0.0)//se depositAmount for válido
            balance = balance + depositAmount;//o adiciona ao saldo
    }
   
    public double getBalance()
    {
        return balance;
    }
    
    //método que define nome
   public void setName(String name)
   {
       this.name = name;
   }
   
     //método para recuperar o nome do objeto
    public String getName() 
    {
        return name;//retorna valor do nome para o chamador
    }   
}