package com.banquito.core.banking.transacciones.domain;


import java.math.BigDecimal;
import java.time.LocalDateTime;

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
    private String id;
    @Field("cod_cuenta_origen")
    private Number codCuentaOrigen;
    @Field("cod_cuenta_destino")
    private Number codCuentaDestino;
    @Field("cod_transaccion")
    private Number codTransaccion;
    @Field("cod_unico")
    private Number codUnico;
    @Field("tipo_afectacion")
    private String tipoAfectacion;
    @Field("valor_debe")
    private BigDecimal valorDebe;
    private BigDecimal valorHaber;
    private String tipoTransaccion;
    private String detalle;
    private LocalDateTime  fechaCreacion;
    private String estado;
    private LocalDateTime  fechaAfectacion;
    private LocalDateTime  fechaUltimoCambio;
    @Version
    private Long version;

    public Transaccion(String id) {
        this.id = id;
    }

}
