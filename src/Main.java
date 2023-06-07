// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 7, 8};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + ":la so chan\n");
            } else {
                System.out.print(arr[i] + ":la so le\n");
            }
        }

    }
}
