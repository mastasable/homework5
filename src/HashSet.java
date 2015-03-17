import java.util.ArrayList;

/**
 * Created by admin on 17.03.2015.
 */
public class HashSet {
    private SortedList[] hashArray;
    private int arraySize;

    public HashSet() {
        this.arraySize = 10;
        this.hashArray = new SortedList[arraySize];
        for (int j=0; j<arraySize; j++)
            hashArray[j] = new SortedList();
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void add(Link theLink){
        int key = theLink.getKey();
        int hashVal = hashFunc(key);
        hashArray[hashVal].add(theLink);
    }

    public Link contains(int key){
        int hashval = hashFunc(key);
        Link theLink = hashArray[hashval].contains(key);
        return theLink;
    }

    public void display(){
        for (int j=0; j<arraySize; j++){
            System.out.print(j + ". ");
            hashArray[j].displayList();
        }
    }
}
