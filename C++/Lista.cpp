#include "Lista.h"

Lista::Lista() : size(0) {}

int Lista::get_size() const {
    return size;
}

void Lista::set_size(int v) {
    size = v;
}
