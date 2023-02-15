class DisplayMessage {
  void printMessage() {
   System.out.println("Hello My Message");
}
} 
class  MyProgram1 extends DisplayMessage
  {
    public static void main(String arg[]){
      MyProgram1 program=new MyProgram1();
      program.printMessage();
   }
}

