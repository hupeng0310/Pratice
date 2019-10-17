package demo.Collection;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args){
        Vector<String> vector =new Vector<String>(10);
        vector.addAll(vector);
        for(int i = 0;i < 10;i++){
            vector.add(Integer.toString(i+1));
        }
        vector.remove(0);
        Iterator<String> iterator = vector.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
