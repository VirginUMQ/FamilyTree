import java.io.Serializable;
import java.util.ArrayList;

public class FamilyTree implements Serializable {
    private int CreateHumanID = -1;
    private String FamilyName;
    private ArrayList<Human> HumansFamily = new ArrayList<Human>();

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



    public int CreateHumanID(){
        CreateHumanID += 1;
        return CreateHumanID;
    }
    


    public ArrayList<Human> getHumansFamily() {
        return HumansFamily;
    }

    public String addHumansFamily(Human Human) {
        if(this.HumansFamily.contains(Human)){
        return "Человек уже есть в семейном дереве";
        }
        this.HumansFamily.add(Human);
        return "Человек добавлен в семейное дерево";

    }

    public String delHuman(Human Human) {
        for (Human h: HumansFamily){
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
   
    



    
}
