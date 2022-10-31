public class No {
  public char letra;
  No dir;
  No esq;
  Celula primeiro;
  Celula ultimo;

  public No(char letra, No dir, No esq) {
    this.letra = letra;
    this.dir = dir;
    this.esq = esq;
    primeiro = new Celula();
    ultimo = primeiro;
  }

  public No(char letra) {
    this.letra = letra;
    this.esq = null;
    this.dir = null;
    primeiro = new Celula();
    ultimo = primeiro;
  }

  // inserir lista ao final
  public void inserirFim(Contato x) {
    ultimo.prox = new Celula(x);
    ultimo = ultimo.prox;
  }
}