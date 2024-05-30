package CelularMutilFuncional;

import AparelhoTelefonico.aparelhoTelefonico;
import NavegadorInternet.navegadorInternet;
import ReprodutorMusical.reprodutorMusical;

public class CelularMutilFuncional implements aparelhoTelefonico, navegadorInternet, reprodutorMusical {
   public static void main (String [] args){
       
  
   }

    
   @Override
    public void iniciarAparelhoTelefonico() {
      System.out.println("iniciando aparelho telefonico via CelularMutilFuncional ");
    }

    @Override
    public void IniciarNavegador() {
       System.out.println("iniciando navegador via CelularMutilFuncional ");
    }

    @Override
    public void IniciarReprodutorMusical() {
      System.out.println("iniciando reprodutor musical via CelularMutilFuncional ");
    }
    
    
}
