 class ROperator{
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        if (num1 == num2) {
            System.out.println("Both are Equal");
        } 
        else {
            System.out.println("Both are not equal");
        }

        if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is not less than " + num2);
        }

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        }
        else {
            System.out.println(num1 + " is not greater than " + num2);
        }
    }
}