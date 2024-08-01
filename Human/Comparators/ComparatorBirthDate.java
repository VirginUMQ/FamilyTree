import java.util.Comparator;

public class ComparatorBirthDate<E extends KriteriiFT> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        if (o1.getYearBirth().getYear() - o2.getYearBirth().getYear() != 0){
            return o1.getYearBirth().getYear() - o2.getYearBirth().getYear();
        }
        if (o1.getYearBirth().getMonthValue() - o2.getYearBirth().getMonthValue() != 0) {
            return o1.getYearBirth().getMonthValue() - o2.getYearBirth().getMonthValue();
        } 
        return o1.getYearBirth().getDayOfMonth() - o2.getYearBirth().getDayOfMonth();

    }



    
    
}
