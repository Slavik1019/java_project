import java.util.Arrays;
public class merge {
  
    public static void main(String[] args) {
      
      // Пример сортировки слиянием
      int[] arr1 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      MergeSort.mergeSort(arr1);
      System.out.println("Метод слияния: " + Arrays.toString(arr1));
      
      // Пример сортировки выборкой
      int[] arr2 = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
      SelectionSort.selectionSort(arr2);
      System.out.println("Метод выборки: " + Arrays.toString(arr2));
    }
  }
  
  class MergeSort {
    
    public static void mergeSort(int[] array) {
      if (array.length > 1) {
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
      }
    }
  
    private static void merge(int[] array, int[] left, int[] right) {
      int i = 0;
      int j = 0;
      int k = 0;
      while (i < left.length && j < right.length) {
        if (left[i] < right[j]) {
          array[k] = left[i];
          i++;
        } else {
          array[k] = right[j];
          j++;
        }
        k++;
      }
      while (i < left.length) {
        array[k] = left[i];
        i++;
        k++;
      }
      while (j < right.length) {
        array[k] = right[j];
        j++;
        k++;
      }
    }
  }
  
  class SelectionSort {
    
    public static void selectionSort(int[] array) {
      for (int i = 0; i < array.length - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < array.length; j++) {
          if (array[j] < array[minIndex]) {
            minIndex = j;
          }
        }
        int temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
  }