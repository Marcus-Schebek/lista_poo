mod node;
mod lista;

use lista::ListaEncadeada;

fn main() {
    let mut lista = ListaEncadeada::new();

    // Inserindo elementos na lista
    lista.insere(10);
    lista.insere(20);
    lista.insere(30);

    println!("Primeiro elemento: {:?}", lista.primeiro());
    println!("Último elemento: {:?}", lista.ultimo());

     lista.retira(20);  

    println!("Primeiro elemento: {:?}", lista.primeiro());
    println!("Último elemento: {:?}", lista.ultimo());
}