#ifndef LISTA_H
#define LISTA_H

class Lista {
protected:
    int size;

public:
    Lista();
    int get_size() const;
    void set_size(int v);
    virtual void insere(int value) = 0;
    virtual void retira(int value) = 0;
    virtual int primeiro() = 0;
    virtual int ultimo() = 0;
};

#endif // LISTA_H
/*  Acabei encontrando uma correlação entre o virtual em C++ e o abstract em Java, Fonte Utilizada: https://pt.wikibooks.org/wiki/Programar_em_C%2B%2B/Polimorfismo"*/