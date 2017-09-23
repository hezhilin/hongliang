package com.paris.backend.service;

import com.paris.backend.model.HlShenqing;
import com.paris.backend.model.HlShenqings;
import com.paris.backend.repository.ApplyRepository;
import com.paris.backend.repository.HlShenqingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/9/21.
 * 申请管理业务层
 */
@Service("applyService")
public class ApplyServiceImpl implements ApplyService{

    @Autowired
    private ApplyRepository applyRepository;

    @Autowired
    private HlShenqingsRepository hlShenqingsRepository;

    @Override
    public void addApply(HlShenqing hlShenqing) {
        applyRepository.save(applyRepository.save(hlShenqing));
    }

    @Override
    public void addHlShenqings(HlShenqings hlShenqings) {
        hlShenqingsRepository.save(hlShenqings);
    }
}
