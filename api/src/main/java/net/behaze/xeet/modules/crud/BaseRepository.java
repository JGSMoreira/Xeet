package net.behaze.xeet.modules.crud;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.NoRepositoryBean;

import net.behaze.xeet.modules.EntityBase.EntityBase;
import th.co.geniustree.springdata.jpa.repository.JpaSpecificationExecutorWithProjection;

@NoRepositoryBean
public interface BaseRepository<T extends EntityBase, Id> 
        extends JpaRepositoryImplementation<T, Id>, JpaSpecificationExecutorWithProjection<T, Id> {
        
}
