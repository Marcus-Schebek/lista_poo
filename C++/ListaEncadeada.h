#ifndef LISTA_ENCADEADA_H
#define LISTA_ENCADEADA_H

#include "Lista.h"
#include "Node.h"

class ListaEncadeada : public Lista {
private:
    Node* inicio;

public:
    ListaEncadeada();
    ~ListaEncadeada(); // Método destrutor para liberar memória, achei uma ferramente interessante em C++ e tentei implementar: https://learn.microsoft.com/pt-br/cpp/cpp/constructors-cpp?view=msvc-170
    void insere(int value) override;
    void retira(int value) override;
    int primeiro() override;
    int ultimo() override;
};

#endif // LISTA_ENCADEADA_H
