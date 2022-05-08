package ProjAedLp2;



import edu.princeton.cs.algs4.*;
import java.util.*;

public class Users extends Person {

  public Users(Integer tipoUser, List<Logs> consulta, List<POI> visita, List<POI> pOI) {
    this.tipoUser = tipoUser;
    this.consulta = consulta;
    this.visita = visita;
    this.pOI = pOI;
  }

  public List<Logs> getConsulta() {
    return consulta;
  }

  public void setConsulta(List<Logs> consulta) {
    this.consulta = consulta;
  }

  public List<POI> getVisita() {
    return visita;
  }

  public void setVisita(List<POI> visita) {
    this.visita = visita;
  }

  public List<POI> getpOI() {
    return pOI;
  }

  public void setpOI(List<POI> pOI) {
    this.pOI = pOI;
  }

  public Integer tipoUser;

  public List<Logs> consulta;

  public List<POI> visita;

  public List<POI> pOI;

  public int getTipoUser() {
    return tipoUser;
  }

  public void setTipoUser(int tipoUser) {
    this.tipoUser = tipoUser;
  }


  /**
   * funcao para inserir um utilizador
   * @param idNumber id do utilizador
   * @param tipoUser tipo do utilizador
   * @param name nome do utilizador
   * @param address morada do utilizador
   */
  public void inserirUser(String idNumber,int tipoUser, String name, String address) {
    this.setIdNumber(idNumber);
    this.setName(name);
    this.setAddress(address);

  }

  /**
   * funcao para editar o utilizador
   */
  public void editarUser() {
  }

  /**
   * funcao para remover o utilizador
   * @param idNumber id do utilizador que queremos remover
   */
  public void removerUser(String idNumber) {
    if(this.getIdNumber()==idNumber){

      this.setIdNumber("Null");
      this.setName("Null");
      this.setAddress("Null");
    }

  }

  /**
   * funcao para listar os utilizadores
   */
  public void listarUser() {
  }

  /**
   * funcao para pesquisar um utilizador
   */
  public void pesquisarUser() {
  }

}