package com.TimeDateFormat.Service;

import com.TimeDateFormat.entity.BusOperator;
import com.TimeDateFormat.payload.BusOperatorDto;
import com.TimeDateFormat.repository.Repository1;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
@Service
public class ServiceImpl{

    @Autowired
    private Repository1 repo;

    @Autowired
    private ModelMapper modelMapper;

    public BusOperatorDto save(BusOperatorDto busOperatorDto) {

       BusOperator entity = mapToEntity(busOperatorDto);

        BusOperator save = repo.save(entity);

        BusOperatorDto dto = mapToDto(save);

        return dto;
    }

    private BusOperatorDto mapToDto(BusOperator save) {

        BusOperatorDto dto = modelMapper.map(save, BusOperatorDto.class);

        return dto;
    }

    private BusOperator mapToEntity(BusOperatorDto busOperatorDto) {

        BusOperator entity = modelMapper.map(busOperatorDto, BusOperator.class);

        return entity;

    }


}
