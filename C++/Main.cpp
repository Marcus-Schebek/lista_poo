#include <iostream>
#include "ListaEncadeada.h"

int main() {
    ListaEncadeada listaEncadeada;

   
    listaEncadeada.insere(10);
    listaEncadeada.insere(20);
    listaEncadeada.insere(30);

   
    std::cout << "Primeiro elemento: " << listaEncadeada.primeiro() << std::endl;
    std::cout << "Último elemento: " << listaEncadeada.ultimo() << std::endl;

   
    listaEncadeada.retira(20);

    
    std::cout << "Tamanho da lista após a remoção: " << listaEncadeada.get_size() << std::endl;

    
    std::cout << "Primeiro elemento: " << listaEncadeada.primeiro() << std::endl;
    std::cout << "Último elemento: " << listaEncadeada.ultimo() << std::endl;

    return 0;
}
