package TrabalhandoComCollectionsJava.Lists.Exercicio2;

import java.util.*;

public class Crime {

    Scanner escreva = new Scanner(System.in);
    List<String> listaCrime = new ArrayList<>();

    public void perguntas() {
        System.out.print("\nResponda Sim ou Não." + "\nTelefonou pra vítima: ");
        String resposta = escreva.nextLine();
        listaCrime.add(resposta.toLowerCase());

        System.out.print("\nEsteve no local do crime: ");
        resposta = String.valueOf(escreva.nextLine().equalsIgnoreCase("S"));
        listaCrime.add(resposta.toLowerCase());

        System.out.print("\nMora perto daa vítima: ");
        resposta = escreva.nextLine();
        listaCrime.add(resposta.toLowerCase());

        System.out.print("\nDevia pra vítima: ");
        resposta = escreva.nextLine();
        listaCrime.add(resposta.toLowerCase());

        System.out.print("\nJá trabalhou com a vítiima: ");
        resposta = escreva.nextLine();
        listaCrime.add(resposta.toLowerCase());
    }

    public void calculoVezesSim() {
        Iterator<String> contador = listaCrime.iterator();
        int cont = 0;
        while (contador.hasNext()) {
            String resposta = contador.next();
            if (resposta.contains("s")) {
                cont++;
            }
        }

        switch (cont) {
            case 2 -> System.out.println("SUSPEITO!");
            case 3, 4 -> System.out.println("CÚMPLICE!");
            case 5 -> System.out.println("ASSASSINO!");
            default -> System.out.println("INOCENTE!");
        }
    }
}
