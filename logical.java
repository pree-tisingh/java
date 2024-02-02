class relational{
public static void main(String args[]){
     int a=10;
     int b=5;
     int c=7;
     System.out.println(a<b && a<c);
     System.out.println(a<b & a<c);
     System.out.println(a<b && a++<c);
     System.out.println(a);
     System.out.println(a<b & a++<c);
     System.out.println(a);
     System.out.println(a>b || a>c);
     System.out.println(a>b | a>c);
     System.out.println(a>b || a++>c);
     System.out.println(a);
     System.out.println(a>b | a++>c);
     System.out.println(a);
     int m = (a>b)?a:b;  //ternary Operator
     System.out.println(m);
     m+=4;
     System.out.println(m);

}
}