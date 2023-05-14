package homework3.datedmap;

public class DatedMapTest {
    public static void main(String[] args) {
        DatedMapImpl datedMap = new DatedMapImpl();
        datedMap.put("1", "Привет!");
        datedMap.put("2", "Как дела?");
        datedMap.put("3", "Пока!");

        System.out.println(datedMap.get("1"));
        System.out.println(datedMap.get("2"));
        System.out.println(datedMap.get("3"));

        System.out.println(datedMap.containsKey("1"));
        System.out.println(datedMap.containsKey("2"));
        System.out.println(datedMap.containsKey("3"));

        System.out.println(datedMap.keySet());

        datedMap.remove("2");

        System.out.println(datedMap.keySet());

        System.out.println(datedMap.containsKey("2"));

        System.out.println(datedMap.getKeyLastInsertionDate("1"));
        System.out.println(datedMap.getKeyLastInsertionDate("2"));
        System.out.println(datedMap.getKeyLastInsertionDate("3"));
    }
}
