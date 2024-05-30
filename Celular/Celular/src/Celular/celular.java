package Celular;

import AparelhoTelefonico.Atender;
import AparelhoTelefonico.IniciarCorreioDeVoz;
import AparelhoTelefonico.Ligar;
import CelularMutilFuncional.CelularMutilFuncional;
import NavegadorInternet.AtualizarPagina;
import NavegadorInternet.adicionarNovaAba;
import NavegadorInternet.exibirPagina;
import ReprodutorMusical.Pausar;
import ReprodutorMusical.SelecionarMusica;
import ReprodutorMusical.Tocar;

public class celular {
   public static void main (String [] args){
       
       CelularMutilFuncional celularMutil = new CelularMutilFuncional();
       
       System.out.println("Instanciando a classe AparelhoTelefonico...");
       Atender atender = new Atender();
       IniciarCorreioDeVoz iniciarCorreioDeVoz = new IniciarCorreioDeVoz();
       Ligar ligar = new Ligar();
       
       System.out.println("Instanciando a classe NavegadorInternet...");
       AtualizarPagina atualizarPagina = new AtualizarPagina();
       adicionarNovaAba AdicionarNovaAba = new adicionarNovaAba();
       exibirPagina ExibirPagina = new exibirPagina();
       
       System.out.println("Instanciando a classe ReprodutorMusical...\n");
       Pausar pausar = new Pausar();
       SelecionarMusica selecionarMusica = new SelecionarMusica();
       Tocar tocar = new Tocar();
       
       
       
       
       System.out.println("\nAqui iniciaremos os comandos pelo aparelho telefonico");
       atender.iniciarAparelhoTelefonico();
       iniciarCorreioDeVoz.iniciarAparelhoTelefonico();
       ligar.iniciarAparelhoTelefonico();
       
       
       
       
       System.out.println("\nAqui iniciaremos os comandos pelo Navegador de internet");   
       atualizarPagina.IniciarNavegador();
       AdicionarNovaAba.IniciarNavegador();
       ExibirPagina.IniciarNavegador();
       
       
       System.out.println("\nAqui iniciaremos os comandos pelo Reprodutor de musica");    
       pausar.IniciarReprodutorMusical();
       selecionarMusica.IniciarReprodutorMusical();
       tocar.IniciarReprodutorMusical();
       
       
       
       
       System.out.println("\nAqui iniciaremos os comandos pelo CelularMultiFuncional");  
       celularMutil.IniciarNavegador();
       celularMutil.IniciarReprodutorMusical();
       celularMutil.iniciarAparelhoTelefonico();
       
       
       
       
       
   }

    
}
