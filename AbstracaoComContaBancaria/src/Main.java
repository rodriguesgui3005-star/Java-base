//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Cc cc = new Cc();
    Pj pj = new Pj();
    Cp cp = new Cp();


    cc.setSaldo(7000);
    pj.setSaldo(10000);
    cp.setSaldo(20000);

    pj.sacar(30);

}
