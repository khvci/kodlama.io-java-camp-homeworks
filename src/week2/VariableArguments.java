package week2;

public class VariableArguments {
    public static void main(String[] args) {
        int sum = add(5,3,5,7,8,9,45);
        System.out.println(sum);
    }

    private static int add(int... numbers) {
        int sum = 0;
        for (int i: numbers) {
            sum += i;
        }
        return sum;
    }
}
