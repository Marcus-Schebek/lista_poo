class Node:
    def __init__(self, value):
        self.value = value
        self.next = None

class Lista:
    def __init__(self):
        self.size = 0

    def get_size(self):
        return self.size

    def set_size(self, v):
        self.size = v

    def insere(self, value):
        pass 
    def retira(self, value):
        pass 
    def primeiro(self):
        pass 
    def ultimo(self):
        pass

class ListaEncadeada(Lista):
    def __init__(self):
        super().__init__()
        self.inicio = None

    def insere(self, value):
        new_node = Node(value)
        new_node.next = self.inicio
        self.inicio = new_node
        self.set_size(self.get_size() + 1)

    def retira(self, value):
        if self.inicio is None:
            return

        node_atual = self.inicio
        node_anterior = None

        while node_atual is not None:
            if node_atual.value == value:
                if node_anterior is None:
                    self.inicio = node_atual.next
                else:
                    node_anterior.next = node_atual.next
                self.set_size(self.get_size() - 1)
                return
            node_anterior = node_atual
            node_atual = node_anterior.next

    def primeiro(self):
        if self.get_size() == 0 or self.inicio is None:
            return -1
        return self.inicio.value

    def ultimo(self):
        if self.get_size() == 0 or self.inicio is None:
            return -1
        no_atual = self.inicio
        while no_atual.next is not None:
            no_atual = no_atual.next
        return no_atual.value


# Teste
lista_encadeada = ListaEncadeada()

# Inserindo elementos na lista
lista_encadeada.insere(10)
lista_encadeada.insere(20)
lista_encadeada.insere(30)

# Imprimindo o primeiro e último elemento
print("Primeiro elemento:", lista_encadeada.primeiro())
print("Último elemento:", lista_encadeada.ultimo())

# Removendo um elemento
lista_encadeada.retira(20)

# Imprimindo o tamanho da lista após a remoção
print("Tamanho da lista após a remoção:", lista_encadeada.get_size())

# Imprimindo o primeiro e último elemento após a remoção
print("Primeiro elemento:", lista_encadeada.primeiro())
print("Último elemento:", lista_encadeada.ultimo())
