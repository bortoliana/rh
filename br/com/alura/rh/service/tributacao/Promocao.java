package br.com.alura.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

    private BigDecimal valor;
    private LocalDate data;

    public Promocao(BigDecimal valor, LocalDate data) {
        this.valor = valor;
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal valorImpostoDeRenda(){
        return valor.multiply(new BigDecimal("0.1"));
    }

    @Override
    public BigDecimal valorImportoDeRenda() {
        return null;
    }
}
