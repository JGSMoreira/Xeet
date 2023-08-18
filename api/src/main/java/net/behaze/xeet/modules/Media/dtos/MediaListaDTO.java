package net.behaze.xeet.modules.Media.dtos;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaListaDTO {
    
    @Id
    Long id;

    String tipo;

    String nome;

    Long idXeet;
}
