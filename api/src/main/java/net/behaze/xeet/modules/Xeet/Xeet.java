package net.behaze.xeet.modules.Xeet;

import java.util.List;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;
import net.behaze.xeet.modules.XeetMedia.XeetMedia;

@Entity
@Table(name = "xeet")
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@AttributeOverride(name = "id", column = @Column(name = "id_xeet", columnDefinition = "SERIAL"))
public class Xeet extends EntityBase{

    @Column(name = "xeet_conteudo", length = 210, nullable = false)
    String conteudo;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "xeet")
    List<XeetMedia> media;

}
