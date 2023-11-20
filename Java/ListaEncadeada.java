/*  Lista encadeada em Java como uma subclasse de Lista */
/* Usei como base de polimorfismo em java o seguinte link: https://www.devmedia.com.br/uso-de-polimorfismo-em-java/26140 */

public class ListaEncadeada extends Lista{
    private Node inicio;
    public ListaEncadeada(){
        this.inicio = null;
    }

    @Override
    public void insere(int value){
        Node newNode = new Node(value);
        newNode.setNext(this.inicio);
        this.inicio = newNode;
        this.setSize(this.getSize() + 1);
    }

    @Override
    public void retira(int value) {
        if (this.inicio == null) {
            return;
        }
        Node nodeAtual = this.inicio;
        Node nodeAnterior = null;
        int size = this.getSize();
        while(nodeAtual != null){
            if(nodeAtual.getValue() == value){
                if(nodeAnterior == null){ //caso especial se estiver no inicio da lista
                    this.inicio.setNext(nodeAtual.getNext());
                } else{
                    nodeAnterior.setNext(nodeAtual.getNext());
                }
                this.setSize(size--);
                return;
            }
            nodeAnterior = nodeAtual;
            nodeAtual = nodeAnterior.getNext();
        }
    }

    @Override
    public int primeiro(){
        if(this.getSize() == 0){
            return -1;   
        }
        return this.inicio.getValue();
    }

    @Override
    public int ultimo(){
        if(this.getSize() == 0){
            return -1;   
        }
        Node noAtual = this.inicio;
        while (noAtual.getNext() != null) {
            noAtual = noAtual.getNext();
        }

        return noAtual.getValue();
    }

 
}