package cn.itcast.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @创建人 HSM
 * @创建时间 2019/8/20 0020 9:27
 * @描述:
 * @项目需求:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    private Long id;   //不分词
    private String title; //标题  //分词 类型是text ik_max_word  index=true store=true
    private String category;// 分类 //不分词 类型 keyword  index=true store=true
    private String brand; // 品牌    //不分词 类型 keyword  index=true store=true
    private Double price; // 价格   //不分词 类型 double  index=true store=true
    private String images; // 图片地址  //不分词 类型 keyword  index=false store=true
}
