package br.univali.portugol.nucleo.analise.sintatica.erros;

import br.univali.portugol.nucleo.mensagens.ErroSintatico;

public class ErroCaracterInvalidoReferencia extends ErroSintatico
{
    
    String caracter;

    public ErroCaracterInvalidoReferencia(int linha, int coluna, String caracter)
    {
        super(linha, coluna);
        this.caracter = caracter;
    }
       

    @Override
    protected String construirMensagem()
    {
        return "O caracter '"+caracter+"' não é reconhecido em uma referência";
    }
    
}
