import java.util.Scanner;

public class ArrayElementSearch {

  public static int linearSearch(int arr[], int key) {
    int index;
    for (index = 0; index < arr.length; index++) {
      if (arr[index] == key) {
        return index;
      }
    }
    return -1;
  }

  public static int binarySearch(int arr[], int key) {
    int max = arr.length - 1;
    int min = 0;
    while (min <= max) {
      int mid = min + (max - min) / 2;
      if (arr[mid] == key) {
        return mid;
      }

      if (arr[mid] < key) {
        min = mid + 1;
      } else {
        max = mid - 1;
      }
    }
    return -1;
  }

  public static int binarySearchRecursion(
    int arr[],
    int low,
    int high,
    int key
  ) {
    if (high >= low) {
      int mid = low + (high - low) / 2;
      if (arr[mid] == key) {
        return mid;
      }
      if (arr[mid] > key) {
        return binarySearchRecursion(arr, low, mid - 1, key);
      }
      if (arr[mid] < key) {
        return binarySearchRecursion(arr, mid + 1, high, key);
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of an array: ");
    int size = sc.nextInt();
    int arr[] = new int[size];

    System.out.println("Enter element in an array");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter key to find");
    int key = sc.nextInt();

    System.out.println("Print Array");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    System.out.println();
    //Linear Search
    // System.out.println("Element found at index : " + linearSearch(arr, key));
    //Binary Search
    // System.out.println("Element found at index : " +binarySearch(arr, key));
    //Binary Search Recursion
    System.out.println(
      "Element found at index : " + binarySearchRecursion(arr, 0, size - 1, key)
    );
  }
}
