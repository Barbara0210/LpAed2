package ProjAedLp2;



import edu.princeton.cs.algs4.*;
import java.util.*;

public class Tags {


  /**
   *
   * @param tag Hashmap com key e value (array list para todos os elementos onde a tag é utilizada)
   * @param ways array list de ways
   * @param nodes array list de nodes
   * @param pOI array list de pontos de interesse
   */
  public Tags(HashMap<String, ArrayList> tag, ArrayList<Ways> ways, List<Nodes> nodes, List<POI> pOI) {
    this.tag = tag;
    this.ways = ways;
    this.nodes = nodes;
    this.pOI = pOI;
  }

  public HashMap<String, ArrayList> getTag() {
    return tag;
  }

  public void setTag(HashMap<String, ArrayList> tag) {
    this.tag = tag;
  }

  public List<Ways> getWays() {
    return ways;
  }

  public void setWays(List<Ways> ways) {
    this.ways = ways;
  }

  public List<Nodes> getNodes() {
    return nodes;
  }

  public void setNodes(List<Nodes> nodes) {
    this.nodes = nodes;
  }

  public List<POI> getpOI() {
    return pOI;
  }

  public void setpOI(List<POI> pOI) {
    this.pOI = pOI;
  }

  HashMap <String, ArrayList> tag = new HashMap<String, ArrayList>();

  //https://www.guj.com.br/t/como-adicionar-no-valor-de-cada-chave-do-hashmap-um-arraylist/51551/2


  /**
   * Função que insere uma tag numa hashmap
   * @param tag estrutura do tipo haspmap
   * @param key key do hashmap
   * @param lista value do hashmap, array list onde a tag é utilizada
   */
  public static void inserirTag(HashMap tag,String key,ArrayList lista) {
    tag.put(key,lista);


  }


  /**
   * Função para editar a tag
   */
  public void editarTag() {
  }


  /**
   * Remove um elemento da hashmap
   * @param tag hashmap de onde queremos remover
   * @param key
   */
  public static void removerTag(HashMap tag,String key) {
    tag.remove(key);

  }

  /**
   * Função que lista a hashmap de tags
   * @param tag hashmap
   */
  public static void listarTag(HashMap tag) {
    System.out.println("Lista de tag: \n");
    System.out.println("tag: "+ tag);
  }


  /**
   * Funcão para pesquisar uma tag especifica na hashmap
    * @param tag hashmap a pesquisar
   * @param key key da hashmap  que queremos pesquisar
   */
  public static void pesquisartag(HashMap tag,String key) {


    if(tag.containsKey(key)){
      System.out.println(" Pesquisa -> key: " + key + " value: " + tag.get(key));
    }
    else System.out.println("nao tenho esse way!");

  }



    public List<Ways> ways;
    /**
    * 
    *
   */
  public List<Nodes> nodes;
    /**
    * 
    *
   */
    /**
    * 
    *
   */
  public List<POI> pOI;



}