package com.example.clase4.shopping;

public enum ErrorMessage {
    NOT_VALID_PRODUCT_EXCEPTION("El producto a agregar no es valido."),
    NOT_VALID_PRODUCT_QUANTITY_EXCEPTION("La cantidad de productos a agregar no es valida."),
    NOT_VALID_TELEFONO_EXCEPTION("contacto o telefono no encontrado");


    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
