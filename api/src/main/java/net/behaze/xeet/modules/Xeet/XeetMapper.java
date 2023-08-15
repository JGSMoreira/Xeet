
package net.behaze.xeet.modules.Xeet;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.beans.factory.annotation.Autowired;

import net.behaze.xeet.modules.Xeet.dtos.XeetDTO;
import net.behaze.xeet.modules.XeetMedia.Media;
import net.behaze.xeet.modules.XeetMedia.XeetMediaRepository;
import net.behaze.xeet.modules.crud.BaseMapping;
import net.behaze.xeet.modules.crud.DTOMapper;

@Mapper(componentModel = "spring", uses = { Media.class})
public abstract class XeetMapper implements DTOMapper<Xeet, XeetDTO>{

    // @Autowired
    // XeetMediaRepository xeetMediaRepository;

    @Override
    @BaseMapping
    public abstract Xeet toEntity(XeetDTO xeet);

    // public XeetMedia mapMedia(Long id){
    //     if (id != null)
    //         return xeetMediaRepository.getReferenceById(id);
    //     return null;
    // }

}