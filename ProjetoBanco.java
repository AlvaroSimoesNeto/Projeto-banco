 
package projetobanco;

/**
 *
 * @author Alvaro Simões Neto
 */
public class ProjetoBanco {

    public static void main(String[] args) 
    { ContaBanco p1 = new ContaBanco();
    p1.setNumConta(001);
    p1.setDono("Alvaro");
    p1.abrirConta("CC");
    
    ContaBanco p2 = new ContaBanco ();
    p2.setNumConta(002);
    p2.setDono("Kelly");
    p2.abrirConta("CP");
    
      p1.depositar(100);
      p2.depositar(1200);
      p2.sacar(350);
      
    
    
    
    p1.estadoAtual();
    p2.estadoAtual();
    
  
    
    }
    
}
