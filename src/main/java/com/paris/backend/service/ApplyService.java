package com.paris.backend.service;

import com.paris.backend.model.HlShenqing;
import com.paris.backend.model.HlShenqings;

import java.util.List;

/**
 * Created by Administrator on 2017/9/21.
 */
public interface ApplyService {

    void addApply(HlShenqing hlShenqing);

    void addHlShenqings(HlShenqings hlShenqings);

    List<HlShenqing> getAllHlShenqings();

    List<HlShenqing> deleteHlShenqingById(Integer id);

    HlShenqing findHlShenqingById(Integer id);
}
