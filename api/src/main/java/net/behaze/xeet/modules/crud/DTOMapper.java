package net.behaze.xeet.modules.crud;

import org.mapstruct.InheritConfiguration;
import org.mapstruct.MappingTarget;

import net.behaze.xeet.modules.EntityBase.EntityBase;


public interface DTOMapper<E extends EntityBase, D> {
  /**
   * Salva uma entidade a partir de um DTO. É um método utilizado dentro do store do CrudController.
   * Deve ser retornado apenas a entidade, a ação de salvar é feita dentro do CrudController.
   * 
   * @param dto
   * @return entidade criada a partir do dto.
   */
  @BaseMapping
  E toEntity(D dto);

  /**
   * Método que atualiza a entidade baseada em um DTO. Esse método é utilizado dentro do update do
   * CrudController. Deve ser retornado apenas a entidade, a ação de salvar é feita dentro do
   * CrudController.
   * 
   * @param entidade a entidade a ser atualizada.
   * @param dto      o dto usado para atualizar.
   * @return a entidade atualizada.
   */
  @InheritConfiguration(name = "toEntity")
  E updateFromDto(@MappingTarget E entidade, D dto);
}