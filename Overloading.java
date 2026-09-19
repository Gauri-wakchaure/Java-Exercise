class Overloading {
    public static void main(String[] args) {
        Addition a1 = new Addition();
        a1.add(34,9);
        a1.add(34, 5, 7);                
    }                   
 }

class Addition {
    int a;
    int b;

    public void add(int a, int b){
        System.out.println(a + b);
    }

     public void add(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
