package com.banquito.core.banking.transacciones.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.banquito.core.banking.transacciones.domain.Transaccion;

public interface TransaccionRepository extends MongoRepository<Transaccion, String>{

}
