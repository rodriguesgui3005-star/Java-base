//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


        Mago mago = new Mago();

        Arqueiro arqueiro = new Arqueiro();

        Guerreiro guerreiro = new Guerreiro();
        guerreiro.mostrarStatus();
        IO.println("Gideon atacou kratos");
        IO.println("kratos recebeu: " + mago.atacar());
        guerreiro.receberDano(mago.atacar());


}
