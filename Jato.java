public class Jato extends Aeromodelo{
  //classe inicial
  private String cor;
  private int velocidade;

  public Jato(String cor, int velocidade) {
    this.cor = cor;
    this.velocidade = velocidade;
  }
  
  public Jato(){

  }

  public Jato(String cor) {
    this.cor = cor;
  }

  public Jato(String marca, String modelo, int velocidade, String cor) {
    this.cor = cor;
    this.velocidade = velocidade;

  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public void setVelocidade(int velocidade) {
    this.velocidade = velocidade;
  }

  @Override
  public String toString() {
    return "Jato{" + "cor=" + cor + ", velocidade=" + velocidade + '}';
  }

  public static void update(){
    // update
  }

  public static void delete(){
    // delete
  }

  public static void getById(int id){
    // search by id
  }

  public static void getAll(){
    // search all
  }

  
}
