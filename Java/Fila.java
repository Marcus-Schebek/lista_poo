public class Fila extends Lista {
    private Node fim;
    private Node inicio;

    public Fila() {
        this.fim = null;
        this.inicio = null;
    }

    @Override
    public void insere(int value) {
        // Inserir no final da fila (enqueue)
        Node newNode = new Node(value);
        if (this.fim == null) {
            this.inicio = newNode;
            this.fim = newNode;
        } else {
            this.fim.setNext(newNode);
            this.fim = newNode;
        }
        this.setSize(this.getSize() + 1);
    }

    @Override
    public void retira(int value) {
        // Retirar do início da fila (dequeue)
        if (this.inicio != null && this.inicio.getValue() == value) {
            this.inicio = this.inicio.getNext();
            this.setSize(this.getSize() - 1);
        }
    }

    @Override
    public int primeiro() {
        // Retorna o início da fila
        if (this.getSize() == 0) {
            return -1;
        }
        return this.inicio.getValue();
    }

    @Override
    public int ultimo() {
        // Retorna o final da fila
        if (this.getSize() == 0) {
            return -1;
        }
        return this.fim.getValue();
    }
}
