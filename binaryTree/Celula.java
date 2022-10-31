public class Celula {
  Contato elemento;
  Celula prox;

  // construtor vazio
  public Celula() {
    this.elemento = new Contato();
  }
  // construtor com elemento contato

  public Celula(Contato x) {
    elemento = x;
    prox = null;
  }

}