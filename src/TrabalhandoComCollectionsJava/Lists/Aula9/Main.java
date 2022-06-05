package TrabalhandoComCollectionsJava.Lists.Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<OrdenarList_1> gatos = new ArrayList<>();
        gatos.add(new OrdenarList_1("Joao", "Amarelo", 9));
        gatos.add(new OrdenarList_1("Paçoca", "Ciamês", 5));

        System.out.println("\nExibir por ordem de iserção:");
        System.out.println(gatos);

        System.out.println("\nExibir embaralhado:");
        Collections.shuffle(gatos);
        System.out.println(gatos);

        System.out.println("\nExibir ordem por nome:");
        Collections.sort(gatos, new ComparatorNome());
        System.out.println(gatos);

        System.out.println("\nExibir ordem por Idade:");
        Collections.sort(gatos, new ComparatorIdade());
        System.out.println(gatos);

        System.out.println("\nExibir ordem por Cor:");
        Collections.sort(gatos, new ComparatorCor());
        System.out.println(gatos);
    }
}
