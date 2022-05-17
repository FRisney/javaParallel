import java.util.Stack;

public class Desempilhadeira extends Thread{
    Stack<Integer> pilha;

    public Desempilhadeira(Stack<Integer> pilha,String name){
        this.pilha = pilha;
        this.setName(name);
    }

    @Override
    public void run() {
        while (this.pilha.size() > 0)
            System.out.println(this.getName()+": "+this.pilha.pop());
    }
}
