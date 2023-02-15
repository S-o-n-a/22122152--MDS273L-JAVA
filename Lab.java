import java.util.*;

public class Lab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Menu: ");
        System.out.println("1. Find Mean Value");
        System.out.println("2. Find Median Value");
        System.out.println("3. Find Mode Value");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                double mean = calculateMean(arr);
                System.out.println("Mean Value: " + mean);
                break;
            case 2:
                double median = calculateMedian(arr);
                System.out.println("Median Value: " + median);
                break;
            case 3:
                int mode = calculateMode(arr);
                System.out.println("Mode Value: " + mode);
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();
    }

    public static double calculateMean(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum / arr.length;
    }

    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr);
        int mid = arr.length / 2;
        if (arr.length % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            return arr[mid];
        }
    }

    public static int calculateMode(int[] arr) {
        int mode = arr[0];
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                mode = arr[i];
                maxCount = count;
            }
        }
        return mode;
    }
}
