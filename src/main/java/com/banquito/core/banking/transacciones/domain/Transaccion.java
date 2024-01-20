package com.banquito.core.banking.transacciones.domain;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Transacciones")
public class Transaccion {
    @Id  @NonNull
    private String id;
    private Number codCuentaOrigen;
    private Number codCuentaDestino;
    private Number codTransaccion;
    private Number codUnico;
    private String tipoAfectacion;
    private Number valorDebe;
    private Number valorHaber;
    private String tipoTransaccion;
    private String detalle;
    private Date fechaCreacion;
    private String estado;
    private Date fechaAfectacion;
    private Date fechaUltimoCambio;
    @Version
    private Long version;

    public Transaccion(String id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Transaccion other = (Transaccion) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Transaccion [id=" + id + ", codCuentaOrigen=" + codCuentaOrigen + ", codCuentaDestino="
                + codCuentaDestino + ", codTransaccion=" + codTransaccion + ", codUnico=" + codUnico
                + ", tipoAfectacion=" + tipoAfectacion + ", valorDebe=" + valorDebe + ", valorHaber=" + valorHaber
                + ", tipoTransaccion=" + tipoTransaccion + ", detalle=" + detalle + ", fechaCreacion=" + fechaCreacion
                + ", estado=" + estado + ", fechaAfectacion=" + fechaAfectacion + ", fechaUltimoCambio="
                + fechaUltimoCambio + ", version=" + version + "]";
    }

    

    

}
