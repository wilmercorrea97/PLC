package com.Invertec.TEST;

import com.Invertec.TEST.models.DatosJoin;
import com.Invertec.TEST.repositories.PLCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PLCService {

    private final PLCRepository plcRepository;

    @Autowired
    public PLCService(PLCRepository plcRepository){
        this.plcRepository = plcRepository;
    }

    public List<DatosJoin> obtenerDatosJoin(){
        List<DatosJoin> datosJoinList = plcRepository.obtenerDatosJoin();

        System.out.println("Resultados de la consulta:");
        for (DatosJoin datosJoin : datosJoinList) {
            System.out.println("ID: " + datosJoin.getId());
            System.out.println("ServerTimestamp: " + datosJoin.getServerTimestamp());
            // Continúa imprimiendo los demás campos de DatosJoin de manera similar
        }

        return datosJoinList;
    }
}
