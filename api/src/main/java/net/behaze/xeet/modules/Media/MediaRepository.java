package net.behaze.xeet.modules.Media;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.behaze.xeet.modules.Media.dtos.MediaListaDTO;
import net.behaze.xeet.modules.crud.BaseRepository;

@Repository
public interface MediaRepository extends BaseRepository<Media, Long>{

    @Query("SELECT new net.behaze.xeet.modules.Media.dtos.MediaListaDTO(m.id, m.tipo, m.nome, m.xeet.id) FROM Media m")
    List<MediaListaDTO> findAllMediaDTO();
    
}
