import java.util.ArrayList;

public class Pista {
  
  private int id;
  private String numero;

  public static ArrayList<Pista> pistas = new ArrayList<Pista>();

  public Pista(){
    
  }
  public Pista(int id, String numero) {
    this.id = id;
    this.numero = numero;
  }

  public Pista(String numero){
    this.numero = numero;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  @Override
  public String toString() {
    return "Pista{" + "id=" + id + ", numero=" + numero + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Pista other = (Pista) obj;
    if (this.id != other.id) {
      return false;
    }
    if ((this.numero == null) ? (other.numero != null) : !this.numero.equals(other.numero)) {
      return false;
    }
    return true;
  }
  
  public void update(){
    // PistaDAO dao = new PistaDAO();
    // dao.update(this);
  }

  public void delete(){
    // PistaDAO dao = new PistaDAO();
    // dao.delete(this);
  }

  public Pista getByPista(int id){
    // PistaDAO dao = new PistaDAO();
    // return dao.getByPista(id);
    return null;
  }

  public ArrayList<Pista> getAll(){
    // PistaDAO dao = new PistaDAO();
    // return dao.getAll();
    return null;
  }

  
}
