package com.mycompany.recursividadd;

public class HanoiLogica {

    private int numDiscos;
    private StringBuilder movimientos;

    public HanoiLogica(int numDiscos) {
        this.numDiscos = numDiscos;
        this.movimientos = new StringBuilder();
    }

    public String resolverHanoi() {
        resHanoiRecursivo(numDiscos, 'A', 'C', 'B');
        return movimientos.toString();
    }

    private void resHanoiRecursivo(int n, char origen, char destino, char aux) {
        if (n > 0) {
            resHanoiRecursivo(n - 1, origen, aux, destino);
            movimientos.append("Mover disco ").append(n).append(" de ").append(origen).append(" a ").append(destino).append("\n");
            resHanoiRecursivo(n - 1, aux, destino, origen);
        }
    }
}