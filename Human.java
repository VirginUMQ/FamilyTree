import java.io.Serializable;
import java.util.ArrayList;

public class Human implements Serializable {

    private int ID;
    private String name;
    private int yearBirth;
    private int yearDeath;
    private Gender gender;
    private Human father, mother = null;
    private ArrayList<Human> children = new ArrayList<>();


    public Human(int ID, String name, int yearBirth, Gender gender){
        this.ID = ID;
        this.name = name;
        this.yearBirth = yearBirth;
        this.gender = gender;
        
    }
    

    public Human(int ID, String name, int yearBirth, int yearDeath, Gender gender){
        this.ID = ID;
        this.name = name;
        this.yearBirth = yearBirth;
        this.yearDeath = yearDeath;
        this.gender = gender;
        
    }

    public int getID() {
        return ID;
    }
    
    public String setFather(Human father) {
        if (this.father == null) { 
            this.father = father; 
            return setChildren(father); }

        else { return "Отец уже есть\n";}
    }

    public String setMother(Human mother) {
        if (this.mother == null) { this.mother = mother; return setChildren(mother); }
        else { return "Мама уже есть\n";}
    }

    public String setChildren(Human parent){
        parent.children.add(this);
        return "Ребенок добавлен";
    }


    public ArrayList<Human> getParents(){
        ArrayList<Human> parents = new ArrayList<Human>();
        parents.add(this.father);
        parents.add(this.mother);
        return parents;
    }
        
    public ArrayList getChildren(Human human){
        ArrayList Child = new ArrayList<>();
        for(Human child: children){
            Child.add(child.name);
        }
        return Child;
    }

    @Override
    public String toString() {
        StringBuilder SB = new StringBuilder();
        SB.append("\n\nID: ");
        SB.append(ID);
        SB.append("\nИмя: ");
        SB.append(name);
        SB.append("\nГод рождения: ");
        SB.append(yearBirth);
        SB.append("\nГод смерти: ");
        SB.append(yearDeath);
        SB.append("\nПол: ");
        if(gender == Gender.Male) { SB.append("мужской"); }
        else { SB.append("женский"); }
        SB.append("\nПапа: ");
        if (father != null) {SB.append(father.name);}
        else { SB.append("Неизвестно"); }
        SB.append("\nМама: ");
        if (mother != null) {SB.append(mother.name);}
        else { SB.append("Неизвестно"); }
        SB.append("\nДети: ");
        SB.append(getChildren(this).toString().replaceAll("^\\[|\\]$",""));
        
        return SB.toString();
    }
    }
    




    

