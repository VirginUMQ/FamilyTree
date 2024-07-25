import java.util.ArrayList;
import java.util.Iterator;

public class HumanIterator implements Iterator<Human>{
    
    private int index;
    private ArrayList<Human> HumansFamily;
    
    public HumanIterator(ArrayList<Human> HumansFamily){
        this.HumansFamily = HumansFamily;
    }

    
    @Override
    public boolean hasNext() {
        return this.HumansFamily.size() > index;
    }

    @Override
    public Human next() {
        return HumansFamily.get(index++);
    }
    



}
