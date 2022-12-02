import java.io.*;
import java.util.*;

public class Main {
    public static Contact GetContact() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String name = new String();
        int num = 0;
        String[] result = new String[100];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122 || str.charAt(i) == 32) {
                name += str.charAt(i);
            }
        }
        result = str.split(name);
        num = Integer.parseInt(result[1]);
        Contact person = new Contact(name, num);
        return person;
    }

    public static void main(String[] args) {
        Hash table = new Hash(5);
        for (int i = 0; i < table.len; i++) {
            Contact person = GetContact();
            table.insert(person);
        }
        table.showHashTable();
    }
}
