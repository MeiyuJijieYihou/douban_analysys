package com.yiguan.douban.service.impl;

import com.yiguan.douban.entity.Music;
import com.yiguan.douban.mapper.MusicMapper;
import com.yiguan.douban.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: chenfl
 * @Date: 2019/11/5
 * @Version: 1.0
 */
@Service
public class MusicServiceImpl implements MusicService {
    @Resource
    private MusicMapper musicMapper;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Music> findAllMusic(){
        List<Music> list = new ArrayList<>();
        list = musicMapper.selectAll();
        return list;
    }


    @Override
    public List<Map<String, Object>> findTop5Music() {
        String sql = "select music.name, count(comment.id) as comment_number\n" +
                "  from music, comment\n" +
                "  where comment.type = 3 and music.id = comment.target_id\n" +
                "  group by music.name order by comment_number desc\n" +
                "  limit 5;";
        List<Map<String, Object>> musics = jdbcTemplate.queryForList(sql);

        return musics;
    }


    @Override
    public Music findMusicById(Integer id){
        Music music = musicMapper.selectByPrimaryKey(id);
        return music;
    }

}
