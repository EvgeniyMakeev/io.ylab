package homeWork2.statsAccumulator;

public class StatsAccumulatorImpl implements StatsAccumulator{
    private int count = 0;
    private String numbers = "";

    public StatsAccumulatorImpl() {
    }

    public String getNumbers() {
        return numbers;
    }

    @Override
    public void add(int value) {
        numbers = numbers + value + ", ";
        count++;
    }

    @Override
    public int getMin() {
        int minOfNumbers = Integer.MAX_VALUE;
        String[] numbersArr = getNumbers().split(", ");
        int[] numArr = new int[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numArr[i] = Integer.parseInt(numbersArr[i]);
            minOfNumbers = Math.min(minOfNumbers, numArr[i]);
        }
        return minOfNumbers;
    }

    @Override
    public int getMax() {
        int maxOfNumbers = Integer.MIN_VALUE;
        String[] numbersArr = getNumbers().split(", ");
        int[] numArr = new int[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numArr[i] = Integer.parseInt(numbersArr[i]);
            maxOfNumbers = Math.max(maxOfNumbers, numArr[i]);
        }
        return maxOfNumbers;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        double sumOfNumbers = 0;
        String[] numbersArr = getNumbers().split(", ");
        int[] numArr = new int[numbersArr.length];
        for (int i = 0; i < numbersArr.length; i++) {
            numArr[i] = Integer.parseInt(numbersArr[i]);
            sumOfNumbers += numArr[i];
        }
        return sumOfNumbers / count;
    }
}
