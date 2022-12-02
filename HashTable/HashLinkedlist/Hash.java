import java.util.*;
import java.io.*;

public class Hash {
    LinkedList[] table;
    int len;

    public Hash(int len) {
        this.len = len;
        // create HashTable
        this.table = new LinkedList[len];
        // inicializes a new LinkedList in every hashtable position
        for (int i = 0; i < len; i++) {
            table[i] = new LinkedList();
        }
    }

    // key to insert,remove person search in hashtable
    public int h(Contact person) {
        return person.contnumb % len;
    }

    public boolean search(Contact person) {
        int pos = h(person);
        return table[pos].search(person);
    }

    public void insert(Contact person) {
        int pos = h(person);
        table[pos].insert(person);
    }

    public Contact remove() {
        int pos = len - 1;
        return table[pos].remove();
    }

    public void showHashTable() {
        for (int i = 0; i < this.len; i++) {
            System.out.println("at " + i + "-----");
            Node aux = table[i].head;
            for (; aux != null; aux = aux.next) {
                aux.value.showContact();
            }
        }
    }
}
