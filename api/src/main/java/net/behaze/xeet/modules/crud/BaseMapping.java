package net.behaze.xeet.modules.crud;

import org.mapstruct.Mapping;

@Mapping(target = "id", ignore = true)
@Mapping(target = "dataCriacao", ignore = true)
@Mapping(target = "excluido", ignore = true)
public @interface BaseMapping {
    
}
