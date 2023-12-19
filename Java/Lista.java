/* Para aplicar conceitos de POO como herança e polimorfismo decidi fazer que a estrutura da classe seguisse uma lógica onde criei
 uma classe abstrata chamada lista onde que conterá métodos comuns a todas os tipos de listas (encadeadas, duplamente encadeadas, pilhas ou filas)
 E que por sua vez será implementada de forma diferente seguindo as requisições do tipos Abstrato de dado.
*/
public abstract class Lista{ 
    protected int size;
    public Lista(){
        this.size = 0;
    }
    public int getSize(){ //Já que a lista tem tamanho como atributo eu apenas retornarei ele fiz um getter. Equivalente ao int size()
        return this.size;
    }
    public void setSize(int v){ //Isso irá me auxiliar nas funções futuras
        this.size = v;
    }
    public abstract void insere(int value);
    public void retira() {
        throw new UnsupportedOperationException("retira() without a parameter is not supported");
    }
    public abstract void retira(int value); //Modificação dos requisitos, aqui ele fará uma procura pelo value e retirará da lista, caso não encontre só será retornado um erro;
    public abstract int primeiro();
    public abstract int ultimo();
}

/*O uso de classes/métodos abstratas saiu da leitura do seguinte material: https://www.devmedia.com.br/polimorfismo-classes-abstratas-e-interfaces-fundamentos-da-poo-em-java/26387 */