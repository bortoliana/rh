package br.com.alura.rh.service.reajuste;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;
import br.com.alura.rh.service.reajuste.ValidacaoReajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste {

    public void validar(Funcionario funcionario, BigDecimal aumento) {
        LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
        LocalDate dataAtual = LocalDate.now();
        long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
        if (mesesDeseUltimoReajuste < 6) {
            throw new ValidacaoException("Intervalo entre reajuste menor que 6 meses!");
        }
    }
}
