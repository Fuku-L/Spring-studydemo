package org.example.support;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

// 继承 JpaRepository， 具备 JpaRepository 中所提供的方法
// 继承了 JpaSpecificationExecutor， 具备使用 Specification 的能力
@NoRepositoryBean
public interface CustomRepository<T,ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {
    Page<T> findByAuto(T example, Pageable pageable);
}
