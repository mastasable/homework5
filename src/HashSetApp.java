import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by admin on 17.03.2015.
 */
public class HashSetApp {

    public static String getString() throws IOException{
        InputStreamReader irs = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(irs);
        String s = br.readLine();
        return s;
    }

    public static char getChar() throws IOException{
        String s = getString();
        return s.charAt(0);
    }

    public static int getInt() throws IOException{
        String s = getString();
        return Integer.parseInt(s);
    }

    public static void main(String args[]) throws IOException {
        int aVal;

        HashSet hashSet = new HashSet();

        while (true){
            System.out.print("Введите команду: a - добавление, c - поиск, d - показать сет");
            char choice = getChar();
            switch (choice){
                case 'a':
                    System.out.print("Введите целое число: ");
                    aVal = getInt();
                    hashSet.add(aVal);
                    break;
                case 'c':
                    System.out.print("Введите значение для поиска: ");
                    aVal = getInt();
                    boolean aIscons = hashSet.contains(aVal);
                    if(aIscons){
                        System.out.println("Найдено: " + aVal);
                    } else
                        System.out.println("Не найдено: " + aVal);
                    break;
                case 'd':
                    hashSet.display();
                    break;
                default:
                    System.out.print("Неверный ввод!\n");
            }
        }
    }
}
