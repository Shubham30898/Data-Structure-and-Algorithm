public class ArrayAppBasics {

  public static void main(String[] args) {
    // both are valid declarations
    // int intArray[];
    // or int[] intArray;

    // allocating memory to array
    // intArray = new int[20];

    // Declaring array literal
    // int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 };

    //array declaration with size 10
    int arr[] = new int[10];

    //insertion
    for (int i = 0; i < arr.length; i++) {
      arr[i] = i;
    }

    //printing an array
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();


    //searching
    int key = 11;
    for (int i = 0; i < arr.length; i++) {
      if (key == arr[i]) {
        System.out.print(key + " : found at index " + i);
        break;
      }
      if (i == arr.length - 1) {
        System.out.println("Key is not found");
      }
    }

    //deleting
    int index = 0;
    int anotherArray[] = new int[arr.length - 1];
    for (int i = 0, k = 0; i < arr.length; i++) {
      if(i == index){
        continue;
      }
      anotherArray[k++] = arr[i];
    }
    for (int i = 0; i < anotherArray.length; i++) {
      System.out.print(anotherArray[i] + " ");
    }
  }
}
