
package tech.cbm.dio.fluxo.model;

import tech.cbm.dio.fluxo.exceptions.ParametrosInvalidosException;

public class ContadorModel {
    private int parametroUm;
    private int parametroDois;

    public void setParametros(int parametroUm, int parametroDois) {
        this.parametroUm = parametroUm;
        this.parametroDois = parametroDois;
    }

    public void contar() throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }

        System.out.println("Contagem dos números:");
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}