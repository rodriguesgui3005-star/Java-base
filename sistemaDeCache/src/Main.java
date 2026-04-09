//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Pessoa> listaBanco = new ArrayList<>();
    listaBanco.add(new Pessoa(1,"Guilherme",23));
    listaBanco.add(new Pessoa(2,"Christian",18));
    listaBanco.add(new Pessoa(3,"Daniel",30));
    listaBanco.add(new Pessoa(4,"Pedro",26));
    listaBanco.add(new Pessoa(5,"Arthur",18));



    List<Pessoa> listaCache = new ArrayList<>();


    Scanner scanner = new Scanner(System.in);
    IO.println("Digite seu id: ");
    int id = scanner.nextInt();
    boolean encontrada = false;

while (true) {
    for (Pessoa pessoa : listaCache) {
        if (pessoa.getId() == id) {
            IO.println("Pessoa encontrada no cache" + pessoa);
            encontrada = true;
        }
    }
    if (!encontrada) {
        for (Pessoa pessoa : listaBanco) {
            if (pessoa.getId() == id) {
                IO.println("Pessoa encontrada no Banco e adicionada no cache: " + pessoa);
                listaCache.add(pessoa);
                }
            }
        }
        IO.println("Digite outro ID");
        id = scanner.nextInt();
    }
}
