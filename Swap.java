public class Swap {
    public static void main(String[] args) {
        int number = 67;
        int anotherNumber = 23;
        int temp = number;
        number = anotherNumber;
        anotherNumber = temp;
        System.out.println(anotherNumber);
        System.out.println(number);
    }
}
