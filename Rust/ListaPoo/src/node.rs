pub struct Node{
    pub value: i32,
    pub next: Option<Box<Node>>, //Aqui eu tive que quebrar a cabeça, Option é pq Next pode existir ou ser nulo, agora Box é porque preciso armazenar um ponteiro do tipo Node na heap;
}
/* Entendendo Box e ponteiros em Rust: https://doc.rust-lang.org/book/ch15-01-box.html*/

impl Node{
    pub fn new(value: i32) -> Self{
        Node {value, next: None}
    }
}