class Nestedif {
    public static void main(String[] args) {
        int month = 7;
        if (month >= 1 && month <= 12) {
            if (month >= 3 && month <= 5) {
                System.out.println("It's spring!");
            } else if (month >= 6 && month <= 8) {
                System.out.println("It's summer!");
            } else if (month >= 9 && month <= 11) {
                System.out.println("It's autumn!");
            } else {
                System.out.println("It's winter!");
            }
        } else {
            System.out.println("Invalid month");
        }
    }
}