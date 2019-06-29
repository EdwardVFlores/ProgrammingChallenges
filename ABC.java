package programmingchallenges;

import java.util.HashMap;
import java.util.Scanner;

public class ABC {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] num = scanner.nextLine().split(" ");
            int[] numArray = new int[3];
            for(int i=0; i<num.length; i++){
                numArray[i] = Integer.parseInt(num[i]);
            }
            mergeSort(numArray,numArray.length);
            int[] letters = numArray;
            HashMap<Character, Integer> letter = new HashMap<Character,Integer>(){
                {
                    put('A', letters[0]);
                    put('B', letters[1]);
                    put('C', letters[2]);
                }
            };
            char[] givenLetters = scanner.nextLine().toCharArray();
            String answer = "";
            for(char c : givenLetters){
                answer += letter.get(c) + " ";
            }
            System.out.println(answer.substring(0,answer.length()-1));
        }
        public static void mergeSort(int[] a, int n) {
            if (n < 2) {
                return;
            }
            int mid = n / 2;
            int[] l = new int[mid];
            int[] r = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = a[i];
            }
            for (int i = mid; i < n; i++) {
                r[i - mid] = a[i];
            }
            mergeSort(l, mid);
            mergeSort(r, n - mid);

            merge(a, l, r, mid, n - mid);
        }
        public static void merge(
        int[] a, int[] l, int[] r, int left, int right) {

          int i = 0, j = 0, k = 0;
          while (i < left && j < right) {
              if (l[i] <= r[j]) {
                  a[k++] = l[i++];
              }
              else {
                  a[k++] = r[j++];
              }
          }
          while (i < left) {
              a[k++] = l[i++];
          }
          while (j < right) {
              a[k++] = r[j++];
          }
      }
}