public class Hangar {
  private int id;
  private String local;
  private int idAviao;
  private Aviao aviao;

  public Hangar() {
  }

  public Hangar(int id, String local, int idAviao) {
    this.id = id;
    this.local = local;
    this.idAviao = idAviao;
  }

  public Hangar(String local, int idAviao) {
    this.local = local;
    this.idAviao = idAviao;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLocal() {
    return local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public int getIdAviao() {
    return idAviao;
  }

  public void setIdAviao(int idAviao) {
    this.idAviao = idAviao;
  }

  public Aviao getAviao() {
    return aviao;
  }

  public void setAviao(Aviao aviao) {
    this.aviao = aviao;
  }

  @Override
  public String toString() {
    return "Hangar{" + "id=" + id + ", local=" + local + ", idAviao=" + idAviao + ", aviao=" + aviao + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Hangar other = (Hangar) obj;
    if (this.id != other.id) {
      return false;
    }
    if ((this.local == null) ? (other.local != null) : !this.local.equals(other.local)) {
      return false;
    }
    if (this.idAviao != other.idAviao) {
      return false;
    }
    if (this.aviao != other.aviao && (this.aviao == null || !this.aviao.equals(other.aviao))) {
      return false;
    }
    return true;
  }

  public void update(){
    //
  }

  public void delete(){
    //
  }

  public void getById(int id){
    //
  }

  public void getAll(){
    //
  }
}
