///**
// * Created by admin on 17.03.2015.
// */
//public class SortedList {
//    private Link first;
//
//    public SortedList() {
//        this.first = null;
//    }
//
//    public void add(Link theLink){
//        int key = theLink.getKey();
//        Link previous = null;
//        Link current = first;
//
//        while (current != null){
//            previous =current;
//            current = current.next;
//        }
//        if(previous == null)
//            first = theLink;
//        else
//            previous.next = theLink;
//        theLink.next = current;
//    }
//
//    public Link contains(int key){
//        Link current = first;
//        while (current != null){
//            if(current.getKey() == key)
//                return current;
//            current = current.next;
//        }
//        return null;
//    }
//
//    public void displayList(){
//        Link current = first;
//        while (current != null){
//            current.displayLink();
//            current = current.next;
//        }
//        System.out.println("");
//    }
//}
