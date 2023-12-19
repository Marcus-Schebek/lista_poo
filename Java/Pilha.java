public class Pilha extends Lista {
    private Node inicio;
    public Pilha(){
        this.inicio = null;
    }

    @Override
    public void insere(int value) {
        // Inserir no topo da pilha (push)
        Node newNode = new Node(value);
        newNode.setNext(this.inicio);
        this.inicio = newNode;
        this.setSize(this.getSize() + 1);
    }
    
    @Override
    public void retira() {
        // Retirar do topo da pilha (pop)
        if (this.inicio != null) {
            this.inicio = this.inicio.getNext();
            this.setSize(this.getSize() - 1);
        }
    }

    @Override
    public int primeiro() {
        // Retorna o topo da pilha
        if (this.getSize() == 0) {
            return -1;
        }
        return this.inicio.getValue();
    }

    @Override
    public int ultimo() {
        // Não é relevante para uma pilha, pode retornar -1 ou lançar uma exceção
        return -1;
    }

    @Override
    public void retira(int value) {
        throw new UnsupportedOperationException("Unimplemented method 'retira'");
    }
}
