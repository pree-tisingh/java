 class Array {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Elements of the array");
        for (int i = 0; i < num.length; i++) //length is the property
        {
            System.out.println(num[i]);
        }
        int sum = 0;

        for (int i = 0; i < num.length; i++) 
        {
            sum += num[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}