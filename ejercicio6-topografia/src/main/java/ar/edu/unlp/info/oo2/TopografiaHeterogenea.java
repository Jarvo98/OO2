package ar.edu.unlp.info.oo2;

import java.util.ArrayList;
import java.util.List;

public class TopografiaHeterogenea implements Topografia {
    private List<Topografia> topografiasInternas;

    public TopografiaHeterogenea(Topografia topografia1, Topografia topografia2, Topografia topografia3, Topografia topografia4) {
        this.topografiasInternas = new ArrayList<Topografia>();
        this.topografiasInternas.add(topografia1);
        this.topografiasInternas.add(topografia2);
        this.topografiasInternas.add(topografia3);
        this.topografiasInternas.add(topografia4);
    }

    @Override
    public double calcularProporcion() {
        return this.topografiasInternas
                .stream()
                .mapToDouble(topografia -> topografia.calcularProporcion())
                .sum()
                / this.topografiasInternas.size();
    }

    @Override
    public boolean equals(Topografia topografia) {
        return topografia.equals(this);
    }

    public boolean equals(TopografiaHeterogenea topografiaHeterogenea) {
        boolean equal = true;

        for (int i = 0; i < this.topografiasInternas.size(); i++) {
            equal = equal && this.topografiasInternas.get(i).equals(topografiaHeterogenea.topografiasInternas.get(i));
        }

        return equal;
    }
}
