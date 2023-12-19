#include "Fila.h"

Fila::Fila() : Lista(), front(nullptr), rear(nullptr) {}


void Fila::insere(int value) {
    // Adiciona um elemento no final da fila
    Node* novo = new Node(value);
    if (rear == nullptr) {
        // Se a fila estiver vazia, o novo nó é o primeiro da fila
        front = novo;
        rear = novo;
    } else {
        // Caso contrário, adiciona no final da fila
        rear->next = novo;
        rear = novo;
    }
}

void Fila::retira(int value) {
    if (front == nullptr) {
        // Fila vazia
        return;
    }

    if (front == rear) {
        // Remover o único elemento na fila
        delete front;
        front = nullptr;
        rear = nullptr;
    } else {
        // Encontrar o penúltimo nó
        Node* temp = front;
        while (temp->next != rear) {
            temp = temp->next;
        }

        // Remover o último elemento
        delete rear;
        rear = temp;
        rear->next = nullptr;
    }
}


int Fila::primeiro() {
    if (front == nullptr) {
        return -1; 
    }

    return front->value;
}

int Fila::ultimo() {
    if (rear == nullptr) {
        return -1;
    }

    return rear->value;
}