package ProjAedLp2;


import edu.princeton.cs.algs4.*;
import java.util.*;
    public class Nodes extends BinarySearchST {

        // https://www.softwaretestinghelp.com/binary-search-tree-in-java/


        public Nodes(List<Tags> tags, List<Entroncamentos> entroncamentos, List<Cruzamentos> cruzamentos, List<Curvas> curvas, List<Ways> ways, List<POI> pOI, Nodes root) {
            this.tags = tags;
            this.entroncamentos = entroncamentos;
            this.cruzamentos = cruzamentos;
            this.curvas = curvas;
            this.ways = ways;
            this.pOI = pOI;
            this.root = root;
        }

        public List<Tags> getTags() {
            return tags;
        }

        public void setTags(List<Tags> tags) {
            this.tags = tags;
        }

        public List<Entroncamentos> getEntroncamentos() {
            return entroncamentos;
        }

        public void setEntroncamentos(List<Entroncamentos> entroncamentos) {
            this.entroncamentos = entroncamentos;
        }

        public List<Cruzamentos> getCruzamentos() {
            return cruzamentos;
        }

        public void setCruzamentos(List<Cruzamentos> cruzamentos) {
            this.cruzamentos = cruzamentos;
        }

        public List<Curvas> getCurvas() {
            return curvas;
        }

        public void setCurvas(List<Curvas> curvas) {
            this.curvas = curvas;
        }

        public List<Ways> getWays() {
            return ways;
        }

        public void setWays(List<Ways> ways) {
            this.ways = ways;
        }

        public List<POI> getpOI() {
            return pOI;
        }

        public void setpOI(List<POI> pOI) {
            this.pOI = pOI;
        }

        public Nodes getRoot() {
            return root;
        }

        public void setRoot(Nodes root) {
            this.root = root;
        }

        /**
         *
         */
        public List<Tags> tags;
        public List<Entroncamentos> entroncamentos;
        public List<Cruzamentos> cruzamentos;
        public List<Curvas> curvas;
        public List<Ways> ways;
        /**
         *
         */

        public List<POI> pOI;

        // instance variable of binary tree class
        public Nodes root;

        // constructor for initialise the root to null BYDEFAULT


        public void inserirNode() {
        }

        public void editarNode() {
        }

        public void removerNode() {
        }

        public void pesquisarNode() {
        }

        public void listarNodes() {
        }

    }


/* public class BinarySearchTree {

    public class Node {
        //instance variable of Node class
        public int data;
        public Node left;
        public Node right;

        //constructor
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // instance variable
    public Node root;

    // constructor for initialise the root to null BYDEFAULT
    public BinarySearchTree() {
        this.root = null;
    }

    // insert method to insert the new Date
    public void insert(int newData) {
        this.root = insert(root, newData);
    }

    public Node insert(Node root, int newData) {
        // Base Case: root is null or not
        if (root == null) {
            // Insert the new data, if root is null.
            root = new Node(newData);
            // return the current root to his sub tree
            return root;
        }
        // Here checking for root data is greater or equal to newData or not
        else if (root.data >= newData) {
            // if current root data is greater than the new data then now process the left sub-tree
            root.left = insert(root.left, newData);
        } else {
            // if current root data is less than the new data then now process the right sub-tree
            root.right = insert(root.right, newData);
        }
        return root;
    }

    // method for search the data , is data is present or not in the tree ?
    public boolean search(int data) {
        return search(this.root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }

    //Traversal
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        // Creating the object of BinarySearchTree class
        BinarySearchTree bst = new BinarySearchTree();
        // call the method insert
        bst.insert(8);
        bst.insert(5);
        bst.insert(9);
        bst.insert(3);
        bst.insert(7);
        bst.preorder();
        System.out.println(bst.search(7));

    }
    /*
   class LeafNode
  {
    Point points[]; // Array of points
  }

       public Nodes left;
        public Nodes right;

        public Nodes() {
            this.left = null;
            this.right = null;
        }*/

// https://stackoverflow.com/questions/5418798/how-to-implement-proximity-search-for-latitude-and-longitude-values
//https://favtutor.com/blogs/binary-search-tree-java
/**
 *
 *
 */
// public List<POI> ;

