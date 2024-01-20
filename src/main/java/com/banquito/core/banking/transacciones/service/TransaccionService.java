package com.banquito.core.banking.transacciones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.banquito.core.banking.transacciones.dao.TransaccionRepository;
import com.banquito.core.banking.transacciones.domain.Transaccion;

@Service
public class TransaccionService {

    private final TransaccionRepository transaccionRepository;

    public TransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    // public void guardar(Transaccion transaccion){
    //     transaccionRepository.save(transaccion);
    // }

    public List<Transaccion> listarTodo(){
        return transaccionRepository.findAll(); 
    }

    

}
