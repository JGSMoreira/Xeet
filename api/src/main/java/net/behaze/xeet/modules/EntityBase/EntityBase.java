package net.behaze.xeet.modules.EntityBase;

import java.io.Serializable;
import java.util.Calendar;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@MappedSuperclass
@AllArgsConstructor
@Data
public class EntityBase implements Serializable{
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @JsonIgnore
    @Column(name = "excluido", columnDefinition = "BOOLEAN DEFAULT FALSE", nullable = false)
    Boolean excluido;

    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    @Column(name = "data_criacao", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = false)
    Calendar dataCriacao;


    public EntityBase() {
        this.excluido = false;
    }

}
