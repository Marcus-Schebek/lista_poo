#include "Pilha.h"

Pilha::Pilha() : Lista(), top(nullptr) {}


void Pilha::insere(int value) {
    // Adiciona um elemento no topo da pilha
    Node* novo = new Node(value);
    novo->next = top;
    top = novo;
}

void Pilha::retira(int value) {
    if (top == nullptr) {
        // Pilha vazia
        return;
    }
        Node* temp = top;
        top = top->next;
        delete temp;
}

int Pilha::primeiro() {
    if (top == nullptr) {
        return -1; // Ou algum valor indicando erro/vazio
    }

    return top->value;
}

int Pilha::ultimo() {
    if (top == nullptr) {
        // Pilha vazia
        return -1;
    }

    Node* temp = top;
    while (temp->next != nullptr) {
        temp = temp->next;
    }

    return temp->value;
}