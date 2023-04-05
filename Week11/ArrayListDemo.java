import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> listOfNames;
        ArrayList<Character> party;

        listOfNames = new ArrayList<String>();

        listOfNames.add("Bond");
        listOfNames.add("Dave");
        listOfNames.add("Kae");

        for (String name : listOfNames){
            System.out.println(name);
        }
        System.out.println("==========================");

        party = new ArrayList<Character>();

        party.add(new Character("Arru", 17, 10));
        party.add(new Character("Dovakhin", 22, 22));
        party.add(new Character("Vesper", 12, 13));

        for(Character member : party) {
           System.out.println(member.getName()); 
        }
    }
}
