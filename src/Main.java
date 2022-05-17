import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> aPilha = new Stack<>();
        new Empilhadeira(aPilha,25000);
        System.out.println(aPilha);
        ArrayList<Thread> des = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Thread th = new Desempilhadeira(aPilha,"th"+i);
            des.add(th);
            th.start();
        }
    }
}
