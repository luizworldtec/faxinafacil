package br.com.faxinafacil.exceptions;

public class ServicoInvalidoException extends RuntimeException {
    public ServicoInvalidoException(String message) {
        super(message);
    }
}
