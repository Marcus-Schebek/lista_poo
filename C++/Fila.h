#pragma once
#include "Lista.h"
#include "Node.h"

class Fila : public Lista {
private:
    Node* front;  // Ponteiro para o início da fila
    Node* rear;   // Ponteiro para o final da fila

public:
    Fila();
    void insere(int value) override;
    void retira(int value) override;
    int primeiro() override;
    int ultimo() override;
};