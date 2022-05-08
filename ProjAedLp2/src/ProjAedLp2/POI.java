package ProjAedLp2;

import edu.princeton.cs.algs4.*;
import java.util.*;

public class POI {
  public Integer latitudePoi;
  public Integer longitudePoi;
  public ArrayList<Tags> tags;
  public ArrayList<Users> users;
  public List<Nodes> nodes;


  HashMap <String, String> poi = new HashMap<String, String>();

  public POI(Integer latitudePoi, Integer longitudePoi, ArrayList<Tags> tags, ArrayList<Users> users, List<Nodes> nodes, HashMap<String, String> poi) {
    this.latitudePoi = latitudePoi;
    this.longitudePoi = longitudePoi;
    this.tags = tags;
    this.users = users;
    this.nodes = nodes;
    this.poi = poi;
  }

  public void setLatitudePoi(Integer latitudePoi) {
    this.latitudePoi = latitudePoi;
  }

  public void setLongitudePoi(Integer longitudePoi) {
    this.longitudePoi = longitudePoi;
  }

  public void setTags(ArrayList<Tags> tags) {
    this.tags = tags;
  }

  public void setUsers(ArrayList<Users> users) {
    this.users = users;
  }

  public void setNodes(List<Nodes> nodes) {
    this.nodes = nodes;
  }

  public void setPoi(HashMap<String, String> poi) {
    this.poi = poi;
  }

  public Integer getLatitudePoi() {
    return latitudePoi;
  }

  public Integer getLongitudePoi() {
    return longitudePoi;
  }

  public ArrayList<Tags> getTags() {
    return tags;
  }

  public ArrayList<Users> getUsers() {
    return users;
  }

  public List<Nodes> getNodes() {
    return nodes;
  }

  public HashMap<String, String> getPoi() {
    return poi;
  }


  /**
   * funcão para inserir um ponto de interesse
   * @param poi estrutura do tipo de hashmap para armazenar os pontos de interesse
   * @param key key do ponto de interesse a inserir
   * @param value value do ponto de interesse a inserir
   */
  public static void inserirPoi(HashMap poi, String key, String value) {
    poi.put(key,value);


  }

  /**
   * funcao para remover um ponto de interesse da hashmap
   * @param poi estrutura do tipo de hashmap de onde queremos remover os pontos de interesse
   * @param key key do ponto de interesse que queremos remover
   */
  public static void removerPoi(HashMap poi,String key) {
    poi.remove(key);


  }

  /**
   * Listar a hashmap que contem os pontos de interesse
   * @param poi estrutura do tipo hashmap que queremos listar
   */
  public static void listarPoi(HashMap poi) {
    System.out.println("Lista de pois: \n");
    System.out.println("tag: "+ poi);
  }

  /**
   * funcao para pesquisar na hashmap um ponto de interesse
   * @param poi estrutura de dados que contem os pontos de interesse
   * @param key key do ponto de interesse que queremos pesquisar
   */
  public static void pesquisarPoi(HashMap poi,String key) {


    if(poi.containsKey(key)){
      System.out.println(" Pesquisa -> key: " + key + " value: " + poi.get(key));
    }
    else System.out.println("nao tenho esse way!");

  }



}