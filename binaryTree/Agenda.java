
import java.io.*;
import java.util.*;

class Agenda {
   No raiz;

   public Agenda() {
      this.raiz = null;
   }

   // metodo Recursivo para inserir apenas as letras
   // da arvore binaria
   // ordem de letras na arvore
   // M, F, T, C, I, P, W, A, B, D, E, G, H, J, K,
   // L, N, O, Q, R, S, U, V, X, Y e Z
   public void metodoInserirLetras() {
      char[] letras = new char[] { 'M', 'F', 'T', 'C', 'I', 'P', 'W', 'A', 'B', 'D', 'E', 'G', 'H', 'J', 'K', 'L', 'N',
            'O', 'Q', 'R', 'S', 'U', 'V', 'X', 'Y', 'Z' };
      for (int i = 0; i < letras.length; i++) {
         inserirLetras(letras[i]);
      }
   }

   public void inserirLetras(char x) {
      this.raiz = inserirLetras(x, raiz);
   }

   private No inserirLetras(char x, No i) {
      if (i == null) {
         i = new No(x);

      } else if (x < i.letra) {
         i.esq = inserirLetras(x, i.esq);

      } else if (x > i.letra) {
         i.dir = inserirLetras(x, i.dir);

      } else {
         System.out.println("Erro ao inserir!");
      }
      return i;
   }
   // FIM METODO INSERIR APENAS LETRAS

   // METODO PARA MEXER CONTATOS EM CADA LETRA
   /*
    * this.nome = nome;
    * this.telefone = tel;
    * this.email = email;
    * this.cpf = cpf;
    */
   public boolean inserir(Contato contato) {
      Celula x = new Celula(contato);
      // pegar a primeira letra do nome do contato para ir para lista
      char chave = x.elemento.nome.charAt(0);
      No i = this.raiz;
      if (i == null) {
         return false;
      }
      while (i.letra != chave) {
         if (chave < i.letra) {
            i = i.esq;
         } else if (chave > i.letra) {
            i = i.dir;
         } else {
            // nao encontrou o item
            return false;
         }
      }
      // achou a folha
      i.inserirFim(contato);
      return true;
   }

   public boolean remover() {

   }

   public boolean pesquisar(String nome) {

   }
   // FIM METODO PARA MEXER CONTATOS EM CADA LETRA

   public void caminharCentral() {
      System.out.print("[ ");
      caminharCentral(raiz);
      System.out.println("]");
   }

   private void caminharCentral(No i) {
      if (i != null) {
         caminharCentral(i.esq); // Elementos da esquerda.
         System.out.print(i.letra + " "); // Conteudo do no.
         caminharCentral(i.dir); // Elementos da direita.
      }
   }

   public static void main(String[] args) {
      Agenda teste = new Agenda();
      teste.metodoInserirLetras();
      teste.caminharCentral();
   }
}