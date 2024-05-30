package ex03;

import ex03.lib.Outerdock;

public class DockAdapter extends Animal{

    private Outerdock outerdock;

    public DockAdapter(Outerdock outerdock) {
        this.outerdock = outerdock;
    }

    @Override
    public String getName() {
        return outerdock.getOuteranimal();
    }
}
