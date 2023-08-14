package net.behaze.xeet.modules.Xeet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.transaction.Transactional;
import net.behaze.xeet.modules.Xeet.dtos.XeetDTO;

@Controller
@RequestMapping("/xeet")
public class XeetController {
    
    @Autowired
    XeetRepository xeetRepository;

    @Autowired
    XeetMapper xeetMapper;

    @GetMapping
    public ResponseEntity<List<Xeet>> index(){
        return ResponseEntity.ok(xeetRepository.findAll());
    }

    @PostMapping
    @Transactional
    public ResponseEntity<Object> store(XeetDTO xeet){
        Xeet xeetEntity = xeetMapper.toEntity(xeet);

        return ResponseEntity.ok(xeetRepository.save(xeetEntity));
    }

    @PostMapping("/editar/{id}")
    @Transactional
    public ResponseEntity<Object> update(@PathVariable Long id, XeetDTO xeet){
        Xeet xeetEntity = xeetRepository.findById(id).get();
        xeetEntity.setConteudo(xeet.getConteudo());

        return ResponseEntity.ok(xeetRepository.save(xeetEntity));
    }
}
