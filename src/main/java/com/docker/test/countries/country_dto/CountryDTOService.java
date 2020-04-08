package com.docker.test.countries.country_dto;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryDTOService {

    public List<CountryDTO> convertToDTOList(List<String> list) {

        List<CountryDTO> listDTO = new ArrayList<>();
        for (String l : list) {
            listDTO.add(new CountryDTO(l.split(",")));
        }

        return listDTO;
    }
}
