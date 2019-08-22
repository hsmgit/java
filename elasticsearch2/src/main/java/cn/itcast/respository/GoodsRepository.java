package cn.itcast.respository;

import cn.itcast.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * @创建人 HSM
 * @创建时间 2019/8/20 0020 12:06
 * @描述:
 * @项目需求:
 */
public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {//自定义查询方法
    List<Goods> findByTitle(String title);

    List<Goods> findByPriceBetween(double low, double high);

    List<Goods> findByTitleAndPriceBetween(String title, double low, double high);

    List<Goods> findByTitleOrPriceBetween(String title, double low, double high);
}
