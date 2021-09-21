package br.com.BeerStock.api.mapper;

import br.com.BeerStock.api.dto.BeerDTO;
import br.com.BeerStock.api.model.Beer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}
