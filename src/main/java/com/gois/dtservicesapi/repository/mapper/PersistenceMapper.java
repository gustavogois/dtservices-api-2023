package com.gois.dtservicesapi.repository.mapper;

import com.gois.dtservicesapi.model.ProcessDT;
import com.gois.dtservicesapi.repository.data.ProcessData;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public abstract class PersistenceMapper {

    public static final PersistenceMapper INSTANCE = Mappers.getMapper(PersistenceMapper.class);

    public abstract ProcessData toData(ProcessDT produitCarte);

    public abstract ProcessDT fromData(ProcessData produitCarteData);
}
