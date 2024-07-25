import java.io.Serializable;
import java.security.AllPermission;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


import Writer.FileHandler;

public class main {


public static void main(String[] args) {
    
    FamilyTree f1 = FamilyFirst();  // создать новое дерево
    //FamilyTree f1 = readFamilyTree(); // прочитать дерево из файла

    saveFamilyTree(f1);

    System.out.println(f1);
    for (Human h: f1.getHumansFamily()){
        System.err.print(h);}

    f1.sortName();

    System.out.println("\n\n\n[!][!][!]Сортировка по именам[!][!][!]");
    System.out.println(f1);
    for (Human h: f1.getHumansFamily()){
        System.err.print(h); }

        f1.sortBirthYear();

    System.out.println("\n\n\n[!][!][!]Сортировка по году рождения[!][!][!]");
    System.out.println(f1);
    for (Human h: f1.getHumansFamily()){
        System.err.print(h); }



}

private static FamilyTree readFamilyTree(){
    FileHandler fileHandler = new FileHandler();
    return (FamilyTree) fileHandler.read(); // (FamilyTree) - каст, преобразование ссылочных типов
}

private static void saveFamilyTree(FamilyTree f1) {
    FileHandler fileHandler = new FileHandler();
    fileHandler.save(f1);
}





public static FamilyTree FamilyFirst() { 

    FamilyTree F1 = new FamilyTree("Соколовы");

    Human h1 = new Human(F1.CreateHumanID(), "Иван", LocalDate.of(2000, 1, 1), Gender.Male);
    F1.addHumansFamily(h1);

    Human h1_1 = new Human(F1.CreateHumanID(), "Маша", LocalDate.of(2002, 2, 2), Gender.Female);
    F1.addHumansFamily(h1_1);
    
    Human h2 = new Human(F1.CreateHumanID(), "Петр Папа Ивана и Маши", LocalDate.of(1970, 10, 10), Gender.Male);
    F1.addHumansFamily(h2);

    Human h3 = new Human(F1.CreateHumanID(), "Наталья Мама Ивана и Маши", LocalDate.of(1980, 11, 11), Gender.Female);
    F1.addHumansFamily(h3);

    Human h2_1 = new Human(F1.CreateHumanID(), "Василий Папа Петра", LocalDate.of(1950, 3, 3), LocalDate.of(2020, 3, 3), Gender.Male);
    F1.addHumansFamily(h2_1);

    Human h2_2 = new Human(F1.CreateHumanID(), "Василиса Мама Петра", LocalDate.of(1951, 4, 4), LocalDate.of(2022, 4, 4), Gender.Female);
    F1.addHumansFamily(h2_2);

    Human h3_1 = new Human(F1.CreateHumanID(), "Василий Папа Натальи", LocalDate.of(1952, 3, 3), LocalDate.of(2019, 3, 3), Gender.Male);
    F1.addHumansFamily(h3_1);

    Human h3_2 = new Human(F1.CreateHumanID(), "Василиса Мама Натальи", LocalDate.of(1953, 5, 5), LocalDate.of(2023, 3, 3), Gender.Female);
    F1.addHumansFamily(h3_2);

    h1.setFather(h2);
    h1.setMother(h3);  
    h1_1.setFather(h2);
    h1_1.setMother(h3);


    h2.setFather(h2_1);
    h2.setMother(h2_2);

    h3.setFather(h3_1);
    h3.setMother(h3_2);

   // System.out.print(h1.setFather(h2));

    // System.out.print(h1.setMother(h3));   
    // System.out.print(h1.setFather(h2));
    // System.out.print(h1.setMother(h3));
    // System.out.print(h1.getParents(h1));


    // System.out.print(F1);
    // for (Human h: F1.getHumansFamily()){
    //     System.err.print(h);
    // }

    //System.out.println(F1.getHumansFamily().toString().replaceAll("^\\[|\\]$","")); // ВСЕ
    // System.out.println(F1.getHumansFamily().get(0));
    // System.out.println(F1.getHumansFamily().get(1));
    // System.out.println(F1.getHumansFamily().get(2));
    // System.out.println(F1.getHumansFamily().get(3));
    // System.out.println(F1.delHuman(h1)); 
    // System.out.println(F1.HumansFamily); 
    return F1;
}












}