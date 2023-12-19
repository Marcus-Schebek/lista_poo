#include <iostream>
#include "ListaEncadeada.h"
#include "Pilha.h"
#include "Fila.h"

int main() {
    // Teste ListaEncadeada
    ListaEncadeada listaEncadeada;

    listaEncadeada.insere(10);
    listaEncadeada.insere(20);
    listaEncadeada.insere(30);

    std::cout << "ListaEncadeada:\n";
    std::cout << "Primeiro elemento: " << listaEncadeada.primeiro() << std::endl;
    std::cout << "Último elemento: " << listaEncadeada.ultimo() << std::endl;

    listaEncadeada.retira(30);

    std::cout << "Tamanho da lista após a remoção: " << listaEncadeada.get_size() << std::endl;
    std::cout << "Primeiro elemento: " << listaEncadeada.primeiro() << std::endl;
    std::cout << "Último elemento: " << listaEncadeada.ultimo() << std::endl;

    // Teste Pilha
    Pilha pilha;

    pilha.insere(10);
    pilha.insere(20);
    pilha.insere(30);

    std::cout << "\nPilha:\n";
    std::cout << "Primeiro elemento: " << pilha.primeiro() << std::endl;
    std::cout << "Último elemento: " << pilha.ultimo() << std::endl;

    pilha.retira(10);

    std::cout << "Primeiro elemento após a retirada: " << pilha.primeiro() << std::endl;
    std::cout << "Último elemento após a retirada: " << pilha.ultimo() << std::endl;

    // Teste Fila
    Fila fila;

    fila.insere(10);
    fila.insere(20);
    fila.insere(30);

    std::cout << "\nFila:\n";
    std::cout << "Primeiro elemento: " << fila.primeiro() << std::endl;
    std::cout << "Último elemento: " << fila.ultimo() << std::endl;

    fila.retira(20);

    std::cout << "Primeiro elemento após a retirada: " << fila.primeiro() << std::endl;
    std::cout << "Último elemento após a retirada: " << fila.ultimo() << std::endl;

    return 0;
}
