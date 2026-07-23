class Step02_Literals {
    public static void main(String[] args) {
        byte b = 127;
        short s = 4254;
        int i = 1213452463;
        long l = 1273573885456456556l;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        
        float f = 55.6f;
        double d = 55.66;
        System.out.println(f);
        System.out.println(d);
        
        char ch = 'c';
        boolean bool = true;   
        System.out.println(ch);
        System.out.println(bool);
        
        int num1 = 6*5-34/2;
        int num2 = 6/5-34*2;
        System.out.println(num1);
        System.out.println(num2);
        
        System.out.format("The Value of Num1: %d and num2: %d\n", num1, num2);
        System.out.println(args[1]);
    }  
}
