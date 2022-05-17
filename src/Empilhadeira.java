import java.util.Random;
import java.util.Stack;

public class Empilhadeira{
    public Empilhadeira(Stack<Integer> pilha,Integer iteracoes){
        for (int i = 0; i < iteracoes; i++) {
            pilha.push(i);
        }
    }
}
