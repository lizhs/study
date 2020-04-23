package cn.demo.spring.domain.old;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import cn.demo.spring.domain.entity.Person;
@Repository
@Mapper
public interface PersonDao extends BaseMapper<Person> {

}
