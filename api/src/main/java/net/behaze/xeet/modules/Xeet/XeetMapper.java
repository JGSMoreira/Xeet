
package net.behaze.xeet.modules.Xeet;

import org.mapstruct.Mapper;

import net.behaze.xeet.modules.Xeet.dtos.XeetDTO;
import net.behaze.xeet.modules.crud.BaseMapping;
import net.behaze.xeet.modules.crud.DTOMapper;

@Mapper(componentModel = "spring")
public abstract class XeetMapper implements DTOMapper<Xeet, XeetDTO>{

    @Override
    @BaseMapping
    public abstract Xeet toEntity(XeetDTO xeet);

}