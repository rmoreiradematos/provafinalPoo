public class Aviao  extends Aeromodelo{
  
  private String prefixo;
  private int capacidade;
  private int idCompanhia;
  private Companhia companhia;


  public Aviao(){
    
  }

  public Aviao(int id, String marca, String modelo, String prefixo, int capacidade, int idCompanhia) {
    super(id, marca, modelo);
    this.prefixo = prefixo;
    this.capacidade = capacidade;
    this.idCompanhia = idCompanhia;
  }

  public Aviao(String marca, String modelo, String prefixo, int capacidade, int idCompanhia) {
    super(marca, modelo);
    this.prefixo = prefixo;
    this.capacidade = capacidade;
    this.idCompanhia = idCompanhia;
  }

  public String getPrefixo(){
    return prefixo;
  }

  public void setPrefixo(String prefixo){
    this.prefixo = prefixo;
  }

  public int getCapacidade(){
    return capacidade;
  }

  public void setCapacidade(int capacidade){
    this.capacidade = capacidade;
  }

  public int getIdCompanhia(){
    return idCompanhia;
  }

  public void setIdCompanhia(int idCompanhia){
    this.idCompanhia = idCompanhia;
  }

  public Companhia getCompanhia(){
    return companhia;
  }

  public void setCompanhia(Companhia companhia){
    this.companhia = companhia;
  }

  @Override
  public String toString() {
    return "Aviao{" + "prefixo=" + prefixo + ", capacidade=" + capacidade + ", idCompanhia=" + idCompanhia + ", companhia=" + companhia + '}';
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
