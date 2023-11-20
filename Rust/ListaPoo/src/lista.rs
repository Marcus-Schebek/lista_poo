use crate::node::Node;

pub struct ListaEncadeada {
    pub inicio: Option<Box<Node>>,
}

impl ListaEncadeada {
    pub fn new() -> Self {
        ListaEncadeada { inicio: None }
    }

    pub fn insere(&mut self, value: i32) {
        let mut new_node = Box::new(Node::new(value));
        new_node.next = self.inicio.take(); // Função take()serve para zerar o espaço em do nó, e depois aloca o mesmo com o novo valor no final
        self.inicio = Some(new_node);
    }

    pub fn retira(&mut self, value: i32) {

         if let Some(ref mut inicio) = self.inicio {
            if inicio.value == value {
                self.inicio = inicio.next.take();
                return; // Valor removido
            }
        }

        let mut current = &mut self.inicio;
        while let Some(ref mut node) = *current {
            if let Some(ref mut next_node) = node.next {
                if next_node.value == value {
                    node.next = next_node.next.take();
                    return;
                }
            }
            current = &mut node.next;
        }
    }

    pub fn primeiro(&self) -> Option<i32> {
        Some(self.inicio.as_ref()?.get_value())
    }

    pub fn ultimo(&self) -> Option<i32> {
        let mut current = &self.inicio;
        while let Some(node) = current {
            if node.next.is_none() {
                return Some(node.value);
            }
            current = &node.next;
        }
        None
    }
}
