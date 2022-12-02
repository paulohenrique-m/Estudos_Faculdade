import java.io.*;
import java.util.*;

public class Contact {
    public String name;
    public int contnumb;

    // empty constructor
    public Contact() {
        this.name = null;
        this.contnumb = 0;
    }

    // constructor with parameters
    public Contact(String name, int contnumb) {
        this.name = name;
        this.contnumb = contnumb;
    }

    public void showContact() {
        System.out.println(this.name + " " + this.contnumb);
    }
}
