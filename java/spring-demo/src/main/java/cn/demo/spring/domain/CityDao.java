package cn.demo.spring.domain;

import org.apache.ibatis.annotations.Mapper;

import cn.demo.spring.domain.entity.City;
import cn.pomit.jpamapper.core.mapper.CrudMapper;
//CrudMapper JMapper
@Mapper
public interface CityDao  extends CrudMapper<City, Long>{
	 City findByState(String aa);
	 City findByStateAndid(String aa,Long b);
	 City findByStateOrid(String aa,Long b);
}
