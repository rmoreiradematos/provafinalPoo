public class Voo {
  private int id;
  private String data;
  private String hora;
  private String origem;
  private String destino;
  private String piloto;
  private String copiloto;
  private String observacao;
  private int idPista;
  private Pista pista;
  private int idAviao;
  private Aviao aviao;
  private int idHeliciptero;
  private Helicoptero helicoptero;
  private int idJato;
  private Jato jato;


  

  public static void main(String[] args){
    Voo voo = new Voo();
    voo.setId(1);
    voo.setData("01/01/2010");
    voo.setHora("10:00");
    voo.setOrigem("São Paulo");
    voo.setDestino("Rio de Janeiro");
    voo.setPiloto("João");
    voo.setCopiloto("José");
    voo.setObservacao("Voo de teste");
    voo.setIdPista(1);
    voo.setIdAviao(1);
    voo.setIdHeliciptero(1);
    voo.setIdJato(1);
    voo.setPista(new Pista(1, "Pista 1"));
    voo.setAviao(new Aviao());
    voo.setHelicoptero(new Helicoptero());
    voo.setJato(new Jato());

    Voo voo2 = new Voo();
    voo2.setId(1);
    voo2.setData("01/01/2011");
    voo2.setHora("10:00");
    voo2.setOrigem("São Paulo");
    voo2.setDestino("Santa Catarina");
    voo2.setPiloto("João");
    voo2.setCopiloto("José");
    voo2.setObservacao("Voo de teste");
    voo2.setIdPista(1);
    voo2.setIdAviao(1);
    voo2.setIdHeliciptero(1);
    voo2.setIdJato(1);
    voo2.setPista(new Pista(1, "Pista 1"));
    voo2.setAviao(new Aviao());
    voo2.setHelicoptero(new Helicoptero());
    voo2.setJato(new Jato());
    System.out.println(voo.equals(voo2));
  }

  public Voo(){

  }

  public Voo(int id, String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, int idAviao, int idHeliciptero, int idJato) {
    this.id = id;
    this.data = data;
    this.hora = hora;
    this.origem = origem;
    this.destino = destino;
    this.piloto = piloto;
    this.copiloto = copiloto;
    this.observacao = observacao;
    this.idPista = idPista;
    this.idAviao = idAviao;
    this.idHeliciptero = idHeliciptero;
    this.idJato = idJato;

  }

  public Voo(String data, String hora, String origem, String destino, String piloto, String copiloto, String observacao, int idPista, int idAviao, int idHeliciptero, int idJato) {
    this.data = data;
    this.hora = hora;
    this.origem = origem;
    this.destino = destino;
    this.piloto = piloto;
    this.copiloto = copiloto;
    this.observacao = observacao;
    this.idPista = idPista;
    this.idAviao = idAviao;
    this.idHeliciptero = idHeliciptero;
    this.idJato = idJato;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getHora() {
    return hora;
  }

  public void setHora(String hora) {
    this.hora = hora;
  }

  public String getOrigem() {
    return origem;
  }

  public void setOrigem(String origem) {
    this.origem = origem;
  }

  public String getDestino() {
    return destino;
  }

  public void setDestino(String destino) {
    this.destino = destino;
  }

  public String getPiloto() {
    return piloto;
  }

  public void setPiloto(String piloto) {
    this.piloto = piloto;
  }

  public String getCopiloto() {
    return copiloto;
  }

  public void setCopiloto(String copiloto) {
    this.copiloto = copiloto;
  }

  public String getObservacao() {
    return observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public int getIdPista() {
    return idPista;
  }

  public void setIdPista(int idPista) {
    this.idPista = idPista;
  }

  public Pista getPista() {
    return pista;
  }

  public void setPista(Pista pista) {
    this.pista = pista;
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

  public int getIdHeliciptero() {
    return idHeliciptero;
  }

  public void setIdHeliciptero(int idHeliciptero) {
    this.idHeliciptero = idHeliciptero;
  }

  public Helicoptero getHelicoptero() {
    return helicoptero;
  }

  public void setHelicoptero(Helicoptero helicoptero) {
    this.helicoptero = helicoptero;
  }

  public int getIdJato() {
    return idJato;
  }

  public void setIdJato(int idJato) {
    this.idJato = idJato;
  }

  public Jato getJato() {
    return jato;
  }

  public void setJato(Jato jato) {
    this.jato = jato;
  }

  @Override
  public String toString() {
    return "Voo{" +
            "id=" + id +
            ", data='" + data + '\'' +
            ", hora='" + hora + '\'' +
            ", origem='" + origem + '\'' +
            ", destino='" + destino + '\'' +
            ", piloto='" + piloto + '\'' +
            ", copiloto='" + copiloto + '\'' +
            ", observacao='" + observacao + '\'' +
            ", idPista=" + idPista +
            ", pista=" + pista +
            ", idAviao=" + idAviao +
            ", aviao=" + aviao +
            ", idHeliciptero=" + idHeliciptero +
            ", helicoptero=" + helicoptero +
            ", idJato=" + idJato +
            ", jato=" + jato +
            '}';
  }


  // @Override
  // public boolean equals(Object obj){
  //   if(obj == null){
  //     return false;
  //   }
  //   if(getClass() != obj.getClass()){
  //     return false;
  //   }
  //   final Voo other = (Voo) obj;
  //   if(this.id != other.id){
  //     return false;
  //   }
  //   if((this.data == null) ? (other.data != null) : !this.data.equals(other.data)){
  //     return false;
  //   }
  //   if((this.hora == null) ? (other.hora != null) : !this.hora.equals(other.hora)){
  //     return false;
  //   }
  //   if((this.origem == null) ? (other.origem != null) : !this.origem.equals(other.origem)){
  //     return false;
  //   }
  //   if((this.destino == null) ? (other.destino != null) : !this.destino.equals(other.destino)){
  //     return false;
  //   }
  //   if((this.piloto == null) ? (other.piloto != null) : !this.piloto.equals(other.piloto)){
  //     return false;
  //   }
  //   if((this.copiloto == null) ? (other.copiloto != null) : !this.copiloto.equals(other.copiloto)){
  //     return false;
  //   }
  //   if((this.observacao == null) ? (other.observacao != null) : !this.observacao.equals(other.observacao)){
  //     return false;
  //   }
  //   if(this.idPista != other.idPista){
  //     return false;
  //   }
  //   if(this.idAviao != other.idAviao){
  //     return false;
  //   }
  //   if(this.idHeliciptero != other.idHeliciptero){
  //     return false;
  //   }
  //   if(this.idJato != other.idJato){
  //     return false;
  //   }
  //   return true;
  // }
}
