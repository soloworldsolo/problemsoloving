package com.solo.trees.bst;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import static java.util.Objects.requireNonNull;

public class LevelOrdertraversal {

    public static void Traverse(Node rootNode) {
       Node currentnode = requireNonNull (rootNode,"rootnode was empty");
       Queue<Node> childstack = new LinkedList<> ();

       while (currentnode!= null) {
           System.out.println (currentnode.value );
           if(currentnode.leftnode!= null)
               childstack.add (currentnode.leftnode);

           if(currentnode.rightnode!= null)
               childstack.add (currentnode.rightnode);

           currentnode = childstack.isEmpty () ? null : childstack.poll ();
       }


    }

    public static void main(String[] args) {
        Node parentnode = new Node (1);

        Node firstnodeleft = new Node (2);
        Node firstnoderight = new Node (3);

        parentnode.leftnode = firstnodeleft;
        parentnode.rightnode = firstnoderight;


        Node leveltwofirstnodeleft = new Node (4);
        Node leveltwofirstnoderight = new Node (5);

        firstnodeleft.leftnode = leveltwofirstnodeleft;
        firstnodeleft.rightnode = leveltwofirstnoderight;


        Node leveltwosecnodeleft = new Node (6);
        Node leveltwosecnoderight = new Node (7);

        firstnoderight.leftnode = leveltwosecnodeleft;
        firstnoderight.rightnode = leveltwosecnoderight;


       Traverse (parentnode);

    }


}
