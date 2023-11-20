public class Main{
    public static void main(String arg[]){
        
        ListaEncadeada listaEncadeada = new ListaEncadeada();

        // Inserindo elementos na lista
        listaEncadeada.insere(10);
        listaEncadeada.insere(20);
        listaEncadeada.insere(30);

        // Imprimindo o primeiro e último elemento
        System.out.println("Primeiro elemento: " + listaEncadeada.primeiro());
        System.out.println("Último elemento: " + listaEncadeada.ultimo());

        // Removendo um elemento
        listaEncadeada.retira(20);

        // Imprimindo o tamanho da lista após a remoção
        System.out.println("Tamanho da lista após a remoção: " + listaEncadeada.getSize());

        // Imprimindo o primeiro e último elemento após a remoção
        System.out.println("Primeiro elemento: " + listaEncadeada.primeiro());
        System.out.println("Último elemento: " + listaEncadeada.ultimo());
    }
}