package ProjAedLp2;


import java.util.*;

public class Ways  {

  public Integer latitudeWay;
  public Integer longitudeWay;
  public List<Tags> tags;
  public List<Avenidas> avenidas;
  public List<Ruas> ruas;
  public List<Nodes> nodes;
 public HashMap <Integer, String> way = new HashMap<Integer, String>();

  /**
    * 
    *
   */
  public Ways(int latitudeWay, int longitudeWay, HashMap way,ArrayList<Tags>tags,ArrayList<Nodes>nodes){
    this.latitudeWay=latitudeWay;
    this.longitudeWay=longitudeWay;
    this.tags=tags;
    this.nodes=nodes;


  }

  //falta construir a classe do construtor e nesse construtor ter a hashmap

  //public List<Nodes> nodess;
//uma avenida pode ter varias ways, melhor guardar ponto de partida e destino

    /**
     * funcao para inserir uma way
      * @param way
     * @param id
     * @param name
     */
  public static void inserirWay(HashMap way,Integer id, String name) {
    way.put(id,name);


  }

    /**
     * funcao para editar uma way
     */
  public void editarWay() {
  }

    /**
     * funcao para remover uma way
     * @param way
     * @param id
     */
  public static void removerWay(HashMap way,Integer id) {
    way.remove(id);


  }

    /**
     * funcao para listar a way
     * @param way
     */
  public static void listarWays(HashMap way) {
    System.out.println("Lista de ways: \n");
    System.out.println("way: "+ way);
  }

    /**
     * funcao para pesquisar uma way
     * @param way
     * @param id
     */
  public static void pesquisarWay(HashMap way,Integer id) {


      if(way.containsKey(id)){
        System.out.println(" Pesquisa -> key: " + id + " value: " + way.get(id));
      }
      else System.out.println("nao tenho esse way!");

    }


/*
  public static void main(String[] args) {

    inserirWay(way,1,"rua do coteiro");
    inserirWay(way,2,"rua do valado");
    inserirWay(way,3,"rua da feiteira");
    inserirWay(way,4,"rua da republica ");

    removerWay(way,3);

    listarWays(way);
    pesquisarWay(way,2);
  }

*/

}