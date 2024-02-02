 class Forloop {
    public static void main(String[] args) {
        int Row = 5;
        System.out.println("Printing a pattern using nested for loops:");
        for (int i = 1; i <=Row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
