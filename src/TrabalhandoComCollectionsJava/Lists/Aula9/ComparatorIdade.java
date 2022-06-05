package TrabalhandoComCollectionsJava.Lists.Aula9;

import java.util.Comparator;

public class ComparatorIdade implements Comparator<OrdenarList_1> {

    @Override
    public int compare(OrdenarList_1 g1, OrdenarList_1 g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}
