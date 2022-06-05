package TrabalhandoComCollectionsJava.Lists.Aula9;

import java.util.Comparator;

public class ComparatorCor implements Comparator<OrdenarList_1> {

    @Override
    public int compare(OrdenarList_1 g1, OrdenarList_1 g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
