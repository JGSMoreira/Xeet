package net.behaze.xeet.modules.Media;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.springframework.beans.factory.annotation.Autowired;

import net.behaze.xeet.modules.Media.dtos.MediaDTO;
import net.behaze.xeet.modules.Xeet.Xeet;
import net.behaze.xeet.modules.Xeet.XeetRepository;
import net.behaze.xeet.modules.crud.BaseMapping;
import net.behaze.xeet.modules.crud.DTOMapper;

@Mapper(componentModel = "spring")
public abstract class MediaMapper implements DTOMapper<Media, MediaDTO>{

    @Autowired
    XeetRepository xeetRepository;

    @Override
    @BaseMapping
    @Mapping(target = "media", ignore = true)
    @Mapping(target = "nome", ignore = true)
    @Mapping(target = "xeet", source = "idXeet", qualifiedByName = "mapXeet")
    public abstract Media toEntity(MediaDTO media);

    @Named("mapXeet")
    public Xeet mapXeet(Long id){
        System.out.println("\n\nid: " + id);
        if (id != null)
            return xeetRepository.getReferenceById(id);
        return null;
    }
}
