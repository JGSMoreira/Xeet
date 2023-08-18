package net.behaze.xeet.modules.Media;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import net.behaze.xeet.modules.Media.dtos.MediaDTO;
import net.behaze.xeet.modules.Media.dtos.MediaListaDTO;
import net.behaze.xeet.modules.Xeet.Xeet;
import net.behaze.xeet.modules.Xeet.XeetMapper;
import net.behaze.xeet.modules.Xeet.XeetRepository;
import net.behaze.xeet.modules.Xeet.dtos.XeetDTO;

@RestController
@RequestMapping("/media")
public class MediaController {
    @Autowired
    MediaRepository mediaRepository;

    @Autowired
    MediaMapper mediaMapper;

    @GetMapping
    public ResponseEntity<List<MediaListaDTO>> index(){
        return null;
        // return ResponseEntity.ok(mediaRepository.findAll());    
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Object> store(MediaDTO media){
        Media mediaEntity = mediaMapper.toEntity(media);

        return ResponseEntity.ok(mediaRepository.save(mediaEntity));
    }
}
