public class Main {
    public static void main(String[] args) {

        // Testando ListaEncadeada (original)
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        // Inserindo elementos na lista
        listaEncadeada.insere(10);
        listaEncadeada.insere(20);
        listaEncadeada.insere(30);

        // Imprimindo o primeiro e último elemento
        System.out.println("ListaEncadeada - Primeiro elemento: " + listaEncadeada.primeiro());
        System.out.println("ListaEncadeada - Último elemento: " + listaEncadeada.ultimo());

        // Removendo um elemento
        listaEncadeada.retira(20);

        // Imprimindo o tamanho da lista após a remoção
        System.out.println("ListaEncadeada - Tamanho da lista após a remoção: " + listaEncadeada.getSize());

        // Imprimindo o primeiro e último elemento após a remoção
        System.out.println("ListaEncadeada - Primeiro elemento: " + listaEncadeada.primeiro());
        System.out.println("ListaEncadeada - Último elemento: " + listaEncadeada.ultimo());

        // Testando Pilha
        Pilha pilha = new Pilha();

        // Inserindo elementos na pilha
        pilha.insere(40);
        pilha.insere(50);
        pilha.insere(60);

        // Imprimindo o topo da pilha
        System.out.println("Pilha - Topo da pilha: " + pilha.primeiro());

        // Removendo um elemento da pilha
        pilha.retira();

        // Imprimindo o tamanho da pilha após a remoção
        System.out.println("Pilha - Tamanho da pilha após a remoção: " + pilha.getSize());

        // Imprimindo o topo da pilha após a remoção
        System.out.println("Pilha - Topo da pilha após a remoção: " + pilha.primeiro());

        // Testando Fila
        Fila fila = new Fila();

        // Inserindo elementos na fila
        fila.insere(70);
        fila.insere(80);
        fila.insere(90);

        // Imprimindo o início e o final da fila
        System.out.println("Fila - Início da fila: " + fila.primeiro());
        System.out.println("Fila - Final da fila: " + fila.ultimo());

        // Removendo um elemento da fila
        fila.retira(70);

        // Imprimindo o tamanho da fila após a remoção
        System.out.println("Fila - Tamanho da fila após a remoção: " + fila.getSize());

        // Imprimindo o início e o final da fila após a remoção
        System.out.println("Fila - Início da fila após a remoção: " + fila.primeiro());
        System.out.println("Fila - Final da fila após a remoção: " + fila.ultimo());
    }
}
