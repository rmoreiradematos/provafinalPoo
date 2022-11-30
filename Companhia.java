public class Companhia {
  
  public int id;
  public String nome;
  public String cnpj;

  public Companhia() {
  }

  public Companhia(int id, String nome, String cnpj) {
    this.id = id;
    this.nome = nome;
    this.cnpj = cnpj;
  }

  public Companhia(String nome, String cnpj) {
    this.nome = nome;
    this.cnpj = cnpj;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return "Companhia{" + "id=" + id + ", nome=" + nome + ", cnpj=" + cnpj + '}';
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Companhia other = (Companhia) obj;
    if (this.id != other.id) {
      return false;
    }
    if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
      return false;
    }
    if ((this.cnpj == null) ? (other.cnpj != null) : !this.cnpj.equals(other.cnpj)) {
      return false;
    }
    return true;
  }


  public void update(){
    //update
  }

  public void delete(){
    //delete
  }

  public void getById(int id){
    //getById
  }

  public void getAll(){
    //getAll
  }
  
}
