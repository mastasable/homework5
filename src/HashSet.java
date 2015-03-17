import java.util.ArrayList;

/**
 * Created by admin on 17.03.2015.
 */
public class HashSet {
    private ArrayList<Integer>[] hashArray;
    private int arraySize;

    public HashSet() {
        this.arraySize = 10;
        this.hashArray = new ArrayList[arraySize];
        for (int j=0; j<arraySize; j++)
            hashArray[j] = new ArrayList<Integer>();
    }

    public int hashFunc(int key){
        return key % arraySize;
    }

    public void add(int val){
        int key = val;
        int hashVal = hashFunc(key);
        hashArray[hashVal].add(val);
    }

    public boolean contains(int key){
        int hashval = hashFunc(key);
        boolean isCon = hashArray[hashval].contains(key);
        return isCon;
    }

    public void display(){
        for (int j=0; j<arraySize; j++){
            System.out.print(j + ". ");
            System.out.print(hashArray[j] + "\n");
        }
    }
}
