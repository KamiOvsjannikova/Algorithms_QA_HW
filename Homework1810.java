package lesson181023;

public class Homework1810  {

    public static void main(String[] args) {
        int[] nums = new int[]{10, 20, 20, 30, 30, 42, 42, 55, 55, 66, 66};
        System.out.println(brutForce(nums));
        System.out.println(binary(nums));
    }

    private static int brutForce(int[] arr) {
        if (arr[0] != arr[1]) return arr[0];
        if (arr[arr.length - 1] != arr[arr.length - 2]) return arr[arr.length - 1];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] != arr[i - 1] && arr[i] != arr[i + 1]) return arr[i];
        }

        return -1;
    }

    private static int binary(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start != end) {
            int middle = (end - start) / 2 + start;

            if (arr[middle] != arr[middle - 1] && arr[middle] != arr[middle + 1]) return arr[middle];

            int leftCount;
            boolean isDoubleLetterToLeft = arr[middle] == arr[middle - 1];

            if (isDoubleLetterToLeft) {
                leftCount = middle - 1 - start;
            } else {
                leftCount = middle - start;
            }

            if (leftCount % 2 == 1) {
                end = isDoubleLetterToLeft ? middle - 2 : middle - 1;
            } else {
                start = isDoubleLetterToLeft ? middle + 1 : middle + 2;
            }
        }
        return arr[start];
    }

}
