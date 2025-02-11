package linkedlist;

import java.util.LinkedList;
public class Example 
{
        public static void main(String[] args) {
          LinkedList<Integer> L=new LinkedList<Integer>();
          L.add(1);
          L.add(2);
          System.out.println("Linked List is "+L);
          L.addFirst(0);
          L.addLast(3);
          System.out.println(" After Adding Elements "+L);
        }
    }


