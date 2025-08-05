package interfacesNlambda.keyword.keywords;

class Client {

    private String name;
    private int age;
    private Adress adress;
    //Funciona pq estão no mesmo package
    //E isso funciona pra metodos tb, caso o getName não esteja public por exemplo
    //Se eu fizesse um get do description aq dentro desta classe porém o metodo get description está default sem public
    //E fizer um println no main, ele vai funcionar se eu instanciar esta classe client, mas se eu instanciar Adress diretamente lá, não funcionará
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //Protected
    //Duas condições para serem atendidas, devem ser estar no mesmo package ou uma permite a outra a herdar seus atributos
    //Private
    //Nada de fora consegue receber, a menos que por exemplo:
    /*
    public class Nested{ - Não pode ser static

            public void test(){
            name} - é privado
            }
     */
    /* static
    Quando um valor é declarado como estático, ele não pertence a instância
    então vai ser um valor compartilhado
    dá para fazer importação estatica: import.adress.getStaticName;
    system.out.println(getStaticName());
        final nas propriedades nao pode ser alterado e se for classe não pode ser herdada
     */
}
