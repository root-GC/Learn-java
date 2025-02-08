package learnJava;

public class Main {

     public static void main(String game[]) {
          Greeting greeting2 = new Greeting();
          Greeting greeting = new Greeting() { // Anonnymus inner class
               @Override
               public void Welcome() {
                    // 1. Eh como se estivessimos a sobrescrever aquele metodo da classe
                    // Ideal para criar modificacoes de um unico objecto
                    System.out.println("Yo, bro!");
               }
          };
          greeting.Welcome();// output: Yo,bro!
          greeting2.Welcome(); // output: Hello world
          ////////////////////////////////
          /// ///////////////////////
          /// anonnymus inner class for listeners
          ///
          ///

          new MyFrame();
     }

}
