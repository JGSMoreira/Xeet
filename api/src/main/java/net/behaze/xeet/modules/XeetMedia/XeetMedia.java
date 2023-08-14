package net.behaze.xeet.modules.XeetMedia;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.behaze.xeet.modules.EntityBase.EntityBase;
import net.behaze.xeet.modules.Xeet.Xeet;

@Entity
@Table(name = "xeet_media")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
@AttributeOverride(name = "id", column = @Column(name = "id_xeet_media", columnDefinition = "SERIAL"))
public class XeetMedia extends EntityBase {

    @Column(name = "xeet_media", nullable = false, columnDefinition = "bytea")
    private byte[] media;

    @Column(name = "xeet_media_tipo", length = 210, nullable = false)
    private String tipo;

    @Column(name = "xeet_media_nome", length = 210, nullable = false)
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = Xeet.class)
    @JoinColumn(name = "xeet_media_xeet_fk", referencedColumnName = "id_xeet", foreignKey = @jakarta.persistence.ForeignKey(name = "fk_xeet_media_xeet"))
    private Xeet xeet;
    
}
