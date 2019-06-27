该项目所用组件
1.springboot
2.spring
3.springMvc
4.mybatis
5.lombok
6.druid
7.logback
8.jsp
9.mybatis的逆向工程
10.PageHelper
11.mysql



1.mysql中触发器的测试
业务需求：论坛首页board需要对每个版块的发帖数量进行统计，以及最后发帖时间进行展示

解决步骤：
1.1 创建论坛表board和帖子表article
1.2 当article中插入数据时，在论坛表中统计相应版块帖子的原有数量上+1(时间类似，不再测试)
1.3 创建触发器语句
delimiter |
create Trigger insert_article_Trigger after insert on tb_article for each row
begin
    update tb_board set article_count=article_count+1 where id= NEW.bid;
end;
|
delimiter;
说明：
触发器特性：
    1、有begin end体，begin end;之间的语句可以写的简单或者复杂

    2、什么条件会触发：I、D、U

    3、什么时候触发：在增删改前或者后

    4、触发频率：针对每一行执行

    5、触发器定义在表上，附着在表上
Trigger  触发器
insert_article_Trigger 触发器名称
after 触发条件 本例中“插入之后执行”的意思，另外还有update、delete
for each row 触发频率 表示任何一条记录上的操作满足触发事件都会触发该触发器 另外有还可以自定义事件
new 刚插入的数据，old以前的数据（在数据库中不显示）

测试：在tb_article插入1条数据，tb_board表中对应版块的统计数量就会在原有基础上+1

2.