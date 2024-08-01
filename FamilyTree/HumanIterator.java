import java.util.ArrayList;
import java.util.Iterator;

public class HumanIterator<E extends KriteriiFT> implements Iterator<E>{
    
    private int index;
    private ArrayList<E> HumansFamily;
    
    public HumanIterator(ArrayList<E> HumansFamily){
        this.HumansFamily = HumansFamily;
    }

    
    @Override
    public boolean hasNext() {
        return this.HumansFamily.size() > index;
    }

    @Override
    public E next() {
        return HumansFamily.get(index++);
    }
    



}
