class Student_Info {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Gauri";
        s1.age = 22;
        s1.marks = 92;
        s1.printInfo();

        Student s2 = new Student();
        s2.name = "Priya";
        s2.age = 23;
        s2.marks = 80;
        s2.printInfo();
        
    }
}
class Student {
       String name;
       int age;
       int marks;

      public void printInfo(){
          System.out.println(this.name);
          System.out.println(this.age);
          System.out.println(this.marks);
      }
}
