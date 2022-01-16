
package projetobanco;

public class ContaBanco {
    //Atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    
    //metodos personalizados
    
    public void estadoAtual(){
        System.out.println("------------------------------ ");
        System.out.println(("Conta " + this.getNumConta()));
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo R$ " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("------------------------------- ");
        
    }
    
    public void abrirConta ( String t)
    { this.setTipo(t);
      this.setStatus(true);
        if(t== "CC")
        {this.setSaldo(50);
            
            
        } else if (t=="CP")
        { this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucessso!");
    }
       
    
    public  void fecharConta()
    { if (this.getSaldo() > 0){
        System.out.println("Conta não pode ser fechada por que consta saldo positivo!");
    } else if (this.getSaldo()<0){
        System.out.println("Conta não pode ser fachada por constar débitos, procure seu gerente!");
    } else {
        this.setStatus(false);
        System.out.println("Conta fechada com sucesso!");
    }
        
    }
    
    public void depositar( float v)
    {if (this.getStatus()){
        //this.saldo =this.saldo + v; influencia direto no atributos, onde estamos diretamente  com metodos especiais
        this.setSaldo(this.getSaldo() + v);
        System.out.println("Depósito realizado  na conta de : " + this.getDono());
    }else {
        System.out.println(" Numero da Conta não localizada ou Conta ja encerrada!");
    }
        
    }
    
    public void sacar (float v)
    {if ( this.getStatus()){
        if ( this.getSaldo()>= v){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Saque realizado no valor de R$"   +  this.getSaldo() +(" ") +  this.getDono()) ;
        }else {
            System.out.println("Saldo Insuficiente para saque! ");
        }
    }else {
        System.out.println("Impossível sacar de uma conta fechada! ");
    }
        
    }
    
    public void pagarMensalidade ()
    { int v= 0;
        if (this.getTipo () == "CC") {
            v=12;
        } else if ( this.getTipo()== "CP");{
        v=20;
    }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() -v);
            System.out.println("Mensalidade de conta cobrada referente a mes do titular   "+ this.getDono());
        }else {
            System.out.println("Impossível pagar mensalidade de uma conta fechada! ");
        }
        
    }
    
    //metodo especiais,construtor 
    
    public ContaBanco()
    {  this.saldo= 0;
       this.status = false;     
        
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    public float getSaldo()
    { return saldo;
        
    }
    
    public void setSaldo( float saldo){
        this.saldo= saldo;
     
    }
    

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
