package com.banquito.core.banking.transacciones.domain;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@Document(collection = "Transacciones")
public class Transaccion {
    @Id
    private String  id;
    @Field("cod_cuenta_origen")
    private String codCuentaOrigen;
    @Field("cod_cuenta_destino")
    private String codCuentaDestino;
    @Field("cod_transaccion")
    private Number codTransaccion;
    @Field("cod_unico")
    private String codUnico;
    @Field("tipo_afectacion")
    private String tipoAfectacion;
    @Field("valor_debe")
    private Float valorDebe;
    @Field("valor_haber")
    private Float valorHaber;
    @Field("tipo_transaccion")
    private String tipoTransaccion;
    private String detalle;
    @Field("fecha_creacion")
    private Date  fechaCreacion;
    private String estado;
    @Field("fecha_afectacion")
    private Date fechaAfectacion;
    @Field("fecha_ultimo_cambio")
    private Date fechaUltimoCambio;
    @Version
    private Long version;

    public Transaccion(String  id) {
        this.id = id;
    }


}
