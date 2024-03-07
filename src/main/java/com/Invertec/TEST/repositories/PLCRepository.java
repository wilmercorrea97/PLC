package com.Invertec.TEST.repositories;

import com.Invertec.TEST.models.DatosJoin;
import com.Invertec.TEST.models.mqttlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PLCRepository extends JpaRepository<mqttlog, Long> {

    @Query(value = "SELECT a.id, a.ServerTimestamp, b.Planta, a.\"group\", b.Descripcion_Grupo, a.source, b.Descripcion_TAG, a.value " +
            "FROM dbo.mqttlogs AS a " +
            "INNER JOIN dbo.DicDat AS b ON b.grupo = a.\"group\" AND b.fuente = a.source " +
            "WHERE CONVERT(date, a.serverTimestamp) = CONVERT(date, DATEADD(day, -3, GETDATE())) " +
            "AND b.planta = 'NATURAL' " +
            "AND b.Descripcion_Grupo = 'Caldera'", nativeQuery = true)
    List<DatosJoin> obtenerDatosJoin();

}
