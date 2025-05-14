public static void associarLivroAutor() {
    System.out.println("Associar Livro a Autor");
    interfaceListaLivro(0);
    System.out.print("Selecione o ID do Livro: ");
    Scanner scanner = new Scanner(System.in);
    int idLivro = scanner.nextInt();
    Livro livro = Settings.livros.get(idLivro - 1);

    interfaceListaAutor(0);
    System.out.print("Selecione o ID do Autor: ");
    int idAutor = scanner.nextInt();
    Autor autor = Settings.autores.get(idAutor - 1);

    livro.setAutor(autor);
    System.out.println("Associação realizada com sucesso!");
    interfaceMenuLivro();
}