public static void interfaceListaAutor(int action) {
    System.out.println("Lista de Autores");
    for (Autor autor : Settings.autores) {
        System.out.println(autor.getId() + " - " + autor.getNome());
    }

    if (action == 1) {
        System.out.print("Selecione o ID a alterar ou 0 para voltar: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id != 0) {
            Autor autor = Settings.autores.get(id - 1);
            interfaceEditAutor(autor, 1);
        }
    } else if (action == 2) {
        System.out.print("Selecione o ID a eliminar ou 0 para voltar: ");
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        if (id != 0) {
            Settings.autores.remove(id - 1);
        }
    }
}

public static void interfaceEditAutor(Autor autor, int action) {
    if (action == 0) {
        // Inserir novo autor
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.next();

        autor = new Autor(Settings.autores.size() + 1, nome, idade, nacionalidade);
        Settings.autores.add(autor);
    } else if (action == 1) {
        // Alterar autor existente
        Scanner scanner = new Scanner(System.in);
        System.out.println("Alterar Autor: " + autor.getNome());
        System.out.print("Novo Nome: ");
        String nome = scanner.nextLine();
        if (!nome.isEmpty()) autor.setNome(nome);

        System.out.print("Nova Idade: ");
        int idade = scanner.nextInt();
        autor.setIdade(idade);

        System.out.print("Nova Nacionalidade: ");
        String nacionalidade = scanner.next();
        autor.setNacionalidade(nacionalidade);
    }
    interfaceMenuAutor();
}