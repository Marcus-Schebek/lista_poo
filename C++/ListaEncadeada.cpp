#include "ListaEncadeada.h"

ListaEncadeada::ListaEncadeada() : inicio(nullptr) {}

ListaEncadeada::~ListaEncadeada() {
    Node* current = inicio;
    while (current != nullptr) {
        Node* next = current->next;
        delete current;
        current = next;
    }
}

void ListaEncadeada::insere(int value) {
    Node* newNode = new Node(value);
    newNode->next = inicio;
    inicio = newNode;
    set_size(get_size() + 1);
}

void ListaEncadeada::retira(int value) {
    if (inicio == nullptr) {
        return;
    }

    Node* current = inicio;
    Node* previous = nullptr;

    while (current != nullptr) {
        if (current->value == value) {
            if (previous == nullptr) {
                inicio = current->next;
            } else {
                previous->next = current->next;
            }
            set_size(get_size() - 1);
            delete current;
            return;
        }
        previous = current;
        current = previous->next;
    }
}

int ListaEncadeada::primeiro() {
    if (get_size() == 0 || inicio == nullptr) {
        return -1;
    }
    return inicio->value;
}

int ListaEncadeada::ultimo() {
    if (get_size() == 0 || inicio == nullptr) {
        return -1;
    }

    Node* current = inicio;
    while (current->next != nullptr) {
        current = current->next;
    }

    return current->value;
}
