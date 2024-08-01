import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;



public class FamilyTree<T extends KriteriiFT> implements Serializable, Iterable<T>{
    private int CreateHumanID = -1;
    private String FamilyName;
    private ArrayList<T> HumansFamily = new ArrayList<T>();

    public FamilyTree(){
        this.FamilyName = "НЕ ЗАДАНО";
    }

    public FamilyTree(String FamilyName){
        this.FamilyName = FamilyName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public String setFamilyName(String newFN) {
        this.FamilyName = newFN;
        return "Фамилия изменена";
    }

    public void sortName(){
        HumansFamily.sort(new ComparatorName<>());
    }

    public void sortBirthYear(){
        HumansFamily.sort(new ComparatorBirthDate<>());
    }

    public int CreateHumanID(){
        CreateHumanID += 1;
        return CreateHumanID;
    }
    


    public ArrayList<T> getHumansFamily() {
        return HumansFamily;
    }

    public String addHumansFamily(T Human) {
        if(this.HumansFamily.contains(Human)){
        return "Человек уже есть в семейном дереве";
        }
        this.HumansFamily.add(Human);
        return "Человек добавлен в семейное дерево";

    }

    public String delHuman(T Human) {
        for (T h: HumansFamily){
            if(h.getID() == Human.getID()) {
                HumansFamily.remove(h);
                return "Человек удален из семейного дерева";
            }
        }
        return "Человека нет в семейном дереве";
    }
    

    @Override
    public String toString() {
        
        return String.format("\nФамилия семьи: %s\nКоличество людей: %d", FamilyName, HumansFamily.size());
    }

    @Override
    public Iterator<T> iterator() {
       return new HumanIterator<>(HumansFamily);
    }
   
    



    
}
