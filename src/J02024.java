public class J02024{

    static int OddLengthSum(int[] arr) {

        int sum = 0;

        int l = arr.length;

        for(int i = 0; i < l; i++) {

            for(int j = i; j < l; j += 2) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.println();
            }
        }
        return sum;
    }

    public static void main (String[] args) {

        int[] arr = {2,3,4,5};

        System.out.print(OddLengthSum(arr));
    }
}

