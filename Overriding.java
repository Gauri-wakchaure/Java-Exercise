class Overriding {
    public static void main(String[] args) {
        Animal a1 = new Dog();      
          a1.sound();
    }                   
 }

class Animal {
    
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog Barks");
    }
}