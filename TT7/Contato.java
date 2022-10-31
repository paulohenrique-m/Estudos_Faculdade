public class Contato {
  public String nome;
  public String telefone;
  public String email;
  public int cpf;

  // construtor
  public Contato() {
    this.nome = new String();
    this.telefone = new String();
    this.email = new String();
    this.cpf = 0;
  }

  public Contato(String nome, String tel, String email, int cpf) {
    this.nome = nome;
    this.telefone = tel;
    this.email = email;
    this.cpf = cpf;
  }

  public void imprimirContato() {
    System.out.println(this.nome + " " + this.telefone + " " + this.email + " " + this.cpf);
  }
}