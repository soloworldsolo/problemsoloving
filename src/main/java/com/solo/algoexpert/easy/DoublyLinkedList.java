package com.solo.algoexpert.easy;

import java.util.Objects;

public class DoublyLinkedList {
    // Feel free to add new properties and methods to the class.

            public Node head;
            public Node tail;

            public void setHead(Node node) {
                if(head!= null)
                    node.next = head;

                head = node;

            }

            public void setTail(Node node) {
                if(tail!= null)
                    tail.next = node;

                this.tail = tail;
            }

            public void insertBefore(Node node, Node nodeToInsert) {
                Objects.requireNonNull (node, "Input cannot be EMpty");
                Objects.requireNonNull (nodeToInsert, "Input Cannot be empty");

                if(nodeToInsert == head) {
                    setHead (node);
                }
                Node parentNode = nodeToInsert.prev;
                node.prev = parentNode;
                parentNode.next = node;
                nodeToInsert.prev = node;
                node.next = nodeToInsert;
            }

            public void insertAfter(Node node, Node nodeToInsert) {
                Objects.requireNonNull (node, "Input cannot be EMpty");
                Objects.requireNonNull (nodeToInsert, "Input Cannot be empty");

                if(nodeToInsert == tail) {
                    setTail (node);
                }
                Node parentNode = nodeToInsert.prev;
                node.prev = parentNode;
                parentNode.next = node;
                nodeToInsert.prev = node;
                node.next = nodeToInsert;            }

            public void insertAtPosition(int position, Node nodeToInsert) {
                // Write your code here.
            }

            public void removeNodesWithValue(int value) {
                // Write your code here.
            }

            public void remove(Node node) {
                // Write your code here.
            }

            public boolean containsNodeWithValue(int value) {
                return  false;
            }
        }

        // Do not edit the class below.
         class Node {
            public int value;
            public Node prev;
            public Node next;

            public Node(int value) {
                this.value = value;
            }
        }


