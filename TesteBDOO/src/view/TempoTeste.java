package view;

import util.Cronometro;

public class TempoTeste {

    private Cronometro tempoInsert;
    private Cronometro tempoSelect;
    private Cronometro tempoUpdate;
    private Cronometro tempoDelete;

    public Cronometro getTempoInsert() {
        return tempoInsert;
    }

    public void setTempoInsert(Cronometro tempoInsert) {
        this.tempoInsert = tempoInsert;
    }

    public Cronometro getTempoSelect() {
        return tempoSelect;
    }

    public void setTempoSelect(Cronometro tempoSelect) {
        this.tempoSelect = tempoSelect;
    }

    public Cronometro getTempoUpdate() {
        return tempoUpdate;
    }

    public void setTempoUpdate(Cronometro tempoUpdate) {
        this.tempoUpdate = tempoUpdate;
    }

    public Cronometro getTempoDelete() {
        return tempoDelete;
    }

    public void setTempoDelete(Cronometro tempoDelete) {
        this.tempoDelete = tempoDelete;
    }

}
