package homeWork2.statsAccumulator;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulatorImpl numbers = new StatsAccumulatorImpl();
        numbers.add(5);
        numbers.add(2);
        numbers.add(12);
        numbers.add(-9);
        System.out.println(numbers.getNumbers());
        System.out.println(numbers.getCount());
        System.out.println(numbers.getMin());
        System.out.println(numbers.getMax());
        System.out.println(numbers.getAvg());
    }
}
