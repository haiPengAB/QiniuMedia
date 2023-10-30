package com.nwpu.qiniumedia.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nwpu.qiniumedia.Mapper.VideoMapper;
import com.nwpu.qiniumedia.entity.Video;
import com.nwpu.qiniumedia.service.IVideoService;
import org.springframework.stereotype.Service;

@Service
public class VideoServiceImpl extends ServiceImpl<VideoMapper, Video> implements IVideoService {

}
