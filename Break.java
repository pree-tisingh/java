 class Break{
    public static void main(String[] args) {
        int Val = 5;
        for (int i = 1; i <= 10; i++) {
            if (i == Val) {
                System.out.println("Value found: " + Val);
                break; 
            }
        }
    }
}
