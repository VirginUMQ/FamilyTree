import java.util.Comparator;

public class ComparatorBirthDate implements Comparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {

        return o1.getYearBirth().getYear() - o2.getYearBirth().getYear();

    }



    
    
}
