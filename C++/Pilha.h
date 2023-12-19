// Pilha.h
#pragma once
#include "Lista.h"
#include "Node.h"

class Pilha : public Lista {
private:
    Node* top;  // Ponteiro para o topo da pilha

public:
    Pilha();
    void insere(int value) override;
    void retira(int value) override;
    int primeiro() override;
    int ultimo() override;
};