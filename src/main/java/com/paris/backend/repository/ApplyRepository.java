package com.paris.backend.repository;

import com.paris.backend.model.HlShenqing;
import com.paris.backend.model.HlShenqings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Administrator on 2017/9/21.
 *  申请表持久层
 */
@Repository("applyRepository")
public interface ApplyRepository extends JpaRepository<HlShenqing, Long> {

    @Transactional
    List<HlShenqing> deleteById(Integer id);

    HlShenqing findHlShenqingById(Integer id);
}
