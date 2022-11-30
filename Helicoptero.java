public class Helicoptero extends Aeromodelo{
  
  private String cor;
  private int capacidade;


  public Helicoptero(){
    
  }

  public Helicoptero(int id, String marca, String modelo, String cor, int capacidade ) {
    super(id, marca, modelo);
    this.cor = cor;
    this.capacidade = capacidade;
  }

  public Helicoptero(String marca, String modelo, String cor, int capacidade ) {
    super(marca, modelo);
    this.cor = cor;
    this.capacidade = capacidade;
  }

  public String getCor(){
    return cor;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public int getCapacidade(){
    return capacidade;
  }

  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }

  @Override
  public String toString() {
    return "Helicoptero{" + "cor=" + cor + ", capacidade=" + capacidade + '}';
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
