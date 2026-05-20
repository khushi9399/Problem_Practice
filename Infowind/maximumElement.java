class MaximumElement {
    public static void main(String[] args) {
        int arr[] = {9, 22, 1,8};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
    }
}

