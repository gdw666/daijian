package shop.daijian.platform.entity;

import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
import java.util.List;

/**
 * @Author stronghwan
 * @Verison
 * @Date2019/8/13-17-04
 */
@Data
@Accessors(chain = true)
@Document(indexName = "note",type = "_doc",shards = 1, replicas = 0,createIndex = false)
public class Note {

    @Field(type = FieldType.Text, analyzer = "ik_smart")
    private String keyword;
    /**
     * 用户手记ID
     */
    @Id
    private String notesId;

    /**
     * 用户ID
     */
    private String userId;

    /**
     * 庄园头像链接
     */
    private String manorAvatarUrl;

    /**
     * 庄园名
     */
    private String manorName;

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 封面图
     */
    private String coverImageUrl;

    /**
     * 标题
     */
    private String title;

    /**
     * 点赞数
     */
    private Integer likeNum;

    /**
     * 浏览量
     */
    private Integer viewNum;

    /**
     * 评论数
     */
    private Integer commentNum;

    /**
     * 创建时间
     */
    private Date createTime;

    private List<NoteSuggest> suggests;
}
