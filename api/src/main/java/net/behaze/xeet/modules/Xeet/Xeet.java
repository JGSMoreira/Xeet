package net.behaze.xeet.modules.Xeet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import net.behaze.xeet.modules.EntityBase.EntityBase;

@Entity
@Table(name = "xeet")
public class Xeet extends EntityBase{

    @Column(name = "xeet_conteudo", length = 210)
    String conteudo;
}
